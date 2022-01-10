import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner q = new Scanner(System.in);
		System.out.print("Whats your name?");
		String w = q.nextLine();
		System.out.print("How many times do you want his repeated? ");
		int e = q.nextInt();
		int r = 0;
		while(true)
		{
			if(e == r)
			{
				break;
			}
			e= e-1;
			System.out.println(w);
		}
		


		
	}
}
