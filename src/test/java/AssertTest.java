import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTest {
    @Test
    public void test() {
        int a = 2;
        int b = 2;
        int c = 3;

        Assertions.assertSame(a, b);
        Assertions.assertNotSame(a, c);
    }
}
