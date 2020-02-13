/* CS245 Practice Assignment 3 iterative search - loops
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


public class BinaryIterativeSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{ 
		int min = 0;
		int max = arr.length - 1;
		while (min <= max)
		{
			int median = (min + max)/2;
			if(arr[median] == target)
				return median; //found target in first try
			if(arr[median] > target)
				max = median - 1; //check lower half of array
			else
				min = median + 1; //check upper half of array
		} //end of while loop
		return - 1;
	}
}
