import java.util.Scanner;


class Assone9{
	static double calculateSalary(int basic)
		{
			double gross;
			double hra,dra,cca;
			hra=0.2*basic;
			dra=0.9*basic;
			cca=0.11*basic;
			gross=basic+hra+dra+cca;


		return (double)gross;
		}

public static void main(String[] args)
{
int basic;
Scanner input=new Scanner(System.in);
basic=input.nextInt();
calculateSalary(basic);

}
}