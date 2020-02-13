/* CS245 Practice Assignment 3 bubble sort
victoria nerecina
this program:
implements Practice03Sort interface (given)

Bubble Sort:
	take two adjacent values and compare which is smaller

Runtiem:
	best: big-O(n), all in order, runs n-1 times = big-O(n)
	worst: big-O(n^2), reversed order
	average: big-O(n^2), same as worst

*/

public class BubbleSort implements Practice03Sort
{
	public void sort(int [] a)
	{
		int passes = 1;
		int temp = 0;
		boolean swapped = true; //swapped = true = sorted
		while (swapped)
		{
			swapped = false; 
			for(int i = 0; i < a.length - passes; i++)
			{	
				//comparing ttwo adjacent values
				if(a[i] > a[i+1]) //if the previous value is greater than the next
					temp = a[i]; //swap, trade places
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true; //sorted

			} //ed of for loop
			++passes;
		} //ed of while loop

	}
}