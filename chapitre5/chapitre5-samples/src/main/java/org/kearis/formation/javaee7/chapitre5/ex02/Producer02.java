package org.kearis.formation.javaee7.chapitre5.ex02;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Date;

public class Producer02 {

  // ======================================
  // =           Public Methods           =
  // ======================================

  public static void main(String[] args) {

    try {
      // Gets the JNDI context
      Context jndiContext = new InitialContext();

      // Looks up the administered objects
      ConnectionFactory connectionFactory = (ConnectionFactory) jndiContext.lookup("jms/javaee7/ConnectionFactory");
      Destination queue = (Destination) jndiContext.lookup("jms/javaee7/Queue");

      // Creates the needed artifacts to connect to the queue
      Connection connection = connectionFactory.createConnection();
      Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
      MessageProducer producer = session.createProducer(queue);

      // Sends a text message to the queue
      TextMessage message = session.createTextMessage("JMS 1.1 - This is a text message sent at " + new Date());
      producer.send(message);
      System.out.println("\nMessage sent !");

      connection.close();

    } catch (NamingException | JMSException e) {
      e.printStackTrace();
    }

    System.exit(0);
  }
}