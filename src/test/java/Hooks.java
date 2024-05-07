import org.testng.annotations.*;
public class Hooks {
        @BeforeClass
        public void beforeBus() {
            System.out.println("Before Bus!");
        }
        @BeforeClass
        public void beforePassenger() {
            System.out.println("Before Passenger!");
        }
        @BeforeTest
        public void beforeDriver() {
            System.out.println("Before Driver!");
        }

        @BeforeSuite
        public void beforeConductor() {
            System.out.println("Before Conductor!");
        }

        @Test
        public void test1(){
            System.out.println("Test 1");
        }

        @Test
        public void test2(){
            System.out.println("Test 2");
        }


        // After hooks - post conditions
        @AfterMethod
        public void afterMethod() {
            System.out.println("After Bus!");
        }

        @AfterClass
        public void afterClass() {
            System.out.println("After Driver!");
        }

    @AfterTest
   public void afterTest() {
            System.out.println("After Conductor!");
    }


        @AfterSuite
        public void afterSuite() {
            System.out.println("After Passenger!");
        }
    }

