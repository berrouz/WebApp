package com.shevchik.controllers;
import com.shevchik.jms.sender.MessageSender;
import com.shevchik.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 19.09.12
 * Time: 09:36
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    private ContactServiceImpl contactService;
    @Autowired
    private MessageSender messageSender;

    @RequestMapping(value = "/list" )
    public String index(Map<String, Object> map){
        map.put("contacts", contactService.getAll());
        messageSender.sendMessage("My First JMS Message");
        return "list";
    }
}
