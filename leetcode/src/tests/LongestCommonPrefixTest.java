package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import topinterviewquestions.LongestCommonPrefix;

class LongestCommonPrefixTest {

	LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
	/*
	 * Example 1:
		Input: strs = ["flower","flow","flight"]
		Output: "fl"
		
		Example 2:
		*/
	String input1[] = {"flower","flow","flight"};
	
	/*
		Input: strs = ["dog","racecar","car"]
		Output: ""
		Explanation: There is no common prefix among the input strings.
	 */
	
	String input2[] = {"dog","racecar","car"};
	
	String input3[] = {"a"};
	
	String input4[] = {"ab", "a"};
	
	String input5[] = {"a", "ab"};
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		//fail("Not yet implemented");
		System.out.println("Test 1 ----------------------------------");
		Assert.assertEquals( "fl", longestCommonPrefix.longestCommonPrefix(input1));
	}
	@Test
	void test2() {
		//fail("Not yet implemented");
		System.out.println("Test 2 ----------------------------------");
		Assert.assertEquals( "", longestCommonPrefix.longestCommonPrefix(input2));
	}
	@Test
	void test3() {
		//fail("Not yet implemented");
		System.out.println("Test 3 ----------------------------------");
		Assert.assertEquals( "a", longestCommonPrefix.longestCommonPrefix(input3));
	}
	
	@Test
	void test4() {
		//fail("Not yet implemented");
		System.out.println("Test 4 ----------------------------------");
		Assert.assertEquals( "a", longestCommonPrefix.longestCommonPrefix(input4));
	}
	
	@Test
	void test5() {
		//fail("Not yet implemented");
		System.out.println("Test 5 ----------------------------------");
		Assert.assertEquals( "a", longestCommonPrefix.longestCommonPrefix(input5));
	}
}
