import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Please enter a double: ");
		Scanner g = new Scanner(System.in);
		double r = g.nextDouble();
		System.out.print("Please enter another double: ");
		double t = g.nextDouble();
		Double ee = Math.max(r,t);
		System.out.println("Maximum number of x and y is: "+ ee);
		Double rr = Math.sqrt(r+t);
		System.out.println("Square root of y is: "+ rr);
		Double qq = Math.pow(r,t);
		System.out.println("Power of x and y is: "+ qq);
	}
}
