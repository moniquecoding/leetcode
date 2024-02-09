package topinterviewquestions;

/********************************************
 * Container With Most Water
 * @author moniq
 * solution to 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/
 */

/*You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, 
 * such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.

Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:

Input: height = [1,1]
Output: 1

Constraints:

    n == height.length
    2 <= n <= 10pow5
    0 <= height[i] <= 104

*/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
    	
    	//correct answer from site
        int ans = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
          final int minHeight = Math.min(height[l], height[r]);
          ans = Math.max(ans, minHeight * (r - l));
          if (height[l] < height[r])
            ++l;
          else
            --r;
        }

        return ans;
        
/*    	
    	int maxArea = 0;
    	    	  
    	//only process the function within the given constraints
    	//constraint 1. 2 <= n 
    	if (height.length < 2 ) {
    		return maxArea;
    	}
    	//if (height.length < 2 || height.length > Math.pow(10, 5) ) {
    	int startCurrent = 0;
    	int start = 0;

    	int endCurrent = 0;
    	int end = 0;

    	int intHieght = 0;
    	int intWidth = 0;

    	//System.out.println("height.length "+height.length);
    	//only process the function within the given constraints
    	//constraint 2. n <= 10pow5
        for (int i = 0; (i < height.length && i <= Math.pow(10, 5)); i++) {
        	startCurrent = height[i];
        	//System.out.println("start for loop i "+i);
        	//constraint 3. 0 <= height[i] capping value
        	if ( 0 > height[i]) {
        		startCurrent = 0;
        	}

	    	start = startCurrent;
	    	//if one number is zero then we know the multiplication results are zero no matter what so skip the second loop
	    	if (start == 0 ) {
	    		
	    	} else {
		    	for (int j = i+1; ((j < height.length) && (j <= Math.pow(10, 5))); j++) {
		    		//System.out.println("start for loop j "+j);
		    		endCurrent = height[j];
		    		
		    		if (endCurrent != 0) { //only worth processing if it isn't zero otherwise all the water spills out
			        	//constraint 3. 0 <= height[i] capping it
			        	if ( 0 > height[j]) {
			        		endCurrent = 0;
			        	}
				    	 
				    	end = endCurrent;
				    	
				    	//use the shortest height
				    	intHieght = end;
				    	if (start < end) {
				    		intHieght = start;
				    	} 
				    	
				    	//end index minus the start index to determine width
						intWidth = j-i; 
				    	System.out.println("intWidth "+intWidth+" * intHieght "+intHieght+" = "+intHieght*intWidth+" or maxArea "+maxArea);
				    	//determine if current area is the largest
				    	if ( ( intHieght*intWidth) > maxArea) {
				    		maxArea = intHieght*intWidth;
				    	}
		    		}
		    	}
	    	}
	    	System.out.println("");

		}
        return maxArea;*/
    }
}
