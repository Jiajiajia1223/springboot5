package com.hr.springboot5.service.impl;

import com.hr.springboot5.dao.PersonMapper;
import com.hr.springboot5.entity.Person;
import com.hr.springboot5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class personServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public List<Person> findAll() {
        Map<String,Object> map = new HashMap<>();
        List<Person> people = personMapper.selectByMap(map);
        return people;
    }

    @Override
    public Person findByid(int id) {
        Person person = personMapper.selectById(id);
        return person;
    }
}
