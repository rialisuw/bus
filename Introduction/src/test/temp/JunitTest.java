import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testWorldReplies() {
		WorldReplies wr = new WorldReplies();
		assertEquals("This is what you said:test",wr.reply("test"));
	}
	@Test
	void testeven() {
		assertEquals("Weird",WeirdNumber.IsItWeird(1));
	}
	@Test
	void testsmall() {
		assertEquals("Not Weird",WeirdNumber.IsItWeird(4));
	} 
	@Test
	void testmiddle() {
		assertEquals("Weird",WeirdNumber.IsItWeird(8));
	}
	@Test
	void testbig() {
		assertEquals("Not Weird",WeirdNumber.IsItWeird(24));
	}
	@Test
	void testnegative() {
		assertEquals("Weird",WeirdNumber.IsItWeird(-2));
	} 
	@Test
	void testunevensmall() {
		assertEquals("Weird",WeirdNumber.IsItWeird(3));
	}
	
	
	
	

	

}
