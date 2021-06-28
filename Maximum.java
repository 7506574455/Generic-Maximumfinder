ackage com.Generic;

public class Maximum {
	public static void main(String[] args) {
		Float x = 3.4f;
		Float y = 4.6f;
		Float z = 6.7f;
		findMaximum(x,y,z);
		
	}
	
	private static void findMaximum(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(x)>0) {
			max = y;
	}
		if (z.compareTo(max)>0) {
			max = z;
		}
	 System.out.println("Maximum of numbers are " +max);
		
	}

}
