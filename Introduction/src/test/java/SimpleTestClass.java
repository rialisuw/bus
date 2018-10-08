package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import test.resources.Word;

public class SimpleTestClass {
 
    //public void testtrue() {
        //Word testword = new Word("Haus");
      //  assertTrue(true);
    //}
    @Test
    public void testjustAnExample2() {
        Word testword2 = new Word("Haus");
        assertEquals("Haus",testword2.getValue());
    }
}