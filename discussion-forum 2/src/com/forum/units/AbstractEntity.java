package com.forum.units;

import com.forum.util.Utility;
import java.util.Date;

public abstract class AbstractEntity {

  private Date created;

  private long id;

  /**
   * Write a method called getId that requires no parameters and returns the id of this Abstract
   * entity
   *
   * @return the id of this Abstract entity
   */
  public long getId() {
    return id;
  }

  /**
   * Write a method called setId that takes in a parameter and sets the id of this Abstract entity
   * to the parameter.
   *
   * <p>This method should return void.
   *
   * @param id: the id of this Abstract entity
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Write an abstract method called autoGenerateId.
   *
   * <p>This method doesn't require any parameters and returns void
   */
  abstract void autoGenerateId();

  public Date getCreated() {
    return created;
  }

  public void setCreated() {
    this.created = Utility.getCurrentDate();
  }
}
