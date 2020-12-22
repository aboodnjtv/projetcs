
public class Main {

	public static void main(String[] args) {
		
		Sort sort = new Sort();

		int array[]= {7,5,3,6,9,4,2,1,8};
		
		sort.print(array);
		sort.quickSort(array, 0, array.length-1);
		System.out.println();
		sort.print(array);

		
	}

}
