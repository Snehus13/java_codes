// Final variable code.

class Final{

    final int age=15;
    void display()
    {
        age =55;
    }

    public static void main(String[] args)
    {
        Final obj=new Final();
        obj.display();
    }
}

//here compiler will send error as once we declare variable as final its value is constant it does not change.
