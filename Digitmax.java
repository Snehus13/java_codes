import java.util.Scanner;


class Digitmax
{
public static void main(String[] args){
int n;

Scanner input=new Scanner(System.in);
System.out.println("enter the number");
n=input.nextInt();

Findmax(n);
}

static void Findmax(int n)
{
	int x=n;
	int max=0,rem;

	while(x!=0)
	{
		rem=x%10;
		if(rem>max)
		{
			max=rem;
		}
		x=x/10;
	}
	System.out.println("max digit is "+max);
}

}
