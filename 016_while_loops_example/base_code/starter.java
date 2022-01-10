import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner q = new Scanner(System.in);
		int w = q.nextInt();
		int e = w +10;
		while(true)
		{
			if(w == e)
			{
				break;
			}
			w = w+1;
			System.out.println(w);
		}


		
	}
}
