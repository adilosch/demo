package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Class1Test {

	@Test
	public void testPositive() {

		Class1 class1 = new Class1();
		
		assertTrue(class1.add(2, 2) == 4);
	}
	
	@Test
	public void testNegative() {

		Class1 class1 = new Class1();
		
		assertFalse(class1.add(2, 2) == 5);
	}
	
	@Test
	public void test2() {

		Class1 class1 = new Class1();
		
		assertTrue(class1.add(3, 2) == 5);
	}


}
