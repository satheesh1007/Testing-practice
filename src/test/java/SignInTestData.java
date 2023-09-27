import org.testng.annotations.DataProvider;

public class SignInTestData {
    @DataProvider(name = "signin-data")
    Object[][] loginData() {
        Object[][] data = {
                {"vijay", "vijay321"},
                {"sathish","satheesh172"},
                {"sandy", "sandy123"},
        };


        return data;
    }
}
