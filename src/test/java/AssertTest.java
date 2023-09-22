import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTest {
    @Test
    public void test() {
//        int a = 2;
//        int b = 2;
//        int c = 3;
//
//        String s1 = "SOme";
//        String s2 = "SOme";
//        String s3 = "Some";
//
//        Assertions.assertSame(a, b);
//        Assertions.assertNotSame(a, c);
//
//        Assertions.assertEquals(s1, s2, "Strings the same");
//        Assertions.assertNotEquals(s1, s2, "Strings the same");

        int [] array1 = new int[]{1,2};
        int [] array2 = new int[]{0,2};
        int [] array3 = new int[]{1,2};
        Assertions.assertArrayEquals(array1, array2, "Arrays not equals");
    }
}
