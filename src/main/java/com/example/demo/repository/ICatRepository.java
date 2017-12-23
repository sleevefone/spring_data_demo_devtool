package com.example.demo.repository;


import com.example.demo.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * @author fanhb on 2017/12/23
 * @desc xxxx
 */
public interface ICatRepository extends CrudRepository<Cat,Integer> {


}
