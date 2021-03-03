import java.util.Scanner;
class Square
{
public static void main(String[] args)
{
   Scanner input=new Scanner(System.in);
   int side,Area;
   System.out.println("enter the side ");
   side=input.nextInt();

   Area=side*side;

   System.out.println("Area of square is "+Area);
}
}
