import java.util.Scanner;

class Asstwo6
{
	Scanner input=new Scanner(System.in);
	void takeArray()
	{

		float arr=new float[5];
		float f1,temp,nvalue;
		for(int i=0;i<=5;i++)
		{
			arr[i]=input.nextFlaot();
		}
		System.out.println("enter the value you want to search"+f1);
		for(i=0;i<=5;i++)
		{
			if(f1==arr[i])
			{
				System.out.println("value found"+arr[i]);
			}
			else
			{
				temp=f1;
				if(arr[i]<f1)
				{
				nvalue=arr[i]-f1;
			    }
			    System.out.println("nearby value is"+nvalue);
			}

		}

	}

public static void main(String[] args){
takeArray();
}

