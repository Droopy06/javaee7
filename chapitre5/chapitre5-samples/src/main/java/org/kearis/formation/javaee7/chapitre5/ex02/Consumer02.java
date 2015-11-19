package org.kearis.formation.javaee7.chapitre5.ex02;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Consumer02 {

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
      MessageConsumer consumer = session.createConsumer(queue);
      connection.start();

      // Loops to receive the messages
      System.out.println("\nInfinite loop. Waiting for a message...");
      while (true) {
        TextMessage message = (TextMessage) consumer.receive();
        System.out.println("Message received: " + message.getText());
      }

    } catch (NamingException | JMSException e) {
      e.printStackTrace();
    }
  }
}