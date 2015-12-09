import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.jms.*;

/**
 * Created by poutsjr on 20/11/2015.
 */
public abstract class AbstractTest {

    static final String connectionUri = "tcp://localhost:61616";
    static ActiveMQConnectionFactory connectionFactory;
    static Connection connection;
    static Session session;
    static Destination destinationQueue;
    static BrokerService service;

    /**
     * Starting broker
     * @throws Exception
     */
    @BeforeClass
    public static void init() throws Exception {
        service = BrokerFactory.createBroker("xbean:activemq.xml");
        service.start();

        connectionFactory = new ActiveMQConnectionFactory(connectionUri);
        connection = connectionFactory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        destinationQueue = session.createQueue("MY.MAGIC.OUT");
    }

    /**
     * Closing broker
     * @throws Exception
     */
    @AfterClass
    public static void end() throws Exception {

        if (connection != null) {
            connection.close();
        }

        if (service != null) {
            service.stop();
        }
    }

}
