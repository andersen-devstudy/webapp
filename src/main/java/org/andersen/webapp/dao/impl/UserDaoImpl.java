package org.andersen.webapp.dao.impl;

import org.andersen.webapp.dao.AbstractCrudDao;
import org.andersen.webapp.dao.UserDao;
import org.andersen.webapp.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl extends AbstractCrudDao<User, Long> implements UserDao {

  @Override
  protected User create(Connection connection, User entity) throws SQLException {
    return null;
  }

  @Override
  protected User update(Connection connection, User entity) throws SQLException {
    return null;
  }

  @Override
  public Optional<User> findById(Connection connection, Long id) throws SQLException {
    return Optional.empty();
  }

  @Override
  public List<User> findAll(Connection connection) throws SQLException {
    return null;
  }

  @Override
  public void deleteById(Connection connection, Long id) throws SQLException {

  }
}
