class ConstructorClass{
    public static void main(String[] args)
    {
        Constructor c=new Constructor(50,100);
        c.print();
    }
}

class Constructor{
    int x,y;
    //if Constructor is declared then same syntax with class name and parameters should be written
    Constructor(int a,int b)
    {
        x=a;
        y=b;
    }
    void print()
    {
        System.out.print("X="+x+"   Y="+y);
    }
}
