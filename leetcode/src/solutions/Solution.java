package solutions;


public class Solution {
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
	    public int romanToInt(String s) {
	        
		        int outputInt = 0;
		        int i = s.length()-1;
		        char charBefore = 'Z';
		        String currentChar;
		          
		        while (i >= 0) {
		            
		            if (i>0) { 
		            	charBefore = s.charAt(i-1);
		            } else {
		            	charBefore = 'Z';
		            }
		            currentChar = "" + s.charAt(i) + "";
		            --i;
		            
		            switch (currentChar) {
					case "M": { //C can be placed before D and M
						outputInt = outputInt + 1000;	
						if (charBefore == 'C') {
							outputInt = outputInt - 100;
							--i;
				            
						}
						break;
					}
					case "D": { //C can be placed before D and M
						outputInt = outputInt + 500;	
						if (charBefore == 'C') {
							outputInt = outputInt - 100;
							--i;
						}
						break;
					}
					case "C": { //X can be placed before L and C
						outputInt = outputInt + 100;	
						if (charBefore == 'X') {
							outputInt = outputInt - 10;
							--i;
						}
						break;
					}
					case "L": { //X can be placed before L and C
						outputInt = outputInt + 50;	
						if (charBefore == 'X') {
							outputInt = outputInt - 10;
							--i;
						}
						break;
					}
					case "X": { //I can be placed before V and X
						outputInt = outputInt + 10;	
						if (charBefore == 'I') {
							outputInt = outputInt - 1;
							--i;
						}
						break;
					}
					case "V": { //I can be placed before V and X
						outputInt = outputInt + 5;	
						if (charBefore == 'I') {
							outputInt = outputInt - 1;
							--i;
						}
						break;
					}
					case "I": { //I can be placed before V and X
						outputInt = outputInt + 1;	
						break;
					}
	                }
		        }
		        return outputInt;
	        
	    }
	    
}
		

/*/*HashMap<Integer,String> mapInt=new HashMap<Integer,String>();
	        mapInt.put(1,"I");
	        mapInt.put(5, "V");
	        mapInt.put(10, "X");
	        mapInt.put(50, "L");
	        mapInt.put(100, "C");
	        mapInt.put(500, "D");
	        mapInt.put(1000, "M");
	        
	        HashMap<String,Integer> mapOrder=new HashMap<String,Integer>();
	        mapOrder.put("I",1);  //I can be placed before V and X to make 4 and 9
	        mapOrder.put("V",2);
	        mapOrder.put("X",3);   //X can be placed before L and C
	        mapOrder.put("L",4);
	        mapOrder.put("C",5);   
	        mapOrder.put("D",6);
	        mapOrder.put("M",7);*/


