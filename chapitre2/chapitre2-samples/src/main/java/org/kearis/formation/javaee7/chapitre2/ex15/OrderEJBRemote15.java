package org.kearis.formation.javaee7.chapitre2.ex15;

import javax.ejb.Asynchronous;
import java.util.concurrent.Future;

/**
 * Created by poutsjr on 27/09/2015.
 */
public interface OrderEJBRemote15 {
    @Asynchronous
    void sendEmailOrderComplete(Order15 order, Customer15 customer);

}
