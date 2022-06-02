package org.andersen.webapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.andersen.webapp.dao.datasource.SimpleDatasource;
import org.andersen.webapp.dao.impl.UserDaoImpl;
import org.andersen.webapp.model.User;

import java.sql.SQLException;
import java.util.List;

import static org.andersen.webapp.utils.TransactionUtils.transaction;

@Slf4j
@RequiredArgsConstructor
public class StudentService {

  private final UserDaoImpl userDao;
  private final SimpleDatasource datasource;

  public User save(User user) {
    try {
      return userDao.save(datasource.getConnection(), user);
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }

  public void delete(Long id){
    try {
      userDao.deleteById(datasource.getConnection(), id);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public User find(Long id){
    try {
      return userDao.findById(datasource.getConnection(), id).get();
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }

  public List<User> findAll(){
    try {
      return userDao.findAll(datasource.getConnection());
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }

}
