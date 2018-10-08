import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;
public class SimpleTestClass extends TestCase{
 
   /* public void testtrue() {
        Word testword = new Word("Haus");
        assertTrue(true);
    }*/
    
    public void test2() {
        Word testword2 = new Word("Haus");
        assertEquals("Haus",testword2.getValue());
    }
}