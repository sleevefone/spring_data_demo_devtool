package com.example.demo.repository.jdbc;

import com.example.demo.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author fanhb on 2017/12/23
 * @desc xxxx
 */

@Repository
public class JdbcTemplateDao {

    @Resource
    private JdbcTemplate template;

    public Cat getCatByJdbc(String name){

        String sql = "select * from cat c where c.name=?";
        RowMapper<Cat> catBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Cat.class);
        Cat cat = template.queryForObject(sql, new Object[]{"zz"}, catBeanPropertyRowMapper);
        return cat;
    }


}
