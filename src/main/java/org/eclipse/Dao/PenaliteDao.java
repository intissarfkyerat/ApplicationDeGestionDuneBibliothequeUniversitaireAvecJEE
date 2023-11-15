package org.eclipse.Dao;



import java.sql.SQLException;
import java.util.List;


import org.eclipse.bean.Penality;

public interface PenaliteDao {
	  Penality save(Penality penality)throws SQLException;
	  void remove(int id)throws SQLException;
	  Penality update(Penality penality)throws SQLException;
	  Penality findById(int id)throws SQLException;
	  List<Penality> getAll()throws SQLException;
}
