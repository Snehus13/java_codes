import java.util.Arrays;
import java.util.Scanner;


class Book{
public static void main(String[] args)
{
String bookname;
int bookno,temp;
float price;

Scanner input=new Scanner(System.in);

System.out.println(" entere following nameof book ");
bookname=input.next();
System.out.println("you entered following nameof book "+bookname);

System.out.println("entere following  book number");
bookno=input.nextInt();
	System.out.println("you entered following book number "+bookno);
	System.out.println("enter following price of book ");
	price=input.nextFloat();
	System.out.println("you entered following book price "+price);

	System.out.println("enter the book number you want to check");
	temp=input.nextInt();

	if(temp==bookno)
	{
		System.out.println("you entered following number of book are matched");
	}
}


}



