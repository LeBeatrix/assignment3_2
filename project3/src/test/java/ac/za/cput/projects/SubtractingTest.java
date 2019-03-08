package ac.za.cput.projects;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SubtractingTest
{
    private Maths classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Maths();
    }

    @Test
    public void testSubtract() {
        assertEquals(2, classUnderTest.subtract(3, 1));


    }
}
