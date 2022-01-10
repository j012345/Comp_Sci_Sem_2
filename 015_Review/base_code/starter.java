import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner q = new Scanner(System.in);
		System.out.println("What is your name? ");
		String b = q.nextLine();
		System.out.println("What is your title? (Ex. Hero) ");
		String a = q.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String w = q.nextLine();
		boolean e = (w.equals("Warrior"));
		boolean y = (w.equals("Wizard"));
		boolean u = (w.equals("Rogue"));
		boolean r = (w.equals("warrior"));
		boolean t = (w.equals("wizard"));
		boolean i = (w.equals("rogue"));
		if(e)
		{
			System.out.println("You've choosen the Warrior, Excellent choice.");
		}
		else if(r)
		{
			System.out.println("You've choosen the Warrior, Excellent choice.");
		}
		else if(t)
		{
			System.out.println("You've choosen the Wizard, Terrific choice.");
		}
		else if(i)
		{
			System.out.println("You've choosen the Rogue, Sneaky choice.");
		}
		else if(y)
		{
			System.out.println("You've choosen the Wizard, Terrific choice.");
		}
		else if(u)
		{
			System.out.println("You've choosen the Rogue, Sneaky choice.");
		}
		else
		{
			System.out.println("You haven't choosen anyything player, Restart.");
		}
		System.out.println();
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println();
		System.out.print("Strength (1-10) : ");
		int an = q.nextInt();
		boolean no = an>=11;
		if(no)
		{
			System.out.print("Please enter a lower value.");
			System.out.print("Strength (1-10) : ");
			an = q.nextInt();
		}
		int qu;
		qu = 25-an;
		System.out.println("You have "+qu+" points left to use.");
		System.out.println();
		System.out.print("Dexterity (1-10) : ");
		int qw = q.nextInt();
		boolean qe = qw>=11;
		if(qe)
		{
			System.out.print("Please enter a lower value.");
			System.out.print("Dexterity (1-10) : ");
			qw = q.nextInt();
		}
		int qr;
		qr = qu-qw;
		System.out.println("You have "+qr+" points left to use.");
		System.out.println("");
		System.out.print("Intelligence (1-10) : ");
		int qy = q.nextInt();
		int ac = qr-qy;
		boolean ae = qr<=10;
        boolean aw = qy<=qr;
        boolean am = qy>=qr;
        boolean op = qy<=qr;
        boolean dgfj = qy>=qr;
        boolean ak = qy>=10;
        boolean ap = qr==0;
        boolean ksfr = qr>=10;
        if(ae)
        {
            if (aw)
            {
             System.out.println("You have "+ac+" points left to use.");
            }
            else if (am)
            {
            System.out.print("Please enter a lower value.");
			System.out.print("Intelligence (1-10) : ");
			int oud = q.nextInt();
			int aga;
            aga = qr-oud;
			System.out.print("You have "+aga+" points left.");
            }
        }
        else if (ksfr)
        {
        	if (op)
            {
            System.out.println("You have "+ac+" points left to use.");
            }
            else if (dgfj)
            {
            System.out.println("You don't have enought points.");
            System.out.println("Please enter a lower value.");
            System.out.print("Intelligence (1-10) : ");
            qy = q.nextInt();
            System.out.print("You have "+ac+" points left to use.");
            }
        }
        else if (ak)
        {
        System.out.println("Please enter a lower value");
        System.out.print("Intelligence (1-10) : ");
        qy = q.nextInt();
        System.out.println("You have "+ac+" points left to use.");
        }
        else if (ap)
        {
        System.out.println("You have no more points left ");
        }
		System.out.println("");
		System.out.print("Constitution (1-10) : ");
		int mg = q.nextInt();
		boolean kso = ac<=10;
		boolean idf = mg<=ac;
		boolean kx = mg>=ac;
		boolean zs = mg>=10;
		boolean hx = ac==0;
		boolean dsfj = ac>=10;
		int hut;
		hut = ac-mg;
		if (kso)
		{
			if (idf)
			{
				System.out.println("You have "+hut+" points left");
			}
			else if (kx)
			{
				System.out.println("You don't have enought points.");
				System.out.println("Please enter a lower value.");
				System.out.print("Constitution (1-10) : ");
				mg = q.nextInt();
				System.out.print("You have "+hut+" points left to use.");
			}
		}
		else if (dsfj)
		{
			if (idf)
			{
				System.out.println("You have "+hut+" points left");
			}
			else if (kx)
			{
				System.out.println("You don't have enought points.");
				System.out.println("Please enter a lower value.");
				System.out.print("Constitution (1-10) : ");
				mg = q.nextInt();
				System.out.print("You have "+hut+" points left to use.");
			}
		}
		else if (zs)
		{
			System.out.println("Please enter a lower value");
			System.out.print("Constitution (1-10) : ");
			mg = q.nextInt();
			System.out.println("You have "+hut+" points left to use.");
		}
		else if(hx)
		{
			System.out.println("You have no more points left ");
		}
		System.out.println();
		System.out.print("Charisma (1-10) : ");
		int js = q.nextInt();
		boolean asr = hut<=10;
		boolean rgd = js<=hut;
		boolean dsj = js>=hut;
		boolean dfr = js>=10;
		boolean kff = hut==0;
		boolean skf = hut>=10;
		int yu;
		yu = hut-js;
		if (asr)
		{
			if(rgd)
			{
				System.out.println("You have "+yu+" points left");
			}
			else if (dsj)
			{
				System.out.println("You don't have enought points.");
				System.out.println("Please enter a lower value.");
				System.out.print("Charisma (1-10) : ");
				js = q.nextInt();
				System.out.print("You have "+yu+" points left to use.");
			}
		}
		else if(skf)
		{
			if(rgd)
			{
				System.out.println("You have "+yu+" points left");
			}
			else if (dsj)
			{
				System.out.println("You don't have enought points.");
				System.out.println("Please enter a lower value.");
				System.out.print("Charisma (1-10) : ");
				js = q.nextInt();
				System.out.print("You have "+yu+" points left to use.");
			}
		}
		else if (dfr)
		{
				System.out.println("Please enter a lower value.");
				System.out.print("Charisma (1-10) : ");
				js = q.nextInt();
				System.out.print("You have "+yu+" points left to use.");
		}
		else if (kff)
		{
			System.out.println("You have no more points left ");
		}
		System.out.println();
		boolean has = yu==0;
		if (has)
		{
			System.out.println();
			System.out.println();
		}
		else 
		{
			System.out.println("You have "+yu+" points to spend next time.");
			System.out.println();
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("You are "+b+", the "+a+" of CVHS.");
		System.out.println("You are a "+w+" with the following stats");
		System.out.println("Strength - "+an);
		System.out.println("Dexterity - "+qw);
		System.out.println("Intelligence - "+qy);
		System.out.println("Constitution - "+mg);
		System.out.println("Charisma - "+js);
		System.out.println();
		System.out.println("Good luck on your quest "+b);
		System.out.println();
		
	}
}
