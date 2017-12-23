package com.example.demo.$3_freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author fanhb on 2017/12/23
 * @desc xxxx
 *
 *
 * 1: freemarker依赖
 * 2: 配置(关闭缓存)
 * 3: controller
 * 4: *.ftl文件
 */
@Controller
public class ControllerFreemarker {

    @RequestMapping("/freemarker")
    public String getThymeleafTest(Map<String,Object> map){
        System.out.println("ControllerFreemarker.getThymeleafTest");
        map.put("name","sleeve. freemarker!!!sss");
        return "hello_freemarker";
    }
}
