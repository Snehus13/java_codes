import java.util.Scanner;
class InchToYard
{
public static void main(String[] args)
{
   Scanner input=new Scanner(System.in);
   double inch,yard,Feet;
   System.out.println("enter the value in inch");
   inch=input.nextDouble();

   yard=inch*0.027;
   Feet=inch*0.083;

   System.out.println("value in yard is "+yard);
   System.out.println("value in feet is "+Feet);


}
}
