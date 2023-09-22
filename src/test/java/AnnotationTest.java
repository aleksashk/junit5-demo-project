import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationTest {

    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }


    @Test
    public void test(){
        System.out.println("@Test");
    }

    @Test
    public void test2(){
        System.out.println("@Test2");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }

}
