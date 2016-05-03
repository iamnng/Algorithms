package com.study.algorithms.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinearSearchTest {
	private int[] arrayToTestEven = {1, 3, 5, 8, 10, 11, 12, 15};
	private int[] arrayToTestOdd = {1, 3, 5, 8, 10, 11, 12};
	private LinearSearch linearSearch;
	
	@Before
	public void prepare(){
		linearSearch = new LinearSearch();
	}

	@Test
	public void testNumberInLeftMiddleEven(){
		Assert.assertTrue(linearSearch.search(arrayToTestEven, 8));
	}
	
	@Test
	public void testNumberInRightMiddleEven(){
		Assert.assertTrue(linearSearch.search(arrayToTestEven, 10));
	}
	@Test
	public void testNumberInMiddleOdd(){
		Assert.assertTrue(linearSearch.search(arrayToTestOdd, 8));
	}
	
	@Test
	public void testNumberInFirstHalfEven(){
		Assert.assertTrue(linearSearch.search(arrayToTestEven, 3));
	}
	
	@Test
	public void testNumberInSecondHalfEven(){
		Assert.assertTrue(linearSearch.search(arrayToTestEven, 12));
	}
}
