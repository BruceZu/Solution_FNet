package main.com.fNet.solutions.solution2;

//Time Complexity: O(N) where N is the number of dimensions
//Space Complexity: O(N)
public class MultiDimensionArray {

	// This is a provided function, Assume it works
	public static Long getValue(int... indexOfDimension) {
		// ...
		Long value = 0L;
		return value;
	}

	// lengthOfDeminsion: each dimension's length, assume it is valid:
	// lengthOfDeminsion[i]>0.
	public static Long sum(MultiDimensionArray mArray, int[] lengthOfDemension) {

		Long sum = 0L; // The final sum that has to be returned.

		int numberOfDimensions = lengthOfDemension.length;
		int[] arr = new int[numberOfDimensions]; // Initialize an array with all zeros
		int temp = numberOfDimensions - 2; //inner index 
		//This is considering that the getValue() function will be returning the actual value (mArray) present at the 
		//index being calculated here.
		//We iterate through the lowest dimension working our way to the top by resetting the value of int[] arr to 0 
		//every time we hit the desired index;
		do {
			for (arr[numberOfDimensions - 1] = 0; 
					arr[numberOfDimensions - 1] < lengthOfDemension[numberOfDimensions - 1]; 
					arr[numberOfDimensions - 1]++) {
				sum += getValue(arr);
			}
			while (temp >= 0 && ++arr[temp] == lengthOfDemension[temp]) {
				arr[temp--] = 0;
			}
			if (temp >= 0)
				temp = numberOfDimensions - 2;
		} while (temp >= 0);

		return sum;
	}

}
