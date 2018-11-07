import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayTest {

	//public ArrayTest() {
		// TODO Auto-generated constructor stub
	//}

	public static void main(String[] args) {
	double [] array = {1,2,3,4,5,6,7,8,9,10};
	
	double finalavg = average(array); 
	System.out.println(" The average of the array is : " + finalavg);
	
	String sorted = sort(array); 
	System.out.printf(sorted);
	}
	
	public static String sort (double[] array) {
		Arrays.sort(array);
		String sort = Arrays.toString(array); 
		return sort; 
	}

	public static double average (double [] array) {
		double initial = 0; 
		for(int i =0; i < array.length; i++) {
			initial += array [i];
		}
		double average = (initial/array.length); 
		return average; 
	}
	

	
}