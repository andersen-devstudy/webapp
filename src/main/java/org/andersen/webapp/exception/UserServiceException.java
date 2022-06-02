package org.andersen.webapp.exception;

import java.sql.SQLException;

/**
 * @author Alex
 * @link https://intvw.me
 */
public class UserServiceException extends Throwable {

  public UserServiceException(String s, SQLException e) {}
}
