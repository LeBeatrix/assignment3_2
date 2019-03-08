package ac.za.cput.projects;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AddingTest
{
    private Maths classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Maths();
    }

    @Test
    public void testAdd() {
        assertEquals(4, classUnderTest.add(1, 3));

        assertEquals(10, classUnderTest.add(2, 5, 3));
    }

}


