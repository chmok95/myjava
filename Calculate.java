public class Calculate {
	public static void main(String args[]) {
		float first= Float.valueOf(args[0]);
		float second = Float.valueOf(args[1]);

		System.out.println("Calculate...");
		
		
		//int first= Integer.valueOf(args[0]);
		//int second = Integer.valueOf(args[1]);

		Float sum = first + second;	
		Float multiply = first*second;

		System.out.println("Sum = " + sum);
		System.out.println("Mult = " + multiply);
		
	}
}