import java.util.Arrays;
import java.util.Scanner;

class Assignment8
{
	public static void main(String[] args)
	{
	int n=new int[5];
	int i,addition,factorial;
	Scanner input =new Scanner(System.in);
	System.out.println("enter the 5 numbers");
	for(i=0;i<n.length;i++)
	{
		n[i]=input.nextInt();
	}
	for(i=1;i<n.length;i++)
	{
		if(n[i]%2==0)
		{
			factorial=factorial*i;
		System.out.println("factorial of number is as"+factorial);
	   }
	}
	for(i=0;i<n.length;i++)
	{
		if(n[i]%3==0)
		{
			addition=addition+n[i];
			System.out.println("Addition of numbers is"+addition);
		}
	}


}
}
