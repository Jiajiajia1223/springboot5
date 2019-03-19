package com.hr.springboot5.service;

import com.hr.springboot5.entity.Person;

import java.util.List;

public interface PersonService {
    public List<Person> findAll();

    public Person findByid(int id);
}
