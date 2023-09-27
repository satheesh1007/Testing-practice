import org.testng.annotations.Test;

public class EnableDisable {
    @Test
    public void Emp(){
        System.out.println("sandy");
    }
    @Test
    public void Teamleader(){
        System.out.println("kalai");
    }
    @Test(enabled = false )
    public void HR(){
        System.out.println("jones");
    }

}
