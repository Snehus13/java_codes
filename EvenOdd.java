import java.util.Scanner;

class EvenOdd
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	int number,even,odd,i;

	System.out.println("enter the number range to search even number");
	number=input.nextInt();

	for(i=0;i<=number;i++)
	{
		if(i%2==0)
		{
			System.out.println(" "+i);
		}
	}
	System.out.println("enter the range");
	number=input.nextInt();

	for(i=101;i<number;i++)
	{
		if(i%2!=0)
		{
			System.out.println(" "+i);
		}
	}
}

}



