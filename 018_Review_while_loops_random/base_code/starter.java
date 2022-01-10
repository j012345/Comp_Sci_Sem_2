import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random e = new Random();
		System.out.print("Guess a number 1-1000: ");
		int p = sc.nextInt();
		int q = e.nextInt(1000)+1;

		
	}
}
