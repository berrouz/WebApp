package com.shevchik.controllers;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 19.09.12
 * Time: 09:36
 * To change this template use File | Settings | File Templates.
 */
public class HomeControllerTest{


    public String index(Map<String, Object> map){
        return "list";
    }
}
