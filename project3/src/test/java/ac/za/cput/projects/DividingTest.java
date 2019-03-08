package ac.za.cput.projects;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DividingTest
{
    private Maths classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Maths();
    }

    @Test
    public void testDivide() {
        assertEquals(3, classUnderTest.divide(6, 2));
    }
}
