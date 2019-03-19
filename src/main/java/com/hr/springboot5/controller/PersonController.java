package com.hr.springboot5.controller;

import com.hr.springboot5.entity.Person;
import com.hr.springboot5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/person/find");
        List<Person> all = personService.findAll();
        mv.addObject("list",all);
        return mv;
    }
    @RequestMapping("/findByid")
    public ModelAndView findByid(int id){
        ModelAndView mv = new ModelAndView("/person/findByid");
        Person byid = personService.findByid(id);
        mv.addObject("ps",byid);
        return mv;
    }
}
