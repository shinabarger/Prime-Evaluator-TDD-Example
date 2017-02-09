import org.junit.Test;
import com.jetbrains.Main;

import static org.junit.Assert.*;

/**
 * Created by davidshinabarger on 2/8/17.
 */
public class oddEvenTest {
    @Test
    public void oddEvenTest() throws Exception {
        fail("Something");
    }

    @Test
    public void oddTest1() {
        assertEquals("Odd", Main.oddEven(1));
    }

    @Test
    public void oddTest2() {
        assertEquals("Odd & Prime", Main.oddEven(3));
    }

    @Test
    public void evenTest() {
        assertEquals("Even", Main.oddEven(4));
    }

    @Test
    public void primeTest() {
        assertEquals("Odd & Prime", Main.oddEven(7));
    }

    @Test
    public void primeTest1() {
        assertEquals("Even", Main.oddEven(30));
    }

    @Test
    public void primeTest2() {
        assertEquals("Odd & Prime", Main.oddEven(101));
    }

}