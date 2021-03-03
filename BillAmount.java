import java.util.Scanner;

class BillAmount{

public static void main(String[]args)
{
	Scanner input=new Scanner(System.in);
	int quantity,price,bill;
	System.out.println("enter the quantity ");
	quantity=input.nextInt();
	System.out.println("enter the price");
	price=input.nextInt();

	bill=quantity*price;
	System.out.println("bill is"+bill);

}

}