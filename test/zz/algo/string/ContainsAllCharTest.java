package zz.algo.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsAllCharTest {

	@Test
	public void test() {
		String a = "ABCDEFGHLMNOPQRS";
		String b = "DCGSRQPOM";
		assertTrue(ContainsAllChar.containsAll(a, b));
	}
	
	@Test
	public void test2() {
		String a = "ABCDEFGHLMNOPQRS";
		String b = "DCGSRQPOZ";
		assertFalse(ContainsAllChar.containsAll(a, b));
	}

}
