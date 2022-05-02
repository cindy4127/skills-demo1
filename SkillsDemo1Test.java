import static org.junit.Assert.*;
import org.junit.*;

public class SkillsDemo1Test{
    //test for the factorial function
    @Test
    public void factorial(){
        assertEquals(720, SkillsDemo1.factorial(8)); //initally fails 
    }
}