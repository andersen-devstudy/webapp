package org.andersen.webapp.model;

import java.util.Objects;

public class User extends LongEntity {

  public static final String USER_ID = "user_id";
  public static final String USER_NAME = "user_name";
  public static final String USER_SURNAME = "user_surname";
  public static final String USER_AGE = "user_age";

  private String name;
  private String surname;
  private Integer age;

  public User(Long id, String name, String surname, Integer age) {
    super(id);
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  public User(String name, String surname, Integer age) {
    this(null, name, surname, age);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }

    User user = (User) o;

    if (!id.equals(user.id)) {
      return false;
    }
    if (!Objects.equals(name, user.name)) {
      return false;
    }
    if (!Objects.equals(surname, user.surname)) {
      return false;
    }
    return Objects.equals(age, user.age);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + id.hashCode();
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (surname != null ? surname.hashCode() : 0);
    result = 31 * result + (age != null ? age.hashCode() : 0);
    return result;
  }
}
