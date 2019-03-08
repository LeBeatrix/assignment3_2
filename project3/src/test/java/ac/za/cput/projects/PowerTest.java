package ac.za.cput.projects;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PowerTest
{
    private Maths classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Maths();
    }

    @Test
    public void testPower() {
        long result = Double.valueOf(Math.pow(12.0, 3.0)).longValue();

        assertEquals(result, classUnderTest.pow(12, 3));



    }
}
