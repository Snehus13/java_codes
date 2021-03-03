import java.util.Scanner;
class Addition
{
	public void Add(double [] arr){

		int j=0,fact=1;
		double add=0;
		for(j=0;j<=5;j++)
		{
			if(arr[j]%3==0)
			{
				add=add+arr[j];
			}
		}
		System.out.println("addition of numbers dividible by three is"+add);
		for(j=0;j<=5;j++)
		{
			if(arr[j]%2==0)
			{
				for(int i=1;i<=arr[j];i++)
				{
				fact=fact*i;
			    }
			System.out.println("number which are divisible by 2 their factorial is"+fact);
			}
		}
	}

}
class Assone8{
public static void main(String[] args)
{
	double arr[]=new double[5];
	Scanner input=new Scanner(System.in);
	System.out.println("enter 5 values");
	for(int i=0;i<=5;i++)
	{
	arr[i]=input.nextDouble();
    }
   Addition a1=new Addition();
}
}