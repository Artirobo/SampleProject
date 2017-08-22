package com.test.dao;

import com.test.entity.Person;

import java.util.List;

/**
 * Created by arti on 8/1/17.
 */
public interface PersonDao {
    void add(Person person);
    List<Person> listPersons();
}
