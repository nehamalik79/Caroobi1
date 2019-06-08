
public class test2 {
public static void main (String [] args) {
	
	//how to sum up all the elements of an array.
	
	int[] array = {10, 20, 30, 40, 50, 10}; //160
	int sum =0;
	
	for (int i=0; i<array.length; i++) {
		sum =sum+array[i];
	}
	System.out.println("sum is   " +sum);
}

}
