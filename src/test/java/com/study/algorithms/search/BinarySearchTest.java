package com.study.algorithms.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BinarySearchTest {
	private int[] arrayToTestEven = {1, 3, 5, 8, 10, 11, 12, 15};
	private int[] arrayToTestOdd = {1, 3, 5, 8, 10, 11, 12};
	private BinarySearch binarySearch;
	
	@Before
	public void prepare(){
		binarySearch = new BinarySearch();
	}

	@Test
	public void testNumberInLeftMiddleEven(){
		Assert.assertTrue(binarySearch.search(arrayToTestEven, 8));
	}
	
	@Test
	public void testNumberInRightMiddleEven(){
		Assert.assertTrue(binarySearch.search(arrayToTestEven, 10));
	}
	@Test
	public void testNumberInMiddleOdd(){
		Assert.assertTrue(binarySearch.search(arrayToTestOdd, 8));
	}
	
	@Test
	public void testNumberInFirstHalfEven(){
		Assert.assertTrue(binarySearch.search(arrayToTestEven, 3));
	}
	
	@Test
	public void testNumberInSecondHalfEven(){
		Assert.assertTrue(binarySearch.search(arrayToTestEven, 12));
	}
}
