package org.eclipse.Dao;


import java.sql.SQLException;

import org.eclipse.bean.Contact;
public interface ContactDao {
	public Contact save(Contact contact) throws SQLException;
}
