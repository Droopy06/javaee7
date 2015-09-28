package org.kearis.formation.javaee7.chapitre2;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Created by poutsjr on 27/09/2015.
 */
public abstract class AbstractEJBTest {

    // ======================================
    // =             Attributes             =
    // ======================================

    protected static Context ctx;

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

    @BeforeClass
    public static void initContainer() throws Exception {
        ctx = new InitialContext();
    }

    @AfterClass
    public static void closeContainer() throws Exception {
        if (ctx != null) {
            ctx.close();
        }
    }
}
