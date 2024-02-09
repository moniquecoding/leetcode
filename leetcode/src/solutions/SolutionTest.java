package solutions;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class SolutionTest {

	Solution solution;
	String inputStr1; 
	String inputStr2; 
	String inputStr3; 
	int solution1;
	int solution2;
	int solution3;
	int answer1;
	int answer2;
	int answer3;
	
	@Before
	void setUP() {
		solution = new Solution();
		inputStr1 = "III";
		inputStr2 = "LVIII";
		inputStr3 = "MCMXCIV";
		System.out.println("");
		solution1 = solution.romanToInt(inputStr1);
		System.out.println("");
		solution2 = solution.romanToInt(inputStr2);
		System.out.println("");
		solution3 = solution.romanToInt(inputStr3);
		System.out.println("");
		System.out.println("");
		answer1 = 3;
		answer2 = 58;
		answer3 = 1994;
	}
	
	@Test
	//@DisplayName("Test Convert Roman Numbers to Integers")
	
	void testRomanToInt() {
		
		setUP();
		
		//fail("Not yet implemented");
		//assertEquals(answer2, answer1);
		assertEquals("solution.romanToInt(inputStr1) should work", answer1, solution1);
		 
		System.out.println("input : " + "" + answer1 + "" + ", output : "+ ""+ solution1 +"");
		System.out.println("");
		
		assertEquals("solution.romanToInt(inputStr1) should work", answer2, solution2);
		//System.out.println("solution.romanToInt(inputStr1) : " + solution.romanToInt(inputStr1));
		System.out.println("input : " + "" + answer2 + "" + ", output : "+ ""+ solution2 +"");
		System.out.println("");
		
		assertEquals("solution.romanToInt(inputStr1) should work", answer3, solution3);
		//System.out.print("solution.romanToInt(inputStr1) : " + solution.romanToInt(inputStr1));
		System.out.println("input : " + "" + answer3 + "" + ", output : "+ ""+ solution3 +"");
		System.out.println("");
		
	}
	/*Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

}
