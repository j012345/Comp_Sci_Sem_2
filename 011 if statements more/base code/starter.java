import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner q = new Scanner(System.in);
		System.out.print("Please input your first number : ");
		int o = q.nextInt();
		System.out.print("Please input your second number : ");
		int p = q.nextInt();
		boolean z = o!=p;
		boolean x = o==p;
		if(z)
		{
			System.out.print("Your variables are different");
		}
		if(x)
		{
			System.out.print("Your variable are the same");
		}
	}
}
