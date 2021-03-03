import java.util.Scanner;
class Rectangel
{
public static void main(String[] args)
{
   Scanner input=new Scanner(System.in);
   int width,height,Area,Perimeter;
   System.out.println("enter the height ");
   height=input.nextInt();
   System.out.println("enter the width ");
   width=input.nextInt();

   Area=width*height;
   Perimeter=2*width+2*height;

   System.out.println("Area of rectangel is "+Area);
   System.out.println("Perimeter of rectangel is "+Perimeter);


}
}

