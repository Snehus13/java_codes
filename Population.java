import java.util.Scanner;

class Population
{
public static void main(String[] args)
{
int pop,pop_men,pop_women,pop_lit,lit_men,lit_women,illit_men,illit_women;
Scanner input=new Scanner(System.in);
System.out.println("enter the population of town");
pop=input.nextInt();
pop_men=(52*pop)/100;
pop_women=pop-pop_men;
pop_lit=(48*pop)/100;
lit_men=(35*pop)/100;

lit_women=pop_lit-lit_men;
illit_men=pop_men-lit_men;
illit_women=pop_women-lit_women;

System.out.println("total population of city "+pop);
System.out.println("total population of men "+pop_men);
System.out.println("total population of women "+pop_women);
System.out.println("total population of litterate people"+pop_lit);
System.out.println("total population of literratemen"+lit_men);
System.out.println("total population of litteratewomen"+lit_women);
System.out.println("total population of illeteratemen"+illit_men);
System.out.println("total population of illeteratewomen"+illit_women);


}
}