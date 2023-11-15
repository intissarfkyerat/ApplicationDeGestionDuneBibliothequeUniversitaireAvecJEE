package org.eclipse.Dao;
import java.sql.SQLException;
import java.util.List;
import org.eclipse.bean.Personne;
public interface PersonneDao {
	Personne save(Personne personne)throws SQLException;
	void remove(int id)throws SQLException;
	Personne update(Personne personne)throws SQLException;
	List<Personne> getAll()throws SQLException;
	Personne findByEmail(String mail)throws SQLException;
}
