import java.util.Scanner;
class Asstwo5{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	int n1,n2,choice,even,odd,i,rev=0,ON,Rd;

	System.out.println("enter the first number :");
	n1=input.nextInt();

	System.out.println("enter second number :");
	n2=input.nextInt();

	System.out.println("enter the choice");
	choice=input.nextInt();

	switch(choice)
	{
		case 1:
		for(i=n1;i<=n2;i++)
		{
			if(i%2==0)
			{
				even=i;
				System.out.println("even number is:"+even);
			}
		}
		break;
		case 2:
		for(i=n1;i<=n2;i++)
		{
			if(i%2!=0)
			{
				odd =i;
				System.out.println("odd number is:"+odd);
			}
		}
		break;
		case 3:
		for(i=n1;i<=n2;i++)
		{
			ON=i;
			while(i)
			{
				Rd=i%10;
				rev=rev*10+Rd;
				i=i/10;
			}

			if(ON==rev)
			System.out.println("palindrome numbers are :"+ON);

		}
		break;

		default:
		System.out.println("invalid choice");
		break;
	}
}

}