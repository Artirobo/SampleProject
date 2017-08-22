package com.test.service;

import com.test.entity.Person;

import java.util.List;

/**
 * Created by arti on 8/1/17.
 */
public interface PersonService {
    void add(Person person);
    List<Person> listPersons();
}
