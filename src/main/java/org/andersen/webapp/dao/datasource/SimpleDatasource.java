package org.andersen.webapp.dao.datasource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class SimpleDatasource implements Datasource {

  @Override
  public Connection getConnection() throws SQLException {
    return null;
  }

  @Override
  public void close() throws IOException {

  }
}
