import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner q = new Scanner(System.in);
		Random w = new Random();
		int e = w.nextInt(1000)+1;
		System.out.print("Pick a number between 1 - 1000 : ");
		int r = q.nextInt();
		boolean t = e<r;
		boolean y = e==r;
		if(t)
		{
			System.out.print("The number you guessed was bigger than the random number. The random number was "+e);
		}
		else if(y)
		{
			System.out.print("The number you guessed was correct. The random number was "+e);
		}
		else 
		{
			System.out.print("The number you guessed was smaller than the random number. The random number was "+e);
		}
	}
}
