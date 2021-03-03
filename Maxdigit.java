import java.util.Scanner;


class Maxdigit
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int no;
		System.out.println("enter the value");
		no=input.nextInt();

		checkmax(no);

	}
	public static void checkmax(int no)
	{
		int rem=0,max=0,x;

		x=no;
		while(x!=0)
		{
			rem=x%10;
			if(max<rem)
			{
				max=rem;
			}
			x=x/10;
		}
		System.out.println("max number is "+max);
	}
}
