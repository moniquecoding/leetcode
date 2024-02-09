package topinterviewquestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
	
	//Longest Common Prefix
	/* Write a function to find the longest common prefix string amongst an array of strings.
	 * If there is no common prefix, return an empty string "".
	 * 
	 */
	
	/*Constraints:

	    1 <= strs.length <= 200
	    0 <= strs[i].length <= 200
	    strs[i] consists of only lowercase English letters.
	*/
	
    public String longestCommonPrefix(String[] strs) {
        String strLongestCommonPrefix = "";
        String currentStr = strs[0];
        String tempPrefix = "";
        String nextPrefix = "";
        
        Arrays.sort(strs);

        if (strs.length == 1) {
        	return strs[0];
        }
        for ( int intPrefixEndChar = 1; intPrefixEndChar <= currentStr.length(); intPrefixEndChar++ ) {
        	tempPrefix = currentStr.substring(0, intPrefixEndChar);
        	//System.out.println("tempPrefix "+tempPrefix);
    		
        	for ( int i = 1; i < strs.length; i++ ) {
        		currentStr = strs[i];
        		//catch exception if the next string is out of bounds.
        		if (intPrefixEndChar > currentStr.length()) {
        			//System.out.println("break 1");
        			break;
        		}
        		nextPrefix = currentStr.substring(0,intPrefixEndChar);
        		//System.out.println("nextPrefix "+nextPrefix);
        		if (!tempPrefix.equals(nextPrefix)) {
        			//System.out.println("break 2 "+tempPrefix+" != "+nextPrefix+" "+(tempPrefix != nextPrefix)+",  tempPrefix.equals(nextPrefix)"+tempPrefix.equals(nextPrefix)+",  tempPrefix.compareTo(nextPrefix)"+tempPrefix.compareTo(nextPrefix));
        			break;
        			
        		//we loop through all strings without a break
        		//and they are all equal when we reach the last string 
        		//then it means we found a common prefix
        		} else if ( tempPrefix.equals(nextPrefix) && 
        				i == strs.length-1) {
        			strLongestCommonPrefix = tempPrefix;
        			//System.out.println("strLongestCommonPrefix "+strLongestCommonPrefix);
        		}
        	}
        	currentStr = strs[0];
        }
        return strLongestCommonPrefix;
    }
}
