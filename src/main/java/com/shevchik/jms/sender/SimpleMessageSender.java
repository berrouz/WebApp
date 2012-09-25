package com.shevchik.jms.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 24.09.12
 * Time: 13:14
 * To change this template use File | Settings | File Templates.
 */
@Component("messageSender")
public class SimpleMessageSender implements MessageSender{
    @Autowired
    private JmsTemplate jmsTemplate;
    public void sendMessage(final String message) {
        this.jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }
}
