package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Class1Test {

	@Test
	public void test() {

		Class1 class1 = new Class1();
		
		assertTrue(class1.add(2, 2) == 4);
	}

}
