package JUnitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.NotEquals,NotNull ;
import static org.junit.Assert.True,Null,Same,fail;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.After,Before;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class OperationsTest {
	int i=0;
	//parameterized Method
	@ParameterizedTest
	@ValueSource(ints = {2,4,6})
	void checkEven(int x) {
		BasicOperations b=new BasicOperations();
		assertTrue(b.isEven(x));
	}
	//Repeated Test
	@RepeatedTest(5)
	public void repeatIsEven() {
		BasicOperations b=new BasicOperations();
		True(b.isEven(100));
	}
	//Before Method Test
	@Before
	public void First() {
		i++;
		System.out.println("Test:"+i+"Start");
	}
	//After method Test
		@After
		public void Last() {
			i++;
			System.out.println("Test:"+i+"End");
		}
	// Equals Test
	@Test
	public void Equal() {
		BasicOperations b=new BasicOperations();
		Equals(10,bo.add(5, 5));
	}
	@Test
	public void Equal02() {
		BasicOperations b=new BasicOperations();
		Equals("Not equal",10,bo.add(5, 5));
	}
	//NotEquals Tests
	@Test
	public void NotEqual() {
		BasicOperations b=new BasicOperations();
		NotEquals(100,bo.add(5, 5));
	}
	@Test
	public void NotEqual02() {
		BasicOperations b=new BasicOperations();
		NotEquals("Equal",100,bo.add(5, 5));
	}
	//False Test
	@Test
	public void False() {
		BasicOperations b=new BasicOperations();
		assertFalse(b.isEven(1));
	}
	@Test

	//NotNull Test
	@Test
	public void NotNull() {
		BasicOperations b=new BasicOperations();
		assertNotNull(b.isEven(10));
	}
	@Test
	public void NotNull02() {
		BasicOperations b=new BasicOperations();
		NotNull("Not Null Value",b.isEven(10));
	}
	//NotSame Test
	@Test
	public void NotSame() {
		BasicOperations b=new BasicOperations();
		BasicOperations b1=new BasicOperations();
		NotSame(b,b1);
	}
	@Test
	public void NotSame02() {
		BasicOperations b=new BasicOperations();
		BasicOperations b1=new BasicOperations();
		NotSame("Not Same",b,b1);
	}
	//Null Test
	@Test
	public void Null() {
		BasicOperations b=new BasicOperations();
		assertNull(b.result);
	}
	@Test
	public void Null02() {
		BasicOperations b=new BasicOperations();
		Null("Null",b.result);
	}
	//Same Test
	@Test
	public void Same() {
		BasicOperations b=new BasicOperations();
		BasicOperations b1=b;
		assertSame(b,b1);
	}
	
	@Test
	public void True() {
		BasicOperations bo=new BasicOperations();
		True("Number is even",bo.isEven(2));
	}

	public void failTest() {
		BasicOperations b=new BasicOperations();
		fail();
	}
}
