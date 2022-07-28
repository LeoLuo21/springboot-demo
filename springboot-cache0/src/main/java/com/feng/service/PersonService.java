package com.feng.service;

import com.feng.bean.Person;
import com.feng.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Cacheable(value = "person",key = "#id")
    public Person findById(long id) {
        System.out.println("method findById is running");
        return personRepository.findById(id).get();
    }

    @Cacheable(value = "person",key = "#root.method.name")
    public List<Person> all() {
        System.out.println("method all is running");
        return personRepository.findAll();
    }

    public Person save(Person person) {
        System.out.println("method save is running");
        return personRepository.save(person);
    }

    @CachePut(value = "person", key = "#result.id")
    public Person update(Person person) {
        System.out.println("method update is running");
        return personRepository.save(person);
    }

    @CacheEvict(value = "person",key = "#id")
    public void deleteById(long id) {
        System.out.println("method deleteById is running");
        personRepository.deleteById(id);
    }


}
