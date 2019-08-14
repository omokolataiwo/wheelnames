package com.omokolataiwo.namewheel.wheelname.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Name{
  @Id
  public ObjectId _id;

  public String firstName;
  public String lastName;

  public Name(ObjectId _id, String firstName, String lastName) {
    this._id = _id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public ObjectId getId() {
    return this._id;
  }

  public void setId(ObjectId _id) {
    this._id = _id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}