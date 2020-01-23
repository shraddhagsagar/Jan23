package com.sears.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic {

	
	@Test
	public void test() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test1() {
		Assert.assertFalse(false);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("actual", "actual");
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(false, "not matching the conditions");
	}
	
	
}
