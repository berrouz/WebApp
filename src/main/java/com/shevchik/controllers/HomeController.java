package com.shevchik.controllers;
import com.shevchik.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
@Controller
public class HomeController {
    @Autowired
    private ContactServiceImpl contactService;

    @RequestMapping(value = "/list" )
    public String index(Map<String, Object> map){
        map.put("contactList", contactService.getAll());
        return "list";
    }
}
