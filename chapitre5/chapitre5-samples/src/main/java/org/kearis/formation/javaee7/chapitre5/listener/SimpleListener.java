package org.kearis.formation.javaee7.chapitre5.listener;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.*;

@MessageDriven(mappedName = "jms/queue/MY.MAGIC.OUT", activationConfig = {
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "OUT2"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
@JMSConnectionFactoryDefinition(name = "jms/myConnectionFactory", className = "javax.jms.ConnectionFactory")
@JMSDestinationDefinition(name = "jms/queue/MY.MAGIC.OUT", className = "javax.jms.Queue", interfaceName = "javax.jms.Queue", destinationName = "OUT2")
public class SimpleListener implements MessageListener {

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