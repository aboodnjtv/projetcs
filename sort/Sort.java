/*
 	//////////////////////////////////////////////////////////////////////////////////////
	// *******								Sort								******* //
	//////////////////////////////////////////////////////////////////////////////////////
 
 This class provides these sorting techniques:
 1) Bubble Sort		(O(n^2))
 2) Selection Sort 	(O(n^2))
 3) Insertion sort	(O(n^2))
 4) Merge Sort		(O(n*log(n))	***Under Construction***
 5) Quick Sort		(O(n*log(n))
 6) Heap Sort		(O(n*log(n))	***Under Construction***
 
 */



/*
 
 make sure to check for the null and 0 size arrays and a pre condition
 
 
 */

public class Sort {
	
		
 	//////////////////////////////////////////////////////////////////////////////////////
	// *******					Bubble	Sort	Algorithm						******* //
	//////////////////////////////////////////////////////////////////////////////////////
	
	//bubbleSort(int array[])
	//Uses the bubble Sort algorithm to sort a given array of integers
	public void bubbleSort(int[] array) {
		
		if (array.length>1) {
			for (int i = 0; i < array.length-1; i++) {
				for (int j = 1; j < array.length-i; j++) {
					if(array[j]<array[j-1]) {
						swap(array, j, j-1);
					}	
				}
			}
		}

	}
	
	
	
 	//////////////////////////////////////////////////////////////////////////////////////
	// *******				Selection	Sort	Algorithm						******* //
	//////////////////////////////////////////////////////////////////////////////////////
	
	//selectionSort()
	//Uses the Selection Sort algorithm to sort a given array of integers
	public void selectionSort(int[] array) {		
		if(array.length>0) {
			int minIndex;
			int min;
			for (int i = 0; i < array.length; i++) {
				min=array[i];
				minIndex=i;
				for (int j = i; j < array.length; j++) {
					if (min>array[j]) {
						min=array[j];
						minIndex=j;
						
					}
				}
				swap(array, minIndex, i);
			}
		}
	}
	
	
	
 	//////////////////////////////////////////////////////////////////////////////////////
	// *******					Insertion	Sort	Algorithm					******* //
	//////////////////////////////////////////////////////////////////////////////////////

	public void insertionSort(int[] array) {
		if (array.length>0) {
			for (int i = 1; i < array.length; i++) {
				int current=i;
				for (int j = i; j > -1; j--) {
					if (array[current]<array[j]) {
						swap(array, current, j);
						current=j;
					}
				}
			}
		}
	}
	

	
	
 	//////////////////////////////////////////////////////////////////////////////////////
	// *******					Quick	Sort	Algorithm						******* //
	//////////////////////////////////////////////////////////////////////////////////////
	
	private int pivot; // quick sort pivot
	private int pIndex; // quick sort partition index
	private int random; // for a random number 
	
	//quickSort(int array[])
	//Uses the quick sort algorithm to sort a given array of integers
	public void quickSort(int array[]) {
		quickSort(array, 0, array.length-1); // calls quick sort and passes the required parameters
	}
	
	// the function that does the quick sort algorithm
	private void quickSort(int[] array, int low, int high) {
		if(high>low) {
			pIndex=partition(array, low, high);
			quickSort(array, low, pIndex-1);
			quickSort(array, pIndex+1, high);
		}
	}
	
	// partition
	// a helper function for the quickSort function
	// it takes a random index, and swap it with the last element, and then use the last element as a pivot
	// all the numbers smaller than the pivot will be to the left of the pivot
	// all the numbers greater than the pivot will be to the right of the pivot
	private int partition(int[] array, int low, int high) {
		
		//pick a random index, and swap it with the last element
		random=(int)Math.random()*(high-low+1)+low;
		swap(array, random, high);
		pivot=array[high];
		pIndex=low;
		
		//performs the partition		
		for (int i = low; i < high; i++) {
			if (array[i]<=pivot) {
				swap(array,i,pIndex);
				pIndex++;
			}
		}
		swap(array,pIndex,high);	
		return pIndex;
	}
	
	

	


 	//////////////////////////////////////////////////////////////////////////////////////
	// *******						Helper	Functions							******* //
	//////////////////////////////////////////////////////////////////////////////////////
	
	// swap()
	// swaps two elements in a given array, (given their indices)
	private void swap(int array[],int one, int two) {
		int temp=array[one];
		array[one]=array[two];
		array[two]=temp;
	}
	
	
	// print(int[] array)
	// a function that prints out the array 
	public void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}	
	}

}
