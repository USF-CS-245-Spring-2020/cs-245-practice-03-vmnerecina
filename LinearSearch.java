/* CS245 Practice Assignment 3 Linear Search
victoria nerecina
this program:
implements Practice03Search interface (given)

Linear Search:
	starting from teh left most value in an array
	making one by one comparisons
	if the target matches the value, then return index
	if tthe target doesnt match any of the values then return -1

Runtime:
	best: big-O(1), target found on first try
	worst: big-O(n), not in the array or last number is the target
	average: big-O(n/2) = big-O(n), assume the target is in the array, middle

*/

public class LinearSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{ 
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] == target) //if target matches the value
				return i; //then return index
		} //end of for loop

		return -1; //cant find target
	}
}
