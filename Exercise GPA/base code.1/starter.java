import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	System.out.print("Class 1 - ");
	Scanner N = new Scanner(System.in);
	Double I = N.nextDouble();
	System.out.print("Class 2 - ");
	Double E = N.nextDouble();
	System.out.print("Class 3 - ");
	Double O = N.nextDouble();
	System.out.print("Class 4 - ");
	Double U = N.nextDouble();
	System.out.print("Class 5 - ");
	Double A = N.nextDouble();
	System.out.print("Class 6 - ");
	Double W = N.nextDouble();
	double q;
	q = I+E+O+U+A+W;
	System.out.print(q/6);
	}
}
