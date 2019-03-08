package ac.za.cput.projects;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;

import org.junit.Before;

import org.junit.Test;

import java.lang.Math;


public class MathsTest {


    private Maths classUnderTest;


    @Before
    public void setUp() throws Exception
    {
        classUnderTest = new Maths();
    }


    @Test
    public void testAdd() {
        // Let Java add it up
        long result = 10 + 23 + (-1) + 16;

        // Compare that to what the Maths gives us
        assertEquals(result, classUnderTest.add(10, 23, -1, 16));

        result = 100 + 102;
        assertEquals(result, classUnderTest.add(100 + 102));

        result = 0;
        assertEquals(result, classUnderTest.add(0));

    }

    @Test
    public void testSubtract() {
        long result = 100 - 34 - (-17) - 4;

        assertEquals(result, classUnderTest.subtract(100, 34, -17, 4));

        result = 0;

        assertEquals(result, classUnderTest.subtract(0, 0, 0, 0));
    }

    @Test
    public void testMultiply() {
        long result = 100 * 34 * -17 * 4;

        assertEquals(result, classUnderTest.multiply(100, 34, -17, 4));

        result = 0;
        assertEquals(result, classUnderTest.multiply(0));
    }

    @Test
    public void testDivide() {
        long result = 100 / 3 / 2;

        assertEquals(result, classUnderTest.divide(100, 3, 2));

        result = 0;
        assertEquals(result, classUnderTest.divide(0, 1));

        result = -17;
        assertEquals(result, classUnderTest.divide(-17, 1));

    }

    @Test
    public void testPower() {

        long result = Double.valueOf(Math.pow(12.0, 3.0)).longValue();


        assertEquals(result, classUnderTest.pow(12, 3));


        result = Double.valueOf(Math.pow(Math.pow(12.0, 3.0), 4.0)).longValue();
        assertEquals(result, classUnderTest.pow(12, 3, 4));

        result = Double.valueOf(Math.pow(Math.pow(12.0, -3.0), 4.0)).longValue();

        try {
            classUnderTest.pow(12, -3, 4);

            fail("Expected this to throw IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {

            // This is what we expect
        }
    }

}


