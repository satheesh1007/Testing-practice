import org.testng.annotations.Test;

public class Invocationcount {
    private System system;

    @Test(invocationCount = 1)
    public void count1() { system.out.println("stranger ");}

    @Test(invocationCount = 1)
    public void count2() { system.out.println("things ");}

    @Test
    public void count4() { system.out.println("season1");}
}