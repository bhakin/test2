import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{

    @Test
    public void testSkillDemo(){
        assertEquals(10,SkillDemo.multiply(5,5));
    }
}