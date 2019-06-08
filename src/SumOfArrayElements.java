//Sum of Array

public class SumOfArrayElements {
	public static void main (String [] args) {
	int[] array1 = {10, 20, 30, 40, 50, 10};
	int sum=0;
	
	//enhanced for loop
	for (int a: array1) {
		sum=sum+a;
	}
	System.out.println("sum is  : " + sum);

}
}
