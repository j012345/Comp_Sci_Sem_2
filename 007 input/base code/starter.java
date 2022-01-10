import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	System.out.println("What is your name?");	
	Scanner ja = new Scanner (System.in);
	String text = ja.nextLine();
	System.out.println("What is your age?");
	int number = ja.nextInt();
	System.out.println("What month were you born? (1-12)");
	int pol = ja.nextInt();
	System.out.println("What day were you born? (1-31)");
	int lo = ja.nextInt();
	System.out.println("What year were you born?");
	int ok = ja.nextInt();
	System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
	double jo = ja.nextDouble();
	String ho = new String("Your name is ");
	String kw = new String(" and you were born on ");
	String hs = new String("/");
	String we = new String("You are ");
	String re = new String(" years old!!!");
	String q = new String("You have $");
	String r = new String(" in your wallet.");
	System.out.println(ho+text+kw+pol+hs+lo+hs+ok+".");
	System.out.println(we+number+re);
	System.out.println(q+jo+r);
	}
}
