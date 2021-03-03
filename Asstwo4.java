  import java.util.Scanner;

  class Asstwo4{
  public static void main(String [] args)
  {
  int i;
  String temp,str[]=new String[5];
  Scanner input=new Scanner(System.in);
  for(i=0;i<=5;i++)
  {
  	str[i]=input.next();
  }
  for(i=0;i<=5;i++)
  {
  	for(int j=i+1;j<=5;j++)
  	{
  		if(str[i].charAt(0) > str[j].charAt(0))
  		{

  		temp=str[i];
  		str[i]=str[j];
  		str[j]=temp;
  	    }
  	}
  }

  System.out.println("languages in ascending oreder is as");
  for(i=0;i<=5;i++)
  {
  	System.out.println(" "+str[i]);
  }
  }
}