package org.eclipse.Dao;

import java.sql.SQLException;
import java.util.List;


import org.eclipse.bean.Loans;

public interface LoansDao {
	  Loans save(Loans loan)throws SQLException;
	  void remove(int id)throws SQLException;
	  Loans update(Loans loan)throws SQLException;
	  Loans findById(int id)throws SQLException;
	  List<Loans> getAll()throws SQLException;
}
