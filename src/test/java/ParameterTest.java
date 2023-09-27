import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
        @Test
        @Parameters({"Name"})
        public void sendMessageTest(String Name) {
            System.out.println(Name);
        }
        @Test
        @Parameters({"Title"})
        public void postPictureTest(@Optional("default title") String title) {
            System.out.println(title);
        }
        @Test
        public void registerAccountTest() {
            System.out.println("Test is excuted");
        }
        @Parameters({"Name", "title"})
        @Test
        public void loginTest(String Name, String title) {
            System.out.println(Name+" "+title);

        }

    }