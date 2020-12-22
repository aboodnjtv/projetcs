
public class Sort {
	
	int pivot; // partion
	int pIndex; // partition index
	
	
	public void quickSort(int[] array, int low, int high) {
		if(high>low) {
			pIndex=partition(array, low, high);
			quickSort(array, low, pIndex-1);
			quickSort(array, pIndex+1, high);
		}
	}
	
	
	public int partition(int[] array, int low, int high) {
		
		pivot=array[high];
		pIndex=low;
		
				
		for (int i = low; i < high; i++) {
			if (array[i]<=pivot) {
				swap(array,i,pIndex);
				pIndex++;
			}
		}
		
		
		swap(array,pIndex,high);
				
		return pIndex;
		
	}
	
	
	public void swap(int array[],int one, int two) {
		int temp=array[one];
		array[one]=array[two];
		array[two]=temp;
	}
	
	
	
	public void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

	
}
