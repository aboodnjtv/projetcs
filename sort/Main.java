import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Sort sort = new Sort();

		int array[]= {9,7,2,8,5,6,2,0,9,3,7,5,0,9,1,6,5,9};
		
		
		
		sort.print(array);
		sort.quickSort(array);
		System.out.println();
		sort.print(array);
			
		

		
	}

}
