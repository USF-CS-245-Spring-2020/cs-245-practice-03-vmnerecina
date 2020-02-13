/* CS245 Practice Assignment 3 recursive search
victoria nerecina
this program:
implements Practice03Search interface (given)

Binary Search: 
	search an already sorted array by repeatedly dividing the search interval in half
	begin with interval covering the whole array
	if the target is less than the median, check the lower half of the interval
	repeatedly check until target is found or interval is emptty

Runtime: 
	best: big-O(1), it is the median
	worst: big-O(lgn), our target is in the first or last index, we are splittin gthe interval in half every time
	average: big-O(lgn/2), can assume our target exist in the array
*/


public class BinaryRecursiveSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{
		return binarySearch(arr, target, 0, arr.length - 1);
	}

	//worked on in class
	public int binarySearch(int [] arr, int target, int min, int max) 
	{
		if (min < max)
		{
			int median = (min+max)/2;
			if(arr[median] == target)
				return median; //found target first try
			else if(arr[median] < target)
				return binarySearch(arr, target, median +1, min); //target will be in the lower half of array
			else
				return binarySearch(arr, target, min, median - 1); //target will be in upper half of array

		} //end of if statement
		return -1; //cant find target
	}
}
