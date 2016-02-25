
public class NumberCubeQuestion {

	//return the tossed values in an Array 
	public static int[] getCubeTosses(NumberCube numberCube, int length) {
		
		//creates an array of ints that is equal to the length
		int[] tossArray = new int[length]; 
		
		for (int i = 0; i < tossArray.length; i++) {
			
			//the tossArray adds the tossed value to the index i 
			tossArray[i] = numberCube.toss(); 
			
		}
		
		//returns the array
		return tossArray;
	}

	//given an Array of values, find the longest run and get the index at where it begins 
	public static Object getLongestRun(int[] testValues) {
		
		int longestRunNum = -1; 
		
		int longestRunLength = 1; 
		
		int currentNum = testValues[0]; 
		
		int currentChain = 1; 
		
		for (int i = 1; i < testValues.length; i++) {
			
			if (currentNum == testValues[i]) {
				
				currentChain = currentChain + 1; 
				
				if (currentChain > longestRunLength) {
					
					longestRunLength = currentChain; 
					
				}
				
			}else{ 
				
				if(currentChain > 1){
					
					longestRunNum = i - currentChain; 
					
				}
				
				currentChain = 1; 
				
			}
			
			currentNum = testValues[i]; 
			
		}
		
		return longestRunNum;
	}

}
