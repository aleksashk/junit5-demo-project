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

//        int [] array1 = new int[]{1,2};
//        int [] array2 = new int[]{0,2};
//        int [] array3 = new int[]{1,2,3};
//        Assertions.assertArrayEquals(array1, array3, "Arrays not equals");
//        Iterable<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,-1,-2));
//        Iterable<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,4,5,-1,-2));
//
//        Assertions.assertIterableEquals(list1, list2);
//
//        List<String> list1 = new ArrayList<>(Arrays.asList("Some string", "Another string"));
//        List<String> list2 = new ArrayList<>(Arrays.asList("Some", "string", "Another string"));
//        Assertions.assertLinesMatch(list1, list2);


//        Assertions.assertNull("null");
//        Assertions.assertNotNull(null);
//
//        Assertions.assertTrue(true);
//        Assertions.assertFalse(false);
//
//        Assertions.assertTimeout(Duration.ofMillis(500), () -> {
//            System.out.println("Start");
//            Thread.sleep(501);
//            System.out.println("Finish");
//        });
//
//
//        Assertions.assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
//            System.out.println("start");
//            Thread.sleep(600);
//            System.out.println("finish");
//        });

//        Assertions.assertThrows(NullPointerException.class,()->{
//            throw new NullPointerException();
//        });

        Assertions.assertThrows(NullPointerException.class, () -> {
            int a = 2 + 2;
        });
    }

}
