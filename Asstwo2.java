
class Asstwo2{
public static void main(String[] args)
{

int n=args.length;
System.out.println("enter number"+n);
if(n==2)
{
	int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);

	int sum=n1+n2;
	int sub=n1-n2;
	int mul=n1*n2;
	int div=n1/n2;

	System.out.println("Addition is= "+sum);
	System.out.println("subtraction is= "+sub);
	System.out.println("Multiplication is= "+mul);
	System.out.println("division is "+div);
}
else
{
	System.out.println("enter valid number on command line");
}

}
}
