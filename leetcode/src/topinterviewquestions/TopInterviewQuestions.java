package topinterviewquestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class TopInterviewQuestions {
	
	//----------------------------------------------------------------\
	//STUDY NOTES
	//Indices = index (eg. array[i], i is one)
	//
	//----------------------------------------------------------------\
	
	/*1. Two Sum  Easy

	Share
	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.

	 

	Example 1:

	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	Example 2:

	Input: nums = [3,2,4], target = 6
	Output: [1,2]
	Example 3:

	Input: nums = [3,3], target = 6
	Output: [0,1]
	 

	Constraints:

	2 <= nums.length <= 104
	-109 <= nums[i] <= 109
	-109 <= target <= 109
	Only one valid answer exists.
	 

	Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/
	
	    static public int[] twoSum(int[] nums, int target) {
	    	
	    	for (int i = 0; i < nums.length; i++) {
	    		for (int j = i+1; j < nums.length; j++) {
		    		if (nums[i]+nums[j] == target) {
		    			return new int[] {i,j};
		    		}
		    	}	
	    	}
	    	return null;
	        
	    }
	    //for (Iterator i = c.iterator(); i.hasNext(); ) 
	       //System.out.println(i.next());
	    //
	 /* Iterating over collection 'c' using for-each 
	    //for (Element e: c)
	     //   System.out.println(e);
	    /// Create a link list which stores integer elements
        List<Integer> l=new LinkedList<Integer>();
 
        // Now add elements to the Link List
        l.add(2);
        l.add(3);
        l.add(4);
 
        // Make another Link List which stores integer elements
        List<Integer> s=new LinkedList<Integer>();
        s.add(2);
        s.add(4);
        s.add(5);
        s.add(6);
 
        // Iterator to iterate over a Link List
        for (int a:l)
        {
            for (int b:s)
            {
                if (a<b)
                    System.out.print(a + " ");
            }
        }*/
	    /*static public int[] twoSumIterator(int[] nums, int target) {
	    	
	    	//int[] ints = {1,2,3};
	    	List<Integer> listA = Arrays.stream(nums).boxed().collect(Collectors.toList());
	    	List<Integer> listB = Arrays.stream(nums).boxed().collect(Collectors.toList());


	    	int[] indices = new int[2];
	    	for (Iterator i = listA.iterator(); i.hasNext(); ) {
	    		for (Iterator j = listB.iterator(); j.hasNext(); ) {
		    		if (Integer.parseInt((String) i.next()) + Integer.parseInt((String) i.next()) == target) {
		    			indices[0] = Integer.parseInt((String) i.next()); 
		    			indices[1] = Integer.parseInt((String) i.next());
		    			return indices;
		    		}
		    	}
	    	}
	    	/*for (int i = 0; i < nums.length; i++) {
	    		for (int j = i+1; j < nums.length; j++) {
		    		if (nums[i]+nums[j] == target) {
		    			indices[0] = i; 
		    			indices[1] = j;
		    			return indices;
		    		}
		    	}	
	    	}*/
	    	//return indices;
	        
	    //}
	    
	    /**
	     * Definition for singly-linked list.
	     * The number of nodes in each linked list is in the range [1, 100].
			0 <= Node.val <= 9
			It is guaranteed that the list represents a number that does not have leading zeros.
	     */ 
	     
	     
	     public String getlinkedInt(ListNode ln) {
	    	 if (ln.next == null) {
	    		 return String.valueOf(ln.val);
	    	 }
	    	 return getlinkedInt(ln.next) + "" + String.valueOf(ln.val);
	     }
	     public ListNode getNodeResults(String convertMe, int length) {
	    	 
	    	 ListNode answer = new ListNode();
	    	 if (length > 1) {
	    		 answer.val = Integer.parseInt(""+convertMe.charAt(length-1)+"");
		    	 answer.next = getNodeResults(convertMe, length-1); 
	    	 } else {
	    		 answer.val = Integer.parseInt(""+convertMe.charAt(length-1)+"");
	    	 }
	    	 return answer;
	     }
	    
	     
	    public ListNode addTwoNumbersOld(ListNode l1, ListNode l2) {
	        
	    	String a = getlinkedInt(l1);
	    	String b = getlinkedInt(l2);
	    	//int answer = Integer.parseInt(getlinkedInt(l1)) + Integer.parseInt(getlinkedInt(l2));
	    	int intA = Integer.valueOf(a);
	    	int intB = Integer.valueOf(b);
	    	int answer = intA + intB;
	        String strAnswer = String.valueOf(answer);
	        
	        return getNodeResults(strAnswer, strAnswer.length());
	    }
	    
	    //seems there is a memory leak here::
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		    
	    	ListNode dummyHead = new ListNode(0);
	    	ListNode curr = dummyHead;
	    	int carry = 0;
	    	while (l1 != null || l2 != null || carry != 0) {
	            int x = (l1 != null) ? l1.val : 0;
	            int y = (l2 != null) ? l2.val : 0;
	            int sum = carry + x + y;
	            //System.out.println("sum = "+x+" + "+y+" + "+carry);
	            carry = sum / 10;
	            //System.out.println("carry = sum/10 : "+carry);
	            curr.next = new ListNode(sum % 10);
	            //System.out.println("curr.next.val sum % 10 "+curr.next.val);
	            curr = curr.next;
	            if (l1 != null)
	                l1 = l1.next;
	            if (l2 != null)
	                l2 = l2.next;
	        }
	        return dummyHead.next;
	    }

	    //Meduim
	    //3. Longest Substring Without Repeating Characters
	    /*Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:


0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/
	    public int lengthOfLongestSubstring(String s) {
	    	//System.out.println("");
	        
	    	int length = 0;
	        int start = 0;
	        int end = 0;
	        char charA[] = s.toCharArray().clone();
	        String subStr = "";
	        
	        if (s.length() > 1 ) { //&& s.length() <= 5*104) {
	        	subStr = s.substring(0, 1);        	
	        	for (int i = 0; i < s.length(); i++) {
	        		if (i == 0 || i == start) {
	        			start = i;
	        		} else if (charA[i] == charA[start]) { //if (i != start) {
	        			start = start + 1;
	        		} else if  (charA[i] == charA[i-1]) {
	        			start = i;
	        		} else if (subStr.contains(""+charA[i]+"")) {
	        			start = start + subStr.indexOf(""+charA[i]+"")+1;
	        		} 
	        		end = i;
	        		subStr = s.substring(start, end+1);
	        		length = (end - start + 1 ) > length ? end - start + 1: length;
	        	
	        		//System.out.println("charA["+i+"] : "+charA[i]+" "+subStr+" "+start+" "+end+" "+length);
	        	}
	        	return length;
	        } else if (s.length() == 1) { 
	        	return 1;
	        } else if (s.length() == 0 ) {
	        	return 0;
	        }
	        return -1;
	        
	        //System.out.println("charA["+i+"] : "+charA[i]+" "+subStr+" "+start+" "+end+" "+length);
    		
	    }
	    
	    /*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
		The overall run time complexity should be O(log (m+n))
	     /*Example 1:
			
			Input: nums1 = [1,3], nums2 = [2]
			Output: 2.00000
			Explanation: merged array = [1,2,3] and median is 2.
			Example 2:
			
			Input: nums1 = [1,2], nums2 = [3,4]
			Output: 2.50000
			Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
			Constraints:
			nums1.length == m
			nums2.length == n
			0 <= m <= 1000
			0 <= n <= 1000
			1 <= m + n <= 2000
			-106 <= nums1[i], nums2[i] <= 106
			*/
	    /*I understand the notion of O(n) linear time, 
	     * meaning that the size of the input affects the growth of the algorithm proportionally...
	     * and the same goes for, for example, quadratic time O(n2) etc..even algorithms, 
	     * such as permutation generators, with O(n!) times, that grow by factorials.
	     */
	    //For example, the following function is O(n) because the algorithm grows in proportion to its input n:
	    /*Runtime: 4 ms, faster than 82.15% of Java online submissions for Median of Two Sorted Arrays.
Memory Usage: 43.2 MB, less than 92.56% of Java online submissions for Median of Two Sorted Arrays.
N*/
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        Double median = 0.0;
	        int mergedLength = nums1.length + nums2.length;
	        int[] merged = new int[mergedLength];
	        		
	        for (int i = 0; i < mergedLength; i++) {
	        	if (i < nums1.length) {
	        		merged[i] = nums1[i];
	        	} else {
	        		merged[i] = nums2[i-nums1.length];
	        	}
	        	//System.out.println("Merged "+merged[i]);
		        
	        }
	        Arrays.sort(merged);
	        Boolean isEven = (mergedLength % 2) > 0 ? false : true;
	        //System.out.println(isEven+" "+merged.length);
	        //System.out.println(Arrays.toString(merged));
	        if ( isEven ) {
	        	median = (double) (merged[mergedLength/2] + merged[mergedLength/2-1])/2;
	        	//System.out.println(merged[mergedLength/2]+" + "+merged[mergedLength/2-1]);
	        } else {
	        	median = (double) merged[mergedLength/2];
	        	//System.out.println(merged[mergedLength/2]);
	        }
	        return median;
	    }
	    
	    /*    List<int[]> list1 = Arrays.asList(nums1);//new LinkedList<>();
	        List<int[]> list2 = Arrays.asList(nums2);//new LinkedList<>();
	        LinkedList<int[]> merged = new LinkedList<>(list1);
	        
	        merged.addAll(list2);
	        System.out.println(list1.size()+" "+list1.get(0).length);
	        System.out.println(list2.size()+" "+list2.get(0).length);
	        System.out.println(merged.size()+" "+merged.get(0).length);

	        System.out.println(list2.toString());
	        //list1.a
	        Object[] nums4 = merged.toArray();
	        System.out.println("nums4 : "+nums4.length+" "+nums4.toString()+" "+merged.toString());
	        int nums3[] = new int[merged.size()];
	        for (int i = 0; i < nums4.length; i++) {
	        	nums4[i] = (Integer)nums3[i];
	        	System.out.println(nums3[i]+" to "+nums4[i]);
	        }
	        
	        Arrays.sort(nums3);
	        
	        Boolean isEven = (nums3.length % 2) > 0 ? false : true;
	        if ( isEven ) {
	        	median = (double) ((nums3[(nums3.length / 2)] + nums3[(nums3.length / 2)-1])/2);
	        } else {
	        	median = (double) nums3[((nums3.length-1) / 2)];
	        }
	        return median;
	    }*/
	    
	    //5. Longest Palindromic Substring
	    /*Given a string s, return the longest palindromic substring in s.
		Example 1:
		Input: s = "babad"
		Output: "bab"
		Explanation: "aba" is also a valid answer.
		Example 2:
		Input: s = "cbbd"
		Output: "bb"
		 
		Constraints:
		1 <= s.length <= 1000
		s consist of only digits and English letters.
		*/
	    
	        public String longestPalindrome(String s) {
	        	//System.out.println(s.toString()+"-----------------------");
	            String palindrome = ""+s.charAt(0)+"";
	            String temp = "";
	            Boolean isPalindrome = false;
	            Boolean isFirstIteration = true;
	            char startChar;
	            int x;
	            int indexStart = 0;
	            int indexEnd = s.length()-1;
	            
	            for (int i = 0; i < s.length(); i++) {	
	                startChar = s.charAt(i);
	            	x = s.indexOf(startChar, i+1); //find the matching end char
	            	//System.out.println("s.charAt(i) "+s.charAt(i)+" "+i+" x "+x);
	            	while (x != -1) {
	            		indexStart = i;
	            		//look for palindrome
	            		while (x+1 < s.length() && s.charAt(x+1) == s.charAt(x) && isFirstIteration) {
		            		x++;
		            	}
	            		indexEnd = x;
	         
	            		//check for all same letters in palindrome
	            		while (indexEnd != indexStart && indexEnd > indexStart) {
	            			//System.out.println("s.charAt("+indexStart+") == s.charAt("+indexEnd+") = "+s.charAt(indexStart)+" == "+s.charAt(indexEnd));
	            			if (s.charAt(indexStart) == s.charAt(indexEnd)) {
	            				isPalindrome = true;
	            			} else {
	            				isPalindrome = false;
	            				break;
	            			}
	            			indexEnd--;
	            			indexStart++;
	            		}
	            		if (isPalindrome) {
	            			temp = s.substring(i,x+1);
	            			//System.out.println("temp = "+s.substring(i,x+1));
	            		}
	            		isFirstIteration = false;
	            		x = s.indexOf(startChar, x + 1);
	            	}
	            	
	            	if (temp.length() > palindrome.length()) {
	            		palindrome = temp;
	            	} 
	            }
	            return palindrome;
	        }
	        
	        
