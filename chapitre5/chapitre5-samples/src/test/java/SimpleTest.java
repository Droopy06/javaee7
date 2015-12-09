import org.junit.Test;
import org.kearis.formation.javaee7.chapitre5.OrderDTO;

import javax.jms.*;

import java.io.Serializable;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by poutsjr on 20/11/2015.
 */
public class SimpleTest extends AbstractTest {

    private static final String TEST_MESSAGE = "Send message please";

    private static final OrderDTO OBJECT_MESSAGE = new OrderDTO(123L, new Date(), "customer", 10.50f);

    @Test
    public void testQueue() throws Exception {
        // Sending message
        try (MessageProducer producer = session.createProducer(destinationQueue)) {
            TextMessage message = session.createTextMessage();
            message.setText(TEST_MESSAGE);
            producer.send(message);
        }

        // Reading message
        try (MessageConsumer consumer = session.createConsumer(destinationQueue)) {
            TextMessage message = (TextMessage) consumer.receive();
            assertEquals(TEST_MESSAGE, message.getText());
        }
    }

    @Test
    public void testSerializedObject() throws Exception {
        // Sending message
        try (MessageProducer producer = session.createProducer(destinationQueue)) {
            ObjectMessage message = session.createObjectMessage();
            message.setObject(OBJECT_MESSAGE);
            producer.send(message);
        }

        // Reading message
        try (MessageConsumer consumer = session.createConsumer(destinationQueue)) {
            ObjectMessage message = (ObjectMessage) consumer.receive();
            // Impossible for ActiveMQ implementation
            //  assertEquals(OBJECT_MESSAGE, message.getBody(OrderDTO.class));
            assertEquals(OBJECT_MESSAGE, message.getObject());
        }
    }


}
