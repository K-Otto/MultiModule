package ac.za.cput.karl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class IntTest {
    IntApp ia = new IntApp();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("",ia.main(),4);

    }

    @After
    public void tearDown() throws Exception {


    }
}
