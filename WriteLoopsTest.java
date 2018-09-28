

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WriteLoopsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WriteLoopsTest
{
    /**
     * Default constructor for test class WriteLoopsTest
     */
    public WriteLoopsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void TestOneToFive()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(5, writeLoo1.oneToFive());
    }
    @Test
    public void TestOneToTen()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(5, writeLoo1.oneToTen());
    }
    @Test
    public void TestStartAtTwentyOne()
    {
        WriteLoops writeLoo1 = new WriteLoops();
        assertEquals(5, writeLoo1.startAtTwentyOne());
    }
}

