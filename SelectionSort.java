/* CS245 Practice Assignment 3 selection sort
victoria nerecina
this program:
implements Practice03Sort interface (given)

Selection Sort;
	sorts an array by repeatedly finding the minimum value from the unsorted part
	then putting the value at the beginning
	maintains two subarrays in a given array
		1. sorted subarray
		2. the remaining unsorted subarray

Runtime:
	best: big-O(1), found target in first try
	worst: big-O(n^2/2) = big-O(n^2), minimum value is the last value
	average: big-O(n^2)

*/

public class SelectionSort implements Practice03Sort
{
	public void sort(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++) //checking one by one of unsorted array
		{	
			int minIndex = i; //find minimum value
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[j] < a[minIndex])
					minIndex = j; //minimum value of the unsorted array

			} //end of 2nd for loop 

			//putting minIndex into the sorted array
			int temp =  a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;

		}// end of 1st for loop
	}




}