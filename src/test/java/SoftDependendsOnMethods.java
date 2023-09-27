import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftDependendsOnMethods {
    @Test(dependsOnMethods = {"loginTest"})
    public void sendMessage() {
        System.out.println("Test is successfully!!!");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test(dependsOnMethods = {"loginTest"})
    public void postImage() {
        System.out.println("post image is successfully");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(dependsOnMethods = {"loginTest"}, alwaysRun = true)
    public void viewImage() {
        System.out.println("Test");
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
        Assert.fail("Intentionally failing!!!");
    }

    @Test
    public void test() {
        System.out.println("Test without dependency");
    }
}
