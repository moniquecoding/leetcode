package topinterviewquestions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


class TopInterviewQuestionsTest {
	
	TopInterviewQuestions topInterviewQuestions = new TopInterviewQuestions();
	int nums1[] = {3, 2, 3};
	int numsAnswer[];
	int numsSolution[] = {0,2};
	String testString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~";

	ListNode newListNodeT0 = new ListNode();
	ListNode newListNodeT1 = new ListNode();
	ListNode newListNodeT2 = new ListNode();
	ListNode newListNodeT3 = new ListNode();
	ListNode newListNodeT4 = new ListNode();
	ListNode newListNodeT5 = new ListNode();
	ListNode newListNodeT6 = new ListNode();
	ListNode newListNodeT7 = new ListNode();
	ListNode newListNodeT8 = new ListNode();
	ListNode newListNodeT9 = new ListNode();
	ListNode newListNodeT10 = new ListNode();
	ListNode ans1Pass = new ListNode();
	ListNode newListNodeT12 = new ListNode();
	ListNode newListNodeT13 = new ListNode();
	ListNode newListNodeT14 = new ListNode();
	ListNode newListNodeT15 = new ListNode();
	ListNode newListNodeT16 = new ListNode();
	ListNode newListNodeT17 = new ListNode();
	ListNode newListNodeT18 = new ListNode();
	ListNode ans1Test;
	
	//Q3
	String input1StrQ3;
	int output1IntQ3;
	String input2StrQ3;
	int output2IntQ3;
	String input3StrQ3;
	int output3IntQ3;
		
	@Before 
	void setupTest1() {
		numsAnswer = topInterviewQuestions.twoSum(nums1, 6);
	}
	
	@Test
	void testTwoSumEasy() {
		setupTest1();
		assertArrayEquals(numsSolution,numsAnswer);
	}
	
	
	
	@Before 
	void setupTest2() {
		//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
		//		Output: [8,9,9,9,0,0,0,1]
		newListNodeT0.val = 9;
		newListNodeT10.val = 9;
		newListNodeT9.val = 9;
		newListNodeT8.val = 9;
		newListNodeT7.val = 9;
		newListNodeT6.val = 9;
		newListNodeT5.val = 9;
		
		newListNodeT9.next = newListNodeT10;
		newListNodeT8.next = newListNodeT9;
		newListNodeT7.next = newListNodeT8;
		newListNodeT6.next = newListNodeT7;
		newListNodeT5.next = newListNodeT6;
		newListNodeT0.next = newListNodeT5;
		
		
		newListNodeT4.val = 9;
		newListNodeT3.val = 9;
		newListNodeT2.val = 9;
		newListNodeT1.val = 9;
		
		newListNodeT3.next = newListNodeT4;
		newListNodeT2.next = newListNodeT3;
		newListNodeT1.next = newListNodeT2;
		
		//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
				//		Output: [8,9,9,9,0,0,0,1]
		ans1Pass.val = 8;
		newListNodeT12.val = 9;
		newListNodeT13.val = 9;
		newListNodeT14.val = 9;
		newListNodeT15.val = 0;
		newListNodeT16.val = 0;
		newListNodeT17.val = 0;
		newListNodeT18.val = 1;
		
		newListNodeT17.next = newListNodeT18;
		newListNodeT16.next = newListNodeT17;
		newListNodeT15.next = newListNodeT16;
		newListNodeT14.next = newListNodeT15;
		newListNodeT13.next = newListNodeT14;
		newListNodeT12.next = newListNodeT13;
		ans1Pass.next = newListNodeT12;
		
		ans1Test = topInterviewQuestions.addTwoNumbers(newListNodeT0, newListNodeT1);
		
	}
	//@Test
	void testAddTwoNumbers () {
		setupTest2();
		
		while (ans1Pass != null || ans1Test != null) {
			if (ans1Pass == null || ans1Test == null) { fail("ListNode ends at null != Correct Answer");}
			if (ans1Pass.val != ans1Test.val) { fail("ListNode val: "+ans1Test.val+" != Correct Answer: "+ ans1Pass.val);}	
		}
		
	}
	
