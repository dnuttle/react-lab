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
package net.nuttle.react;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import net.nuttle.react.model.Employee;

/**
 * @author Adobe Systems Inc.
 *
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

  private final EmployeeRepository repository;
  
  @Autowired
  public DatabaseLoader(EmployeeRepository repository) {
    this.repository = repository;
  }
  
  @Override
  public void run(String...args) throws Exception {
    this.repository.save(new Employee("Joe Biden", 45, 5));
    this.repository.save(new Employee("Barack Obama", 54, 8));
    this.repository.save(new Employee("Crysal Mac", 34, 12));
    this.repository.save(new Employee("James Henry", 33, 2));
  }
  
}
