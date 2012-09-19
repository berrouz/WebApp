package com.shevchik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 19.09.12
 * Time: 09:36
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/list" )
    public String index(Map<String, Object> map){
        return "list";
    }
}
