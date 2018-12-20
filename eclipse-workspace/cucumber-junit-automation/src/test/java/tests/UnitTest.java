package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTest {
	
	@BeforeClass
	// in junit beforeclass and after has to be static class
	public static void setup() {
		System.out.println("this is setup before class");
		
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("this is tear down after class");
	}
	@Before 
	public void beforeTest() {
		System.out.println("this is before annotation");
	}
	
	@After
	public void afterTest() {
		System.out.println("this is after annotation");
	}
	
	@Test
	public void test1() {
		System.out.println("This is test 1");
		Assert.assertEquals(4, 4);
	}
	
	@Test
	public void test2() {
		System.out.println("this is test 2");
	}

}
