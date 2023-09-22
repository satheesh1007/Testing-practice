import org.testng.annotations.Test;

public class PriorityAttributes {
    private System system;

    @Test(priority = 2)
    public void one() {
        system.out.println("Season 3");
    }

    @Test(priority = 3)
    public void two() {
        system.out.println("Season 4");
    }

    @Test(priority = 0)
    public void three() {
        system.out.println("Season 1");
    }

    @Test(priority = 1)
    public void four() {
        system.out.println("Season 2");
    }
}