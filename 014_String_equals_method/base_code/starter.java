import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner q = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rouge?");
		String w = q.nextLine();
		boolean e = (w.equals("Warrior"));
		boolean y = (w.equals("Wizard"));
		boolean u = (w.equals("Rogue"));
		boolean r = (w.equals("warrior"));
		boolean t = (w.equals("wizard"));
		boolean i = (w.equals("rogue"));
		if(e)
		{
			System.out.print("You've choosen the Warrior, Excellent choice.");
		}
		else if(r)
		{
			System.out.print("You've choosen the Warrior, Excellent choice.");
		}
		else if(t)
		{
			System.out.print("You've choosen the Wizard, Terrific choice.");
		}
		else if(i)
		{
			System.out.print("You've choosen the Rogue, Sneaky choice.");
		}
		else if(y)
		{
			System.out.print("You've choosen the Wizard, Terrific choice.");
		}
		else if(u)
		{
			System.out.print("You've choosen the Rogue, Sneaky choice.");
		}
		else
		{
			System.out.print("You haven't choosen anything player, Restart.");
		}
	}
}
