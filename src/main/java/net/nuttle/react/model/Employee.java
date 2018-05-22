/*
 * ADOBE CONFIDENTIAL
 * __________________
 *
 * Copyright 2018 Adobe Systems Incorporated
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Adobe Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated and its
 * suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe Systems Incorporated.
 */
package net.nuttle.react.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Adobe Systems Inc.
 *
 */
@Data
@Entity
public class Employee {
  
  private @Id @GeneratedValue Long id;
  private String name;
  private int age;
  private int years;

  private Employee() {}

  public Employee(String name, int age, int years) {
      this.name = name;
      this.age = age;
      this.years = years;
  }
  
}
