package io.pintu.junit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

/*

 */

@DisplayName("executing mathUtil test case")
class MathUtilTest {

	MathUtil mathutil;
	TestInfo testInfo; // to get the metadata infomation about the test method linke what is
						// displayname, which method is getting executed ..etc
	TestReporter testReporter;  //To get the logs of test report data 

	//Above 2 interface providers we can inject in our class and use as per our requiremnts.
	@BeforeAll // One of the test life cycle annotation ,this method will get executed before
				// all the method
	// even before MathUtilTest get instantiated So we need to use the static
	// keyword
	// with this method, in order to
	// execte successfully.
	static void beforeAllInit() {
		//System.out.println("This method need to run before all @test method execute");
	}

	@BeforeEach // One of the Junit test life cycle annotation,Init method will get executed
				// before each @test method .
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		//System.out.println("Initiallise MathUnit test instance");
		mathutil = new MathUtil();
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tag " + testInfo.getTags());
	}

	@AfterEach // One of the Junit test life cycle annotation,cleanup() method will get
	// executed After each @test method .
	void cleanup() {
		//System.out.println("Cleaning up...");
	}

	@Test // 1. marks the method as a test 2. Inform the junit engine what method needs to
			// run.
	@DisplayName("Testing add method") // this annotation is use to display name of test method
	@Tag(value = "MATH")
	void testAdd() {

		int expected = 2;
		// MathUtil mathutil = new MathUtil();
		int actual = mathutil.add(1, 1);
		assertEquals(expected, actual, "the add method should add two numbers");// Assert that expected and actual are
																				// equal.Parameters:expected actual
		// Since:5.4
	}

	@Test
	@Tag(value = "MATH")
	public void testDivide() {
		// MathUtil mathutil = new MathUtil();
		boolean isServerup = false;
		// assumeTrue(isServerup); // conditional execution...if the given parameter is
		// true then execute this test
		// case.
		assertThrows(ArithmeticException.class, () -> mathutil.divide(1, 0), "Arithematic Exception should thrown");
	}

	@Test
	@Tag(value = "MATH") // to selectively run the particlar tagged test method.
							// need to provide the configuration in maven plugin to enabled this features
	@DisplayName("Multiplication test Method")
	void testmultiply() {

	//	System.out.println("Running " + testInfo.getDisplayName() + " with tag " + testInfo.getTags());
	//	testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tag " + testInfo.getTags());
		
		assertAll( // To test multiple test case in one go.
				() -> {
					assertEquals(6, mathutil.multiply(2, 3));
				}, () -> {
					assertEquals(8, mathutil.multiply(4, 2));
				});
	}

	/*
	 * @Test // @EnabledOnOs(OS.MAC) // this test case run only on MAC OS.
	 *
	 * @RepeatedTest(3) // how many times you want to run this test method.
	 *
	 * @DisplayName("test circle area") void testCircleArea(RepetitionInfo rep) { //
	 * MathUtil mathutil = new MathUtil();
	 *
	 * System.out.println("executing test =" + rep.getCurrentRepetition());
	 * assertEquals(314.1592653589793, mathutil.computeCircleArea(10),
	 * "should return right circle area"); }
	 */
	@Test
	void testCircleArea() {
		// MathUtil mathutil = new MathUtil();
		assertEquals(314.1592653589793, mathutil.computeCircleArea(10), "should return right circle area");
	}

	@Test
	@DisplayName("TDD ,method ..should not run")
	@Disabled // will skip this method while executing testing
	void testDisabled() {
		fail("this test should be disabled");
	}

	/*
	 * @Nested is used to signal that the annotated class is a nested,non-static
	 * test class (i.e., an inner class) that can sharesetup and state with an
	 * instance of its enclosing class. The enclosing class may be a top-level test
	 * class oranother @Nested test class, and nesting can be arbitrarily deep.
	 *
	 * Test Instance Lifecycle •A @Nested test class can be configured with its own
	 * Lifecycle mode which may differ from that of an enclosing testclass.
	 * •A @Nested test class cannot change the Lifecyclemode of an enclosing test
	 * class.
	 *
	 */
	@Nested // to test multiple test case for a single method .
	@DisplayName("Add method")
	class AddTest {

		@Test
		@DisplayName("when adding 2 Positive number")
		void testAddPositive() {

			assertEquals(5, mathutil.add(2, 3), "Should return right sum");// Assert that expected and actual are
																			// equal.Parameters:expected actual

		}

		@Test
		@DisplayName("when adding 2 Negetive number")
		void testAddnegetive() {

			assertEquals(-2, mathutil.add(-1, -1), "Should return right sum");// Assert that expected and actual are
																				// equal.Parameters:expected actual

		}

		@Test
		@DisplayName("Assert message supplier")
		void testAddAssertMessageSupplier() {
			int expected = -2;
			int actual = mathutil.add(-1, -1);
			assertEquals(expected, actual, () -> "Should return sum" + expected + "but return sum is" + actual);// Assert
																												// that
																												// expected
																												// and
																												// actual
																												// are
			// equal.Parameters:expected actual

		}
	}
}
