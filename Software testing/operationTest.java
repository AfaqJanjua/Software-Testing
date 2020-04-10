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
	@ValueSource(ints = {2,4,6,8,10})
	void checkEven(int x) {
		BasicOperations bo=new BasicOperations();
		assertTrue(bo.isEven(x));
	}
	//Repeated Test
	@RepeatedTest(5)
	public void repeatIsEven() {
		BasicOperations bo=new BasicOperations();
		True(bo.isEven(100));
	}
	//Before Method Test
	@Before
	public void doFirst() {
		i++;
		System.out.println("Test:"+i+"Start");
	}
	//After method Test
		@After
		public void doLast() {
			i++;
			System.out.println("Test:"+i+"End");
		}
	// Equals Test
	@Test
	public void isEqual() {
		BasicOperations bo=new BasicOperations();
		Equals(10,bo.add(5, 5));
	}
	@Test
	public void isEqual02() {
		BasicOperations bo=new BasicOperations();
		Equals("Not equal",10,bo.add(5, 5));
	}
	//NotEquals Tests
	@Test
	public void isNotEqual() {
		BasicOperations bo=new BasicOperations();
		NotEquals(100,bo.add(5, 5));
	}
	@Test
	public void isNotEqual02() {
		BasicOperations bo=new BasicOperations();
		NotEquals("Equal",100,bo.add(5, 5));
	}
	//False Test
	@Test
	public void isFalse() {
		BasicOperations bo=new BasicOperations();
		assertFalse(bo.isEven(1));
	}
	@Test
	public void isFalse02() {
		BasicOperations bo=new BasicOperations();
		False("Number is Odd",bo.isEven(1));
	}
	//NotNull Test
	@Test
	public void isNotNull() {
		BasicOperations bo=new BasicOperations();
		assertNotNull(bo.isEven(10));
	}
	@Test
	public void isNotNull02() {
		BasicOperations bo=new BasicOperations();
		NotNull("Not Null Value",bo.isEven(10));
	}
	//NotSame Test
	@Test
	public void isNotSame() {
		BasicOperations bo=new BasicOperations();
		BasicOperations bo1=new BasicOperations();
		NotSame(bo,bo1);
	}
	@Test
	public void isNotSame02() {
		BasicOperations bo=new BasicOperations();
		BasicOperations bo1=new BasicOperations();
		NotSame("Not Same",bo,bo1);
	}
	//Null Test
	@Test
	public void isNull() {
		BasicOperations bo=new BasicOperations();
		assertNull(bo.result);
	}
	@Test
	public void isNull02() {
		BasicOperations bo=new BasicOperations();
		Null("Null",bo.result);
	}
	//Same Test
	@Test
	public void isSame() {
		BasicOperations bo=new BasicOperations();
		BasicOperations bo1=bo;
		assertSame(bo,bo1);
	}
	@Test
	public void isSame02() {
		BasicOperations bo=new BasicOperations();
		BasicOperations bo1=bo;
		Same("Same",bo,bo1);
	}
	//True Test
	@Test
	public void isTrue() {
		BasicOperations bo=new BasicOperations();
		True("Number is even",bo.isEven(2));
	}
	@Test
	public void isTrue02() {
		BasicOperations bo=new BasicOperations();
		True("Number is Odd",bo.isEven(8));
	}
	//fail Test
	@Test
	public void failTest() {
		BasicOperations bo=new BasicOperations();
		fail();
	}
}