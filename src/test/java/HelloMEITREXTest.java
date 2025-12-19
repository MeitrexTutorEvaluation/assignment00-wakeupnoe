import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloMEITREXTest {

    @Test
    void testAdd() {
        assertEquals(8, Main.add(5, 3), "5 + 3 should equal 8");
        assertEquals(0, Main.add(0, 0), "0 + 0 should equal 0");
        assertEquals(-2, Main.add(-5, 3), "-5 + 3 should equal -2");
        assertEquals(100, Main.add(50, 50), "50 + 50 should equal 100");
    }

    @Test
    void testSubtract() {
        assertEquals(2, Main.subtract(5, 3), "5 - 3 should equal 2");
        assertEquals(0, Main.subtract(0, 0), "0 - 0 should equal 0");
        assertEquals(-8, Main.subtract(-5, 3), "-5 - 3 should equal -8");
        assertEquals(0, Main.subtract(50, 50), "50 - 50 should equal 0");
    }

    @Test
    void testMultiply() {
        assertEquals(15, Main.multiply(5, 3), "5 * 3 should equal 15");
        assertEquals(0, Main.multiply(0, 5), "0 * 5 should equal 0");
        assertEquals(-15, Main.multiply(-5, 3), "-5 * 3 should equal -15");
        assertEquals(100, Main.multiply(10, 10), "10 * 10 should equal 100");
    }

    @Test
    void testFactorial() {
        assertEquals(120, Main.factorial(5), "5! should equal 120");
        assertEquals(1, Main.factorial(0), "0! should equal 1");
        assertEquals(1, Main.factorial(1), "1! should equal 1");
        assertEquals(24, Main.factorial(4), "4! should equal 24");
        assertEquals(3628800, Main.factorial(10), "10! should equal 3628800");
    }
}