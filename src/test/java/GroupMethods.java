import org.testng.annotations.Test;

public class GroupMethods {
    @Test(groups = "username")
    public void test1(){
        System.out.println("test is executed!!");
    }

    @Test(groups = "password")
    public void test2(){
        System.out.println("test2 is successfully!!");
    }

    @Test(groups = "username1")
    public void test3(){
        System.out.println("test3 is invalid username");
    }

    @Test(groups = "password2")
    public void test4(){
        System.out.println("test4 is invalid password");
    }


}
