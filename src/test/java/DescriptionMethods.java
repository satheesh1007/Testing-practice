import org.testng.annotations.Test;

public class DescriptionMethods {


        @Test(testName = "Sending Message - Any Person", dependsOnMethods = {"loginTest"}, suiteName = "Auto Suite")
        public void sendMessage() {
            System.out.println("Test is successfully!!!");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
        }

        @Test(dependsOnMethods = {"loginTest"}, suiteName = "Test Suite")
        public void postImage() {
            System.out.println("post image is successfully");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
        }

        @Test
        public void FacebookAccountTest() {
            System.out.println("FacebookAccountTest is excuted");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
        }

        @Test(dependsOnMethods = {"FacebookAccountTest"})
        public void loginTest() {
            System.out.println("Test is excuted");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
        }

        @Test(testName = "Simple Test Method", description = "This test will be executed without dependency!!!")
        public void test() {
            System.out.println("Test without dependency");
        }
    }

