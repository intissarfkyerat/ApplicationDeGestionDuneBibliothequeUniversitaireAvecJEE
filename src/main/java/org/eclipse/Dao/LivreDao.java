package org.eclipse.Dao;
import org.eclipse.bean.Livre;

import java.sql.SQLException;
import java.util.List;
public interface LivreDao {
  Livre save(Livre livre)throws SQLException;
  void remove(int id)throws SQLException;
  Livre update(Livre livre)throws SQLException;
  Livre findById(int id)throws SQLException;
  List<Livre> getAll()throws SQLException;
  List<Livre> getLivreParMC(String mc)throws SQLException;
  public List<Livre> getLivresPopulaires() throws SQLException;
  public Livre getLivreMoinsEmprunte() throws SQLException;
  boolean reserveBook(int bookId) throws SQLException;
}
