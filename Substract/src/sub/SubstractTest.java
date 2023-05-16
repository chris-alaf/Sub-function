package sub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubstractTest {

	@Test
	void testSubt() {
		substract test1 = new substract();
		assertEquals("Negative", test1.subt(-10, -5));
		assertEquals("Positive", test1.subt(10, 5));
		assertEquals("Zero", test1.subt(10, 10));
	}

}
