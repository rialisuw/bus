package test.java;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import test.resources.WeirdNumber;

public class JunitTest{

	/*@Test
	public void testWorldReplies() {
		WorldReplies wr = new WorldReplies();
		assertEquals("This is what you said:test",wr.reply("test"));
	}*/
	/*@Test
	public void testfail() {
		fail("Testing if a failed Test is actually shown as fail");
	}*/
	
	@Test
	public void testeven() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(1);
		assertEquals("Weird",WeirdNumber.IsItWeird());
	}
	@Test
	public void testsmall() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(4);
		assertEquals("Not Weird",WeirdNumber.IsItWeird());
	} 
	@Test
	public void testmiddle() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(8);
		assertEquals("Weird",WeirdNumber.IsItWeird());
	}
	@Test
	public void testbig() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(24);
		assertEquals("Not Weird",WeirdNumber.IsItWeird());
	}
	@Test
	public void testnegative() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(-2);
		assertEquals("Weird",WeirdNumber.IsItWeird());
	} 
	@Test
	public void testunevensmall() {
		WeirdNumber WeirdNumber = new WeirdNumber();
		WeirdNumber.setNumber(3);
		assertEquals("Weird",WeirdNumber.IsItWeird());
	}
	

	

	

}
