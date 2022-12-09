package Com.demo.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Com.demo.main.EvenOdd;

public class EvenOddTest {
	@Test
	public void test() {
	//	assertEquals(true,EvenOdd.findEvenOdd(4));
	//	assertEquals(true,EvenOdd.findEvenOdd(5));
		assertEquals(false,EvenOdd.findEvenOdd(4));

	}
}