//	        6. Zigzag Conversion
	        /*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
	         * (you may want to display this pattern in a fixed font for better legibility)

				P   A   H   N
				A P L S I I G
				Y   I   R
				And then read line by line: "PAHNAPLSIIGYIR"
				
				Write the code that will take a string and make this conversion given a number of rows:
				
				string convert(string s, int numRows);
				 
				
				Example 1:
				
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
				 
				
				Constraints:
				
				1 <= s.length <= 1000
				s consists of English letters (lower-case and upper-case), ',' and '.'.
				1 <= numRows <= 1000
				*/

	        public String convert(String s, int numRows) {
	        	String answer = "";
	        	//List<int[]> list2 = Arrays.asList(nums2);//new LinkedList<>();
		        //LinkedList<int[]> merged = new LinkedList<>(list1);
	        	char[] dummyRow = new char[s.length()];
        		LinkedList<char[]> lists = new LinkedList<>();
	        	int i = 0;
	        	while (i < numRows) {
	        		dummyRow[0] = s.charAt(i);
	        		lists.add(dummyRow);
	        		i++;
	        	}
	        	
	        	//char[] dummyRow2 = new char[s.length()];
        		
	        	//lists.size() == numRows
	        	// Iterator
	            Iterator<char[]> itA = lists.iterator();
	     
	        	int zigZagRow = numRows-2; // start it in the second row from the bottom only ziggin up no zag down
	        	boolean inZig = false;
	        	int column = 0;
	        	for (int j = 0; j < s.length(); j++) {
	        		for (int k = 0; k < numRows; k++) {
	        			dummyRow = lists.get(k);
	        			if (!inZig) {
		        			dummyRow[column] = s.charAt(j);
		        			j++;
		        			if (k == numRows-1) {
		        				inZig = true;   //filled the bottom row start zigging
		        			}
	        			} else { //zig
	        				if (k == zigZagRow) {
	        					dummyRow[column] = s.charAt(j);
			        			zigZagRow++;
			        			j++;
	        				} 
	        				
	        				if (k == numRows-1) {
		        				inZig = false;   //finished filling the zig
		        			}
	        			}
	        			if (j == s.length()) { break; }
	        		}
	        		column++;
	        	}
	        	
	        	for (int j = 0; j < numRows; j++) {
	        		dummyRow = lists.get(j);
	        		for (int k=0; k < dummyRow.length; k++) {
	        			answer =  Character.isLetter(dummyRow[k]) ? answer + "" + dummyRow[k] + "" : answer;
	        			//System.out.println(answer);
	        		}
	        	}
	        	
	        	
	            // Iterator
	            Iterator<char[]> it = lists.descendingIterator();
	            
	            
	            //System.out.println("lists.size "+lists.size());
	            // Condition check for elements in List
	            // using hasNext() method returning true till
	            // there i single element in a List
	            //while (it.hasNext()) {
	            //	answer = answer + Arrays.toString(it.next());
	            //	System.out.println("Arrays.toString(it.next()) "+Arrays.toString(it.next()));
	            	
	                // Print all elements of List
	                //System.out.println(it.next());
	            //}
	        	
	        	return answer;
	        }
	        
	        //7. Reverse Integer
	        /*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).*/
	        
	            public int reverse(int x) {
	            	
	            	int answer = 0; //
	                String reverseMe = String.valueOf(x);
	                Boolean isNegative = false;
	                
	                //find negative
	                if (reverseMe.charAt(0) == '-') {
	                	reverseMe = reverseMe.substring(1);
                		isNegative = true;
                	}
	                
	                String reversed = "";
	                
	                //reverse chars
	                for (int i = 0; i < reverseMe.length(); i++) {
	                	//System.out.println("reversed = reverseMe.charAt(i) + reversed : "+ reverseMe.charAt(i)+" + "+reversed);
	                	reversed = reverseMe.charAt(i) + reversed;
	                }
	                
	                //remove leading zeros
	                while (reversed.charAt(0) == '0') {
	                	if (reversed.length() == 1) {
	                		reversed = "";
	                		break;
	                	} 
	                	reversed = reversed.substring(1);
	                	
	                }
	                try {
	                	answer = isNegative? -1 * Integer.parseInt(reversed) : Integer.parseInt(reversed);	
	                } catch (Exception e) {
	                	answer = 0;
	                }
	                return answer;
	            }
	            
	            /*
	             Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
					
					'.' Matches any single character.​​​​
					'*' Matches zero or more of the preceding element. //matches zero or more before
					The matching should cover the entire input string (not partial).
	             */
	            /*
	             * Constraints:

					1 <= s.length <= 20
					1 <= p.length <= 30
					s contains only lowercase English letters.
					p contains only lowercase English letters, '.', and '*'.
					It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.

	             */
	            public boolean isMatch(String s, String p) {
	            	System.out.println("");
	            	//case one string lengths are the same
	            	boolean isMatch = true;
	            	int j = 0;
	            	boolean isMatchA[] = new boolean[s.length()];
	            	System.out.println(s.toString()+" "+p.toString());
	                
	            	for (int i = 0; i < s.length(); i++) {
	            		try {
	            			System.out.println("s.charAt(i) "+s.charAt(i)+", p.charAt(j) "+p.charAt(j));
		            		
	            			//'*' Matches zero or more of the preceding element. //matches zero or more before
			            	if (p.charAt(j) == '*') {
			            		//'*' Matches zero or more of the preceding element. //matches zero or more before
			            		//check preceeding elements
			            		char preceedingChar = p.charAt(j-1); //get the preceeding character
			            		for (int k = i; k >= 0; k--) {
			            			System.out.println("	s.charAt("+k+") == preceedingChar "+s.charAt(k)+" == "+preceedingChar);
				            		
			            			if (s.charAt(k) == preceedingChar || 
			            					preceedingChar == '.') {
			            				isMatchA[k] = true;
			            			}
			            			System.out.println("	isMatchA[k] "+isMatchA[k]);
			            		}
			            		//'*' Matches zero or more of the preceding element
			            		if (!(s.charAt(i) == preceedingChar)) {
			            			//if the preceeding char doesn't match we can assume matches zero 
			            			//and move on to the next pattern element
			            			i--;
			            			i--;
			            		}
			            	}
			            	else if (s.charAt(i) == p.charAt(j)) {
			            		//match do nothing
		            			isMatchA[i] = true;
			            	} 
		            		//'.' Matches any single character.
			            	else if (p.charAt(j) == '.') {
			            		//still considered a match do nothing
			            		//isMatchA[i] = true;
			            		isMatchA[i] = true;
			            	}
			            	else {
			            		isMatchA[i] = false;
			            		
			            		System.out.println("i < s.length()-1 "+i+" < "+(s.length()-1)+", j < p.length()-1 "+j+" < "+(p.length()-1));
			            		//check for other * values beyound the string to determine if we need to match the preceeding pattern
			            		if (	i == s.length()-1 &&
			            				j < p.length()-1 ) {
				            		if (p.charAt(j+1) == '*') {
				            			i--;
				            		}
			            		}
			            	}
	            		} catch (Exception e) {
	            			System.out.println("CATCH EXCEPTION "+e.toString());
	            		}
	            		j++;
	            	}
	            	
	            	//if there is remaining pattern then the string isn't a full match
	            	if (j < p.length()) {return false;}
	            	
	            	//otherwise check to see if all characters forfill the pattern
	            	int countMatches = 0;
	            	for (int k = 0; k < isMatchA.length; k++) {
	            		if (isMatchA[k] == true) {
	            			countMatches++;
	            		}
	            	}
	            	System.out.println("(countMatches == isMatchA.length) "+countMatches+" == "+isMatchA.length);
	            	//insure the full string is a match
	            	return (countMatches == isMatchA.length) ? true : false;
	            }
	            
	            /*Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

				The algorithm for myAtoi(string s) is as follows:

				1. Read in and ignore any leading whitespace.
				2. Check if the next character (if not already at the end of the string) is '-' or '+'. 
				Read this character in if it is either. 
				This determines if the final result is negative or positive respectively. 
				Assume the result is positive if neither is present.
				
				3. Read in next the characters until the next non-digit character or the end of the input is reached. 
				The rest of the string is ignored.
				
				4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). 
				If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
				
				5. If the integer is out of the 32-bit signed integer range [-231, 231 - 1], 
				then clamp the integer so that it remains in the range. Specifically, 
				integers less than -231 should be clamped to -231, 
				and integers greater than 231 - 1 should be clamped to 231 - 1.
				Return the integer as the final result.
				
				Note:
				Only the space character ' ' is considered a whitespace character.
				Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
				 */
	            
	            public int myAtoi(String s) {
	                int intAnswer = 0;
	                boolean isPositive = true;
	                Double doubleAnswer = 0.0;
	                //System.out.println("Start s "+s.toString());
	                
	                //1. Read in and ignore any leading whitespace.
	                while (s.length() > 0 &&  s.charAt(0) == ' ')  {
	                	s = s.substring(1, s.length());
	                	//System.out.println("First While Loop ");
	                }
	                
	                if (s.length() == 0) {
	                	return intAnswer;
	                }
	                
	                //2. Check if the next character (if not already at the end of the string) is '-' or '+'. 
					//Read this character in if it is either. 
					//This determines if the final result is negative or positive respectively. 
					//Assume the result is positive if neither is present.
					if (s.charAt(0) == '-' || s.charAt(0) == '+') {
						if (s.charAt(0) == '-') {
							isPositive = false;
						}
						s = s.substring(1, s.length());
					} 
	                
					if (s.length() == 0) {
	                	return intAnswer;
	                }
					
					//3. Read in next the characters until the next non-digit character or the end of the input is reached. 
					//The rest of the string is ignored.
					String readin = "";
					//while (s.length() > 0) {
					for (int i = 0; i < s.length(); i++) {
						if (Character.isDigit(s.charAt(i))) {
							readin = readin + s.charAt(i);
						} else {
							break;
						}
						//System.out.println("s "+s.toString()+". i "+i+", s.charAt(i) "+s.charAt(i)+", second while loop "+readin.toString());
					}
					
					//4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). 
					//If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
					if (readin.length() == 0) {
	                	return intAnswer;
	                } else {
	                	doubleAnswer = Double.parseDouble(readin);
	                	
	                	if (isPositive) {
	                		try {
	                			intAnswer = Integer.parseInt(readin);
	                		} catch ( Exception e ) {
	                			intAnswer = Integer.MAX_VALUE;
	                			return intAnswer;
	                		}
	                	} else {
	                		try {
	                			intAnswer = Integer.parseInt(readin);
	                		} catch ( Exception e ) {
	                			intAnswer = Integer.MIN_VALUE;
	                			return intAnswer;
	                		}
	                	}
	                	
	                	if (!isPositive ) {
	                		intAnswer = intAnswer*(-1);
	                	}
	                	
	                	//5. If the integer is out of the 32-bit signed integer range [-231, 231 - 1], 
						//then clamp the integer so that it remains in the range. Specifically, 
						//integers less than -231 should be clamped to -231, 
						//and integers greater than 231 - 1 should be clamped to 231 - 1.
	                	//Integer.to
						//Return the integer as the final result.
	                	//if (doubleAnswer < -231) {
	                	//	intAnswer = -231;
	                	//} else if (doubleAnswer > 231) {
	                	//	intAnswer = 231;
	                	//} 
	                }
					
					//Note:
					//Only the space character ' ' is considered a whitespace character.
					//Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
					
					//System.out.println("Return intAnswer "+intAnswer);
	                //System.out.println("");
	                return intAnswer;
	            }
	            
	            /*Given an integer x, return true if x is a 
					palindrome
					, and false otherwise.*/
	            //Follow up: Could you solve it without converting the integer to a string?

	            public boolean isPalindrome(int x) {
	                boolean isPalindrome = false;
	                
	                //negative numbers arn't palindromes e.g.  -21 != 12-
	                if (x < 0) {
	                	return isPalindrome;
	                }
	                
	                int remainder = 0;
	                int reducedNo = x;
	                int converted = 0;
	                
	                //System.out.println("x "+x);
	                while ( reducedNo > 0 ) {
		                //get the remainder and convert it into the backwards number
		                remainder = reducedNo % 10;  //modulus returns the division remainder
		                //System.out.println("remainder "+remainder);
		                reducedNo = reducedNo / 10;    
		                
		                //System.out.println("reducedNo "+reducedNo);
		                
		                converted = converted*10 + remainder;
		                //System.out.println("converted "+converted);
		                
	                }
	                
	                //System.out.println();
	                if (converted == x) {
	                	isPalindrome = true;
	                }
	                
	                return isPalindrome;
	            }
	            
	            
	            
}