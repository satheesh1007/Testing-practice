import org.testng.annotations.Test;

public class DependendsOnMethods {

        @Test(dependsOnMethods = {"LoginTest"})
        public void sendMessageTest() {
            System.out.println("Test is successfully!!!");

        }
        @Test(dependsOnMethods = {"LoginTest"})
        public void postImage() {
            System.out.println("postImage is successfully");

        }
        @Test
        public void registerAccountTest() {
            System.out.println("registerAccountTest is executed");

        }

        @Test(dependsOnMethods = {"registerAccountTest"})
        public void loginTest() {
            System.out.println("Test4 is excuted");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
        }

        @Test
        public void test() {
            System.out.println("Test without dependency");
        }
}
