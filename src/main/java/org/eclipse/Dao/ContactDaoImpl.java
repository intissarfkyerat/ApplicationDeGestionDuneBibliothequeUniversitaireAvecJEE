package org.eclipse.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.bean.Contact;

public class ContactDaoImpl implements ContactDao {
  
    
   
	@Override
	public Contact save(Contact contact) throws SQLException{
		Connection c = MySqlConnection.getConnection();
		try {
		PreparedStatement ps = c.prepareStatement("INSERT INTO contact  (username,email,phone,msg) VALUES (?,?,?,?);");
		ps.setString(1, contact.getUsername());
		ps.setString(2, contact.getEmail());
		ps.setString(3, contact.getPhone());
		ps.setString(4,contact.getMsg());
		ps.executeUpdate();
		ps.close();
		}catch (SQLException e) {
            e.printStackTrace();
        }
		return null;
	  }
}
