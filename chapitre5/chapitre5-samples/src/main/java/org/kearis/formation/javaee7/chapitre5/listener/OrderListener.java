package org.kearis.formation.javaee7.chapitre5.listener;

import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

//@MessageDriven(mappedName = "jms/javaee7/OrderQueue")
public class OrderListener implements MessageListener {

    // ======================================
    // =           Public Methods           =
    // ======================================

    public void onMessage(Message message) {
        try {
            System.out.println("Message received: " + message.getBody(String.class));
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}