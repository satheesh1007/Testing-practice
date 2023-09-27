import org.testng.annotations.Test;

public class Invocationcount {
    private System system;
    private int i;

    @Test(invocationCount = 5)
    public void count1() { system.out.println("stranger ");}

    @Test(invocationCount = 5)
    public void count2() { system.out.println("things ");}

    @Test(invocationCount = 6)
    public void count3() { system.out.println("season1");

    }
}