import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before the test by: Jorge Dominguez.");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After the test by: Chanel Galeano.");
    }

    @Test
    public void main() {
        System.out.println("This is the main output from the main method.");
    }
}