import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random e = new Random();
		int one = e.nextInt(10);
		System.out.println("A number between 0 - 9: "+one);
		int two = e.nextInt(100)+1;
		System.out.println("A number between 1 - 100: "+two);
		double three = e.nextDouble()+2.5;
		System.out.println("A number between 2.5 - 3.5: "+three);
		
	}
}
