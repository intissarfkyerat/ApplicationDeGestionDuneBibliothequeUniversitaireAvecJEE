package org.eclipse.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.eclipse.bean.Penality;

public class PenaliteDaoImpl implements PenaliteDao {

	@Override
	public Penality save(Penality penality)throws SQLException {
		Connection c = MySqlConnection.getConnection();
		try {
		PreparedStatement ps = c.prepareStatement("INSERT INTO penalite (codepe,codead,penalite) VALUES (?,?,?); ");
		ps.setString(1, penality.getCodepe());
		ps.setString(2, penality.getCodead());
		ps.setString(3, penality.getPenalite());
		ps.executeUpdate();
		ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return null;
	}

	@Override
	public void remove(int id)throws SQLException {
		Connection c = MySqlConnection.getConnection();
		try {
		PreparedStatement ps = c.prepareStatement("DELETE FROM penalite WHERE id=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}

	@Override
	public Penality update(Penality penality)throws SQLException {
		Connection c = MySqlConnection.getConnection();
		try {
		PreparedStatement ps = c.prepareStatement("UPDATE penalite SET codepe=?, codead=?, penalite=? WHERE id=?;");
		ps.setString(1, penality.getCodepe());
		ps.setString(2, penality.getCodead());
		ps.setString(3, penality.getPenalite());
		ps.setInt(4, penality.getId());
		ps.executeUpdate();
		ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return null;
	}

	@Override
	public Penality findById(int id)throws SQLException {
		Penality penality = null;
		Connection c = MySqlConnection.getConnection();
		if (c != null) {
		try {
		String request = "SELECT * FROM penalite WHERE id = ?;";
		PreparedStatement ps = c.prepareStatement(request);
		ps.setInt(1, id);
		ResultSet r = ps.executeQuery();
		if (r.next()) {
		penality = new Penality(r.getString("codepe"), r.getString("codead"), r.getString("penalite"));
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		return penality;
	}

	@Override
	public List<Penality> getAll()throws SQLException {
		Connection cn = MySqlConnection.getConnection();
		PreparedStatement ps;
		List<Penality> liste = new ArrayList<Penality>();
		

        try {
        	ps = cn.prepareStatement("SELECT * FROM penalite");
    		ResultSet rs = ps.executeQuery();
           

            while (rs.next()) {
                Penality penality = new Penality();
                penality.setId(rs.getInt("id"));
                penality.setCodepe(rs.getString("codepe"));
                penality.setCodead(rs.getString("codead"));
                penality.setPenalite(rs.getString("penalite"));
                liste.add(penality);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return liste;
		
	}

	

}
