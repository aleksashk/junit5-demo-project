import org.junit.jupiter.api.*;

@DisplayName("Главный тест")
public class AnnotationTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }


    @Test
    @DisplayName("Рассчёт комиссии")
    public void test(){
        System.out.println("@Test");
    }

    @Test
    @Disabled("Просто так")
    public void test2(){
        System.out.println("@Test2");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("@AfterAll");
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    public class InnerClassTest{

        @BeforeAll
        public void beforeAll(){
            System.out.println("@BeforeAll");
        }

        @BeforeEach
        public void beforeEach(){
            System.out.println("@BeforeEach inner");
        }


        @Test
        public void test(){
            System.out.println("@Test inner");
        }

        @Test
        public void test2(){
            System.out.println("@Test2 inner");
        }

        @AfterEach
        public void afterEach(){
            System.out.println("@AfterEach inner");
        }

        @AfterAll
        public void afterAll(){
            System.out.println("@AfterAll");
        }
    }

}
