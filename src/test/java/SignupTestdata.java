import org.testng.annotations.DataProvider;

public class SignupTestdata {
    @DataProvider(name = "signup-data")
    Object[][] loginData() {
        Object[][] data = {
                {"gokul", "gokul234"},
                {"sathish","satheesh172"},
                {"amal","amal123"},
        };


        return data;
    }
}
