import org.testng.annotations.Test;

public class IncludeExclude {

   private  System system;

    @Test
    public void animal (){

        system.out.println("lion");
    }
    @Test
    public void animal1 (){
        system.out.println("tiger");
    }
    @Test
    public void animal2(){
        system.out.println("horse");

    }
    @Test
    public void animal3(){
        system.out.println("elepant");
    }
}
