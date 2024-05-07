import org.testng.annotations.Test;

public class GroupTest {
        @Test(groups = {"Satheesh"})
        public void sendMessageTest() {
            System.out.println("Test is executed!!!");

        }
        @Test(groups = {"Satheesh"})
        public void postPictureTest() {
            System.out.println("Test is successfully");

        }
        @Test(groups = {"Kumar"})
        public void registerAccountTest() {
            System.out.println("Test3 is successfully");
        }
        @Test(groups = {"Kumar"})
        public void loginTest() {
            System.out.println("Test4 is successfully");

        }

        @Test(groups = {"Kumar", "regression"})
        public void test1() {
            System.out.println("Test without dependency");
        }

        @Test
        public void test2() {
        System.out.println("Test 2 is excuted");
    }

        @Test
        public void test3(){System.out.println("Test 3 is successfully");
        }

    }

