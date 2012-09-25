package com.shevchik.jms.listener;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 24.09.12
 * Time: 14:05
 * To change this template use File | Settings | File Templates.
 */
public class SimpleMessageListener implements MessageListener {

    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        System.out.println(textMessage);
    }
}
