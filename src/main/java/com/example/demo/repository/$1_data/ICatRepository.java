package com.example.demo.repository.$1_data;


import com.example.demo.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author fanhb on 2017/12/23
 * @desc xxxx
 */
public interface ICatRepository extends CrudRepository<Cat,Integer> {


    Cat getCatById(int id);


    @Query("select  c from Cat c where c.age=:age")
    List<Cat> getCat(@Param("age") Integer age);
}
