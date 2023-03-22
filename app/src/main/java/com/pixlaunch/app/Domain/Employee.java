package com.pixlaunch.app.Domain;

/**
 * @author abhishekbansal
 */
public class Employee {

  private String id;

  private String name;
  private String emailId;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public String toString() {
    return "Employee{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", emailId='" + emailId + '\'' +
        '}';
  }
}
