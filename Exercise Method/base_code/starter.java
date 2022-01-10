import java.util.Scanner;
import java.util.Random;

class starter {
	public static String s(int a, int b)
	{
		int x = a;
		int y = b;
		int product = x*y;
		if(product%3 == 0)
		{
			return ("It is divisible by 3");
		}
		else
		{
			return ("It is not divisible by 3");
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner fd = new Scanner(System.in);
		int a = fd.nextInt;
		int b = fd.nextInt;
		System.out.println(s(a,b));
		
	}
}
