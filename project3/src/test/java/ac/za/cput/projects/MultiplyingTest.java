package ac.za.cput.projects;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MultiplyingTest
{
    private Maths classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Maths();
    }

    @Test
    public void testMultiply() {
        assertEquals(2, classUnderTest.multiply(1, 2));
    }
}
