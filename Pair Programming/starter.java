import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner w = new Scanner(System.in);
		System.out.print("Please input a number : ");
		int q = w.nextInt();
		
		int y = q;
		int c = q;
		
		int count = 1;
		while(true){
			c = c -1;
			y = y * c;
			if(count == (q-1)){
				break;
			}
			count  = count + 1;
		}
		System.out.print(y);
	}
}
