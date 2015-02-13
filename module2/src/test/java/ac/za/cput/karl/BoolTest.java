package ac.za.cput.karl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class BoolTest {
    BoolApp ba = new BoolApp();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Assert.assertTrue(ba.main());

    }

    @After
    public void tearDown() throws Exception {


    }
}
