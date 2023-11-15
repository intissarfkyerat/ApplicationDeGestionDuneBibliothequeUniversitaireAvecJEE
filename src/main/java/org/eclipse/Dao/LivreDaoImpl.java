package org.eclipse.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.bean.Livre;


 
public class LivreDaoImpl implements LivreDao {

	@Override
	public Livre save(Livre livre)throws SQLException {
		Connection c = MySqlConnection.getConnection();
		try {
		    PreparedStatement ps = c.prepareStatement("INSERT INTO livre (titre,langue,auteur,prix) VALUES (?,?,?,?); ");
		    ps.setString(1, livre.getTitre());
		    ps.setString(2, livre.getLangue());
		    ps.setString(3, livre.getAuteur());
		    ps.setString(4, livre.getPrix());
		    ps.executeUpdate();
		    ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return null;
	}

	@Override
	public void remove(int code) {
		Connection c = MySqlConnection.getConnection();
		
		try {
		PreparedStatement ps = c.prepareStatement("DELETE FROM livre WHERE code=?");
		ps.setInt(1, code);
		ps.executeUpdate();
		ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}

	@Override
	public Livre update(Livre livre)throws SQLException {
		   Connection c = MySqlConnection.getConnection();
	        try {
		   PreparedStatement ps = c.prepareStatement("UPDATE livre SET titre=?, langue=?, auteur=?, prix=? WHERE code=?");
	        
			ps.setString(1, livre.getTitre());
			ps.setString(2, livre.getLangue());
			ps.setString(3, livre.getAuteur());
			ps.setString(4, livre.getPrix()); 
			ps.setInt(5, livre.getCode()); 
	        ps.executeUpdate();
	        ps.close();
	      }catch (SQLException e) {
		    e.printStackTrace();
		  }
	        return null;
	}

	@Override
	public List<Livre> getAll()throws SQLException {
		Connection cn = MySqlConnection.getConnection();
		PreparedStatement ps;
		
		List <Livre> liste = new ArrayList<>();
		
		try {
			
		ps = cn.prepareStatement("SELECT * FROM livre");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Livre l = new Livre();
			l.setCode(rs.getInt("code"));
			l.setTitre(rs.getString("titre"));
			l.setLangue(rs.getString("langue"));
			l.setAuteur(rs.getString("auteur"));
			l.setPrix(rs.getString("prix"));        
			liste.add(l);
		}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Livre findById(int code)throws SQLException {
		Livre livre = null;
		Connection c = MySqlConnection.getConnection();
		if (c != null) {
		try {
		String request = "SELECT * FROM livre WHERE code = ?";
		PreparedStatement ps = c.prepareStatement(request);
		ps.setInt(1, code);
		ResultSet r = ps.executeQuery();
		ps.close();
		if (r.next()) {
		livre = new Livre(r.getString("titre"), r.getString("langue"), r.getString("auteur"), r.getString("prix"));
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		return livre;
	}

	@Override
	public List<Livre> getLivreParMC(String mc)throws SQLException {
		Connection cn = MySqlConnection.getConnection();
		PreparedStatement ps;
		List <Livre> liste = new ArrayList<>();
		try {			
			ps = cn.prepareStatement("SELECT * FROM livre WHERE titre LIKE ? OR auteur LIKE ? OR langue LIKE ?");
			ps.setString(1,"%"+mc+"%");
			ps.setString(2,"%"+mc+"%");
			ps.setString(3,"%"+mc+"%");
			ResultSet rs = ps.executeQuery();			
			while (rs.next()) {
				Livre livre = new Livre();
				livre.setCode(rs.getInt("code"));
				livre.setTitre(rs.getString("titre"));
				livre.setLangue(rs.getString("langue"));
				livre.setAuteur(rs.getString("auteur"));
				livre.setPrix(rs.getString("prix"));        
				liste.add(livre);
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return liste;
	}
	@Override
	public List<Livre> getLivresPopulaires() throws SQLException {
        List<Livre> livres = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection c = MySqlConnection.getConnection();
        try {
            statement = c.prepareStatement("SELECT * FROM emprunte GROUP BY livre_id ORDER BY COUNT(*) ?");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Livre livre = new Livre();
                livre.setCode(resultSet.getInt("id"));
                livre.setTitre(resultSet.getString("titre"));
                livre.setAuteur(resultSet.getString("auteur"));
                livres.add(livre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return livres;
    }
	@Override
    public Livre getLivreMoinsEmprunte() throws SQLException {
        Livre livre = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection c = MySqlConnection.getConnection();
        try {
            statement = c.prepareStatement("SELECT * FROM livre WHERE code NOT IN (SELECT livre_id FROM emprunte) ORDER BY id ASC LIMIT 1");
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                livre = new Livre();
                livre.setCode(resultSet.getInt("code"));
                livre.setTitre(resultSet.getString("titre"));
                livre.setAuteur(resultSet.getString("auteur"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return livre;
    }

@Override
public boolean reserveBook(int bookId) throws SQLException {
	
        return true;
    
}
}
