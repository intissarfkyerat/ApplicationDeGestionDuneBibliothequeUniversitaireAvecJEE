package org.eclipse.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.eclipse.bean.Loans;

public class LoansDaoImpl implements LoansDao {

	@Override
	public Loans save(Loans loan)throws SQLException {
		Connection c = MySqlConnection.getConnection();
		try {
		PreparedStatement ps = c.prepareStatement("INSERT INTO emprunte (codel,codead,dateb,datel) VALUES (?,?,?,?)");
		ps.setString(1, loan.getCodel());
		ps.setString(2, loan.getCodead());
		ps.setString(3, loan.getDateb());
		ps.setString(4, loan.getDatel());
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
		PreparedStatement ps = c.prepareStatement("DELETE FROM emprunte WHERE id=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}

	@Override
	public Loans update(Loans loan)throws SQLException {
		Connection c = MySqlConnection.getConnection();
		try {
		PreparedStatement ps = c.prepareStatement("UPDATE emprunte SET codel=?, codead=?, dateb=?, datel=? WHERE id=?; ");
		ps.setString(1, loan.getCodel());
		ps.setString(2, loan.getCodead());
		ps.setString(3, loan.getDateb());
		ps.setString(4, loan.getDatel());
		ps.setInt(5, loan.getId());
		ps.executeUpdate();
		ps.close();
		}catch (SQLException e) {
			e.printStackTrace();
			}
		return null;
	}

	@Override
	public Loans findById(int id)throws SQLException {
		Loans loan = null;
		Connection c = MySqlConnection.getConnection();
		if (c != null) {
		try {
		String request = "SELECT * FROM emprunte WHERE id = ?";
		PreparedStatement ps = c.prepareStatement(request);
		ps.setInt(1, id);
		ResultSet r = ps.executeQuery();
		if (r.next()) {
		loan = new Loans(r.getString("codel"), r.getString("codead"),r.getString("dateb"),r.getString("datel"));
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		return loan;
	}
    @Override
	public List<Loans> getAll()throws SQLException {
    	Connection cn = MySqlConnection.getConnection();
		PreparedStatement ps;
    	List<Loans> liste = new ArrayList<>();
		

        try {
        	
        	ps = cn.prepareStatement("SELECT * FROM emprunte");
    		ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Loans loan = new Loans();
                loan.setId(rs.getInt("id"));
                loan.setCodel(rs.getString("codel"));
                loan.setCodead(rs.getString("codead"));
                loan.setDatel(rs.getString("datel"));
                loan.setDateb(rs.getString("dateb"));
                liste.add(loan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return liste;
	}

}
