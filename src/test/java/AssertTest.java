import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTest {
    @Test
    public void test() {
        int a = 2;
        int b = 2;
        int c = 3;

        String s1 = "SOme";
        String s2 = "SOme";
        String s3 = "Some";

        Assertions.assertSame(a, b);
        Assertions.assertNotSame(a, c);

        Assertions.assertEquals(s1, s2, "Strings the same");
        Assertions.assertNotEquals(s1, s2, "Strings the same");
    }
}
