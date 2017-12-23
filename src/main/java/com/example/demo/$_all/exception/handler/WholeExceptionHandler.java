package com.example.demo.$_all.exception.handler;


import com.example.demo.$_all.exception.annotation.Doc4desc;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author fanhb on 2017/12/23
 * @desc xxxx
 */
@ControllerAdvice
@ResponseBody
@Doc4desc("application之外的路径,路径扫描不到")
public class WholeExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String defaultExceptionHandler(HttpServletRequest request, Exception runtime ) {
        runtime.printStackTrace();
        System.out.println("WholeExceptionHandler.allProjectExceptionHandler");
        return "this is all project exceptonal handler = ";
    }
}
