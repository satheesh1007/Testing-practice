
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

    public class SoftAssertion {

        @Test
        public void softAssert() {
            SoftAssert softAssert = new SoftAssert();
            System.out.println("Satheesh, ");
            softAssert.assertTrue(false, "failure 1");
            System.out.println("Engineer!");
            softAssert.assertFalse(false, "failure 2");
            System.out.println("Testers!");
            softAssert.assertEquals("Satheesh","kani", "failure 3");

            softAssert.assertAll();

        }




    }

