package solutions;
//import java.util.Vector;

public class SolutionMedium {
	
	
	
		/*Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:

		0 <= i, j, k, l < n
		nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
		 

		Example 1:

		Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
		Output: 2
		Explanation:
		The two tuples are:
		1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
		2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
		Example 2:

		Input: nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
		Output: 1
		 

		Constraints:

		n == nums1.length
		n == nums2.length
		n == nums3.length
		n == nums4.length
		1 <= n <= 200
		-228 <= nums1[i], nums2[i], nums3[i], nums4[i] <= 228 */
	//SUBMITTED TO LEETCODE
    public int tupleSumCountForLoopVector(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
    	//Vector<Integer> v1 = new Vector<Integer>();
    	//Vector<Integer> v2 = new Vector<Integer>();
    	//Vector<Integer> v3 = new Vector<Integer>();
    	//Vector<Integer> v4 = new Vector<Integer>();
    	      
		int totalValue = -1;
        int countOfSumZero = 0; 
        if (nums1.length > 200 || nums2.length > 200 || nums3.length > 200 || nums4.length > 200 ) {
        	return -1;
        }
		
        //0 <= i, j, k, l < n
        //nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
        for (int intTuple1 = 0; intTuple1 <nums1.length; ++intTuple1) {
        	for (int intTuple2 = 0; intTuple2 <nums2.length; ++intTuple2) {
        		for (int intTuple3 = 0; intTuple3 <nums3.length; ++intTuple3) {
        			for (int intTuple4 = 0; intTuple4 <nums4.length; ++intTuple4) {
        				totalValue = nums1[intTuple1] + nums2[intTuple2] + nums3[intTuple3] + nums4[intTuple4];
        				if (totalValue == 0) { countOfSumZero++;}
        	        }
    	        }	
	        }
        }
        return countOfSumZero;
    }
	public int tupleSumCountForLoop(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
		int totalValue = -1;
        int countOfSumZero = 0; 
		
        //0 <= i, j, k, l < n
        //nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
        for (int intTuple1 = 0; intTuple1 <nums1.length; ++intTuple1) {
        	for (int intTuple2 = 0; intTuple2 <nums2.length; ++intTuple2) {
        		for (int intTuple3 = 0; intTuple3 <nums3.length; ++intTuple3) {
        			for (int intTuple4 = 0; intTuple4 <nums4.length; ++intTuple4) {
        				totalValue = nums1[intTuple1] + nums2[intTuple2] + nums3[intTuple3] + nums4[intTuple4];
        				if (totalValue == 0) { countOfSumZero++;}
        	        }
    	        }	
	        }
        }
        return countOfSumZero;
    }
	public int tupleSumCountWhileLoop(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
	        int answerInt = 0;
	        //assuming .length of all arrays are equal and less then or equal to 200
	        int intTuple1 = 0;
	        int intTuple2 = 0;
	        int intTuple3 = 0;
	        int intTuple4 = 0;
	        
	        int totalValue = -1;
	        int countOfSumZero = 0;  //nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
			
	        //0 <= i, j, k, l < n
	        //	nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
	        while(intTuple1 < nums1.length) {
	        	while(intTuple2 < nums1.length) {
	        		while(intTuple3 < nums1.length) {
	        			while(intTuple4 < nums1.length) {
	        				totalValue = nums1[intTuple1] + nums2[intTuple2] + nums3[intTuple3] + nums4[intTuple4];
	        				if (totalValue == 0) {
	        					countOfSumZero++;
	        					System.out.println("nums1[" + intTuple1 + "] + nums2[" + intTuple2 + "] + nums3[" + intTuple3 + "] + nums4[" + intTuple4 + "]");
	        					System.out.println("countOfSumZero : "+ countOfSumZero + '\n');
	        				}
	        				intTuple4++;
	        	        }
	        			intTuple4 = 0;
	        			intTuple3++;
	    	        }
	        		intTuple3 = 0;
	        		intTuple2++;
		        }
	        	intTuple2 = 0;
	        	intTuple1++;
	        }
	        answerInt = countOfSumZero;
	        return answerInt;
	    }
		public int tupleSumCountForLoopContrants(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
	        //assuming .length of all arrays are equal and less then or equal to 200
	        
	        int totalValue = -1;
	        int countOfSumZero = 0; 
	        if (nums1.length > 200 || nums2.length > 200 || nums3.length > 200 || nums4.length > 200 ) {
	        	return 0;
	        }
			
	        //0 <= i, j, k, l < n
	        //	nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
	        for (int intTuple1 = 0; intTuple1 <nums1.length; ++intTuple1) {
	        	for (int intTuple2 = 0; intTuple2 <nums2.length; ++intTuple2) {
	        		for (int intTuple3 = 0; intTuple3 <nums3.length; ++intTuple3) {
	        			for (int intTuple4 = 0; intTuple4 <nums4.length; ++intTuple4) {
	        				totalValue = nums1[intTuple1] + nums2[intTuple2] + nums3[intTuple3] + nums4[intTuple4];
	        				if (totalValue == 0) { countOfSumZero++; }
	        				System.out.println("nums1[" + intTuple1 + "] + nums2[" + intTuple2 + "] + nums3[" + intTuple3 + "] + nums4[" + intTuple4 + "]");
        					System.out.println("countOfSumZero : "+ countOfSumZero + '\n');
	        	        }
	    	        }	
		        }
	        }
	        return countOfSumZero;
	    }
		

}
