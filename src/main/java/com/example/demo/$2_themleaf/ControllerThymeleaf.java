package com.example.demo.$2_themleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author fanhb on 2017/12/23
 * @desc xxxx
 */
@Controller
public class ControllerThymeleaf {

    @RequestMapping("/thymeleaf1")
    public String getThymeleafTest(Map<String,Object> map){
        System.out.println("ControllerThymeleaf.getThymeleafTest");

        map.put("name","sleeve");
        return "hello_thymeleaf";
    }
}
