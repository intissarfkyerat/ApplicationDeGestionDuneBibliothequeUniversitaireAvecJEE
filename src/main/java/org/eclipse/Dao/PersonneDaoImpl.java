package org.eclipse.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.bean.Personne;

public  class PersonneDaoImpl implements PersonneDao{

	@Override
	public Personne save(Personne personne)throws SQLException {
		Connection c = MySqlConnection.getConnection();
		try {
		PreparedStatement ps = c.prepareStatement("INSERT INTO personne (nom,prenom,mail,profile,pwd) VALUES (?,?,?,?,?);");
		ps.setString(1, personne.getNom());
		ps.setString(2, personne.getPrenom());
		ps.setString(3, personne.getMail());
		ps.setString(4, personne.getProfile());
		ps.setString(5, personne.getPwd());
		ps.executeUpdate();
	    ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return null;
	}
    @Override
	public Personne findByEmail(String mail)throws SQLException{
		Personne personne = null;
		Connection c = MySqlConnection.getConnection();
		if (c != null) {
		try {
		PreparedStatement ps = c.prepareStatement("SELECT * FROM personne WHERE mail=?;");
		ps.setString(1, mail);
		ResultSet r = ps.executeQuery();
		if (r.next()) {
		personne = new Personne( r.getString("mail"), r.getString("pwd"));
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		return personne;
	}
	@Override
	public void remove(int id )throws SQLException{
		Connection c = MySqlConnection.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("DELETE FROM personne WHERE id=?;");
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
	}
	@Override
	public Personne update(Personne personne) throws SQLException {
		Connection c = MySqlConnection.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE personne SET nom=?, prenom=?, mail=?, profile=?, pwd=? WHERE id=?;");
            ps.setString(1, personne.getNom());
            ps.setString(2, personne.getPrenom());
            ps.setString(3, personne.getMail());
            ps.setString(4, personne.getProfile());
            ps.setString(5, personne.getPwd());
            ps.setInt(6, personne.getId());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return null;
	}
	@Override
	public List<Personne> getAll() throws SQLException {
		Connection cn = MySqlConnection.getConnection();
		PreparedStatement ps;
		List<Personne> liste = new ArrayList<>();
		

        try {
        	ps = cn.prepareStatement("SELECT * FROM personne");
    		ResultSet rs = ps.executeQuery();

            while (rs.next()) {              
                Personne personne = new Personne();
                personne.setId(rs.getInt("id"));
                personne.setNom(rs.getString("nom"));
                personne.setPrenom(rs.getString("prenom"));
                personne.setMail(rs.getString("mail"));
                personne.setProfile(rs.getString("profile"));
                personne.setPwd(rs.getString("pwd"));
                liste.add(personne);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return liste;
	}

	 

}
