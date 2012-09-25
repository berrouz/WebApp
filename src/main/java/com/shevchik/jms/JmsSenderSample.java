package com.shevchik.jms;

import com.shevchik.jms.sender.MessageSender;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 24.09.12
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class JmsSenderSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("classpath*:services-context.xml");
        genericXmlApplicationContext.refresh();
        MessageSender messageSender = genericXmlApplicationContext.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage("Clarence testing JMS message");
    }
}
