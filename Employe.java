import java.util.Scanner;
class Employee{
public float hra,dra,cca;
public float bsalary;
public float grosssalary;
public Scanner scan=new Scanner(System.in);
public void addEmployee()
{
	System.out.println("enter the basic salary");
	bsalary=scan.nextFloat();
	if(bsalary>15000)
	{
		System.out.println("here enter hra 15% ");
		hra=scan.nextFloat();
	}
	else if(bsalary>10000)
	{
		System.out.println("here enter the dra 7%");
		dra=scan.nextFloat();
	}
	else if(bsalary>90000)
	{
	System.out.println("enter the cca here as 5%");
	cca=scan.nextFloat();
	}
else
{
	hra=0.05;
	dra=0.06;
	cca=0.02;
}

grosssalary=bsalary+dra*bsalary+hra*bsalary+cca*bsalary;
System.out.println("grosssalary is "+grosssalary);

}
}

class Employe{
public static void main(String[] args)
{
Employee e1=new Employee();
e1.addEmployee();

}
}