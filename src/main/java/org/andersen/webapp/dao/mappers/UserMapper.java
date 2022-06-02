package org.andersen.webapp.dao.mappers;

import org.andersen.webapp.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.andersen.webapp.model.User.USER_AGE;
import static org.andersen.webapp.model.User.USER_ID;
import static org.andersen.webapp.model.User.USER_NAME;
import static org.andersen.webapp.model.User.USER_SURNAME;

public class UserMapper implements Mapper<User> {

  @Override
  public User apply(ResultSet rs) throws SQLException {
    return new User(rs.getLong(USER_ID), rs.getString(USER_NAME), rs.getString(USER_SURNAME), rs.getInt(USER_AGE));
  }
}
