package com.feng.controller;

import com.feng.bean.Person;
import com.feng.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CacheController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/put")
    public Person put(Person person){
        return personService.save(person);
    }


    @RequestMapping("/get/{id}")
    public Person findById(@PathVariable long id){
        return personService.findById(id);
    }

    //http://localhost:8080/evit?id=1
    @RequestMapping("/delete/{id}")
    public String  delete(@PathVariable long id){
        personService.deleteById(id);
        return "ok";
    }

    @RequestMapping("/all")
    public List<Person> all() {
        return personService.all();
    }

    @RequestMapping("/save")
    public Person save(Person person) {
        return personService.save(person);
    }

}
