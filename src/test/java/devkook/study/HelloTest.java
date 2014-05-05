package devkook.study;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMain() throws Exception {
        Hello hello = new Hello("Hello");
        hello.say();
    }
}