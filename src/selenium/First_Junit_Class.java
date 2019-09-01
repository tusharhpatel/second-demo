package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class First_Junit_Class {

	@Before
	public  void setUpBefore() throws Exception {
		System.out.println("he can login in server");
	}

	@After
	public  void tearDownAfter() throws Exception {
		System.out.println("she can login in server");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("We can login in server");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("It can login in server");
	}

	@Test
	public void test() {
		
	}

}
