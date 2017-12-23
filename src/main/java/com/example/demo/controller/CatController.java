package com.example.demo.controller;

import com.example.demo.Cat;
import com.example.demo.service.CatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fanhb on 2017/12/23
 * @desc xxxx
 */

@RestController
@RequestMapping("/cat")
public class CatController {


    @Resource
    private CatService service;

    @GetMapping("/hello")
    public Cat helloCat() {
        Cat cat = new Cat();
        cat.setAge(11);
        cat.setName("name");
        Cat save = service.save(cat);
        System.out.println("CatController.helloCat: " + save.getName());
        return save;
    }
}
