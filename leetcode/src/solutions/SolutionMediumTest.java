package solutions;


import org.junit.Before;
import org.junit.Test;

class SolutionMediumTest {

	SolutionMedium solutionMedium;
	int num1[] = {1, 2};
	int num2[] = {-2, -1};
	int num3[] = {-1, 2};
	int num4[] = {0,2}; 
	int solution1 = 0;
/*	
	Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
			Output: 2
			Explanation:
			The two tuples are:
			1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
			2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
*/

	/*
			Example 2:

			Input: nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
			Output: 1
*/
	int num5[] = {0};
	int num6[] = {0};
	int num7[] = {0};
	int num8[] = {0}; 
	int solution2 = 0;
	
	@Before
	void setUP() {
		solutionMedium = new SolutionMedium();
		solution1 = solutionMedium.tupleSumCountForLoop(num1, num2, num3, num4);
		solution2 = solutionMedium.tupleSumCountForLoop(num5, num6, num7, num8);
	}
	
	@Test
	//@DisplayName("Test Topule Sum Count == 0")
	void testTopulSumCount() {
		setUP();
		//assertEquals(solution1, 2, "solutionMedium.tupleSumCount(num1, num2, num3, num4)");
		System.out.println();
		//assertEquals(solution2, 1, "solutionMedium.tupleSumCount(num5, num6, num7, num8) != 1)");
		
		
	}

}