	@Before 
	void setupTeset3(){
		//Example 1:
		input1StrQ3 = "abcabcbb";
		output1IntQ3 = 3;
		//Explanation: The answer is "abc", with the length of 3.
				
		//Example 2:
		input2StrQ3 = "bbbbb";
		output2IntQ3 = 1;
		//Explanation: The answer is "b", with the length of 1.
				
		//Example 3:
		input3StrQ3 = "pwwkew";
		output3IntQ3 = 3;
		//Explanation: The answer is "wke", with the length of 3.
		//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
		
	}
	@Test
	void lengthOfLongestSubstring () {
		setupTeset3();
		assertEquals(3, topInterviewQuestions.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(output2IntQ3, topInterviewQuestions.lengthOfLongestSubstring(input2StrQ3));
		assertEquals(3, topInterviewQuestions.lengthOfLongestSubstring("pwwkew"));
		assertEquals(3, topInterviewQuestions.lengthOfLongestSubstring("dvdf"));
		assertEquals(0, topInterviewQuestions.lengthOfLongestSubstring(""));
		assertEquals(1, topInterviewQuestions.lengthOfLongestSubstring(" "));
		assertEquals(2, topInterviewQuestions.lengthOfLongestSubstring("aab"));
		assertEquals(1, topInterviewQuestions.lengthOfLongestSubstring("aa"));
		assertEquals(2, topInterviewQuestions.lengthOfLongestSubstring(" a"));
		assertEquals(3, topInterviewQuestions.lengthOfLongestSubstring(" ab"));
		assertEquals(2, topInterviewQuestions.lengthOfLongestSubstring("  b"));
		assertEquals(1, topInterviewQuestions.lengthOfLongestSubstring("  "));
		assertEquals(6, topInterviewQuestions.lengthOfLongestSubstring("ohvhjdml"));
		assertEquals(6, topInterviewQuestions.lengthOfLongestSubstring("wobgrovw"));
		//assertEquals(26+12, topInterviewQuestions.lengthOfLongestSubstring(testString));
		//"ohvhjdml"
	}
	
	int nums1Q4[] = {1,3}; 
	int nums2Q4[] = {2};
	int nums3Q4[] = {1, 2};
	int nums4Q4[] = {3, 4};
	
	@Test
	void findMedianSortedArrays () {
		assertEquals(2, topInterviewQuestions.findMedianSortedArrays(nums1Q4, nums2Q4));
		assertEquals(2.5, topInterviewQuestions.findMedianSortedArrays(nums3Q4, nums4Q4));
	}
	
	
	@Test
	void longestPalindrome () {
		//assertEquals("bab", topInterviewQuestions.longestPalindrome("ababc"));
		assertEquals("bb", topInterviewQuestions.longestPalindrome("cbbd"));
		assertEquals("ccc", topInterviewQuestions.longestPalindrome("ccc"));
		assertEquals("ccc", topInterviewQuestions.longestPalindrome("fccc"));
		assertEquals("ccc", topInterviewQuestions.longestPalindrome("cccf"));
		assertEquals("bb", topInterviewQuestions.longestPalindrome("abb"));
		assertEquals("xaabacxcabaax", topInterviewQuestions.longestPalindrome("xaabacxcabaaxcabaax"));
		assertEquals("aaabaaa", topInterviewQuestions.longestPalindrome("aaabaaaa"));
		assertEquals("sknks", topInterviewQuestions.longestPalindrome("jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel"));
		
	}
	
	
	/*				Example 1:
	
	Input: s = "PAYPALISHIRING", numRows = 3
	Output: "PAHNAPLSIIGYIR"
	Example 2:
	
	Input: s = "PAYPALISHIRING", numRows = 4
	Output: "PINALSIGYAHRPI"
	Explanation:
	P     I    N
	A   L S  I G
	Y A   H R
	P     I
	Example 3:
	
	Input: s = "A", numRows = 1
	Output: "A"
*/
	@Test 
	void convertZigZag () {
		//assertEquals("PAHNAPLSIIGYIR", topInterviewQuestions.convert("PAYPALISHIRING", 3));
		//assertEquals("PINALSIGYAHRPI", topInterviewQuestions.convert("PAYPALISHIRING", 4));
	}
	
	/*Example 1:

		Input: x = 123
		Output: 321
		Example 2:
		
		Input: x = -123
		Output: -321
		Example 3:
		
		Input: x = 120
		Output: 21
		*/
	
	@Test 
	void reverseTest () {
		assertEquals(321, topInterviewQuestions.reverse(123));
		assertEquals(-123, topInterviewQuestions.reverse(-321));
		assertEquals(21, topInterviewQuestions.reverse(120));
		//assertEquals(1534236469, topInterviewQuestions.reverse(9646324351));
	}
	
	/*Example 1:
	Input: s = "aa", p = "a"
	Output: false
	Explanation: "a" does not match the entire string "aa".
	Example 2:
	
	Input: s = "aa", p = "a*"
	Output: true
	Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
	Example 3:
	
	Input: s = "ab", p = ".*"
	Output: true
	Explanation: ".*" means "zero or more (*) of any character (.)".*/
	
	@Test 
	void isMatchTest () {
		assertEquals(true, topInterviewQuestions.isMatch("aab", "c*a*b"));
		assertEquals(false, topInterviewQuestions.isMatch("aa", "a"));
		assertEquals(true, topInterviewQuestions.isMatch("aa", "a*"));
		assertEquals(true, topInterviewQuestions.isMatch("ab", ".*"));
		assertEquals(true, topInterviewQuestions.isMatch("mississippi", "mis*is*ip*."));

		assertEquals(false, topInterviewQuestions.isMatch("aaa", "aaaa"));
		assertEquals(true, topInterviewQuestions.isMatch("aaa", "ab*ac*a"));
		
	}
	
	/*
	 * Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-231, 231 - 1], the final result is 42.
Example 2:

Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42.
Example 3:

Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
 

Constraints:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
*/
	
	@Test 
	void testAtoi() {
		//Input: s = "42"
		//Output: 42
		assertEquals(42, topInterviewQuestions.myAtoi("42"));
		assertEquals(-42, topInterviewQuestions.myAtoi("-42"));
		
		//
		//Input: s = "4193 with words"
		//		Output: 4193
		assertEquals(4193, topInterviewQuestions.myAtoi("4193 with words"));
		
		assertEquals(123, topInterviewQuestions.myAtoi("   123"));
		assertEquals(-123, topInterviewQuestions.myAtoi("   -123"));
		assertEquals(0, topInterviewQuestions.myAtoi("           "));
		assertEquals(0, topInterviewQuestions.myAtoi("words and 987"));
		assertEquals(0, topInterviewQuestions.myAtoi("words 987 words"));
		//-91283472332
		//assertEquals(1534236469, topInterviewQuestions.reverse(9646324351));
		assertEquals(Integer.MIN_VALUE, topInterviewQuestions.myAtoi("-91283472332"));
		assertEquals(Integer.MAX_VALUE, topInterviewQuestions.myAtoi("91283472332"));
		
	}
	
	@Test
	void testIsPalendron() {
		assertEquals(false, topInterviewQuestions.isPalindrome(123));
		assertEquals(false, topInterviewQuestions.isPalindrome(-12321));
		assertEquals(true, topInterviewQuestions.isPalindrome(123321));
		assertEquals(true, topInterviewQuestions.isPalindrome(12321));
	}
}
