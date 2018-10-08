package testpack;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

import code.WeirdNumber;
import code.WorldReplies;
import junit.framework.TestCase;

public class JunitTest extends TestCase{

	@Test
	void testWorldReplies() {
		WorldReplies wr = new WorldReplies();
		assertEquals("This is what you said:test",wr.reply("test"));
	}
	@Test
	void testfail() {
		fail("Testing if a failed Test is actually shown as fail");
	}
	
	@Test
	void testeven() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(1);
		assertEquals("Weird",WeirdNumber.IsItWeird());
	}
	@Test
	void testsmall() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(4);
		assertEquals("Not Weird",WeirdNumber.IsItWeird());
	} 
	@Test
	void testmiddle() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(8);
		assertEquals("Weird",WeirdNumber.IsItWeird());
	}
	@Test
	void testbig() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(24);
		assertEquals("Not Weird",WeirdNumber.IsItWeird());
	}
	@Test
	void testnegative() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(-2);
		assertEquals("Weird",WeirdNumber.IsItWeird());
	} 
	@Test
	void testunevensmall() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(3);
		assertEquals("Weird",WeirdNumber.IsItWeird());
	}
	
	public static void main(String[] args) {
		JUnitCore.main("JunitTest.java");
	}

	
	

	

}
