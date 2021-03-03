
class Book
{
	public int bookno;
	public String bookname;
	public float bookprice;

	public void addBook(int bookno,String bookname,float bookprice)
	{
		this.bookno=bookno;
		this.bookname=bookname;
		this.bookprice=bookprice;
	}
	public void showBook()
	{

		System.out.println("\n"+this.bookname+"book exist in the list");
	}

static int searchBookByName(String userBookName,Object[]date)
{
	for(int i=0;i<data.length;i++)
	{
		int pos=-1;
		Book b=(Book)data[i];
		if(b.bookname.equals(userBookname))
		{
			pos=i;
		}
		return pos;
	}
}


}

class Booka6{
public static void main(String [] args)
{

Book b1=new Book();
b1.addBook(1,"lord of rings",50.00f);

Book b2=new Book();
b2.addBook(2,"Ravan",100.00f);

Book b3=new Book();
b3.addBook(3,"Diary of young girl",45.00f);

Object bookarr[]={b1,b2,b3};
}
}





