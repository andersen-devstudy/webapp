package org.andersen.webapp.service;

import lombok.RequiredArgsConstructor;
import org.andersen.webapp.dao.impl.UserDaoImpl;

@RequiredArgsConstructor
public class StudentService {

  private final UserDaoImpl userDao;

}
