package org.andersen.webapp.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User extends LongEntity {

  public static final String USER_ID = "user_id";
  public static final String USER_NAME = "user_name";
  public static final String USER_SURNAME = "user_surname";
  public static final String USER_AGE = "user_age";

  private Long id;
  private String name;
  private String surname;
  private Integer age;
}
