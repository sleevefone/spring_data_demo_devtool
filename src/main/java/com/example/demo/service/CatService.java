package com.example.demo.service;

import com.example.demo.Cat;
import com.example.demo.$1_repository.$1_data.ICatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fanhb on 2017/12/23
 * @desc xxxx
 */

@Service
public class CatService {

    @Autowired
    private ICatRepository catRepository;

    public Cat save(Cat cat){
        catRepository.count();
        return catRepository.save(cat);
    }
}
