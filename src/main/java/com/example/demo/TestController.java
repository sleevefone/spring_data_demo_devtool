package com.example.demo;

import com.example.demo.repository.data.ICatRepository;
import com.example.demo.repository.jdbc.JdbcTemplateDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fanhb on 2017/12/23
 * @desc xxxx
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private ICatRepository repository;

    @Resource
    private JdbcTemplateDao jdbcTemplateDao;


    @GetMapping("/cat")
    public String getTest(){
        long count = repository.count();
        return "ssss" +count;
    }

    @GetMapping("/cat2")
    public String getTest2(){
        List<Cat> cat = repository.getCat(11);

        return "ssss" +cat;
    }

    @GetMapping("/cat3")
    public String getTest3(){
        Cat name = repository.getCatById(1);

        return "ssss" +name;
    }
    @GetMapping("/jdbc")
    public String jdbcTest(){
        System.out.println("TestController.jdbcTest");
        Cat name = jdbcTemplateDao.getCatByJdbc("zzz");
        System.out.println(1/0);
        return "ssss" +name;
    }
}
