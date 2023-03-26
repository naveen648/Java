class DefaultConstructor{
    public static void main(String[] args)
    {
        Constructor c=new Constructor();
        c.print();
    }
}
class Constructor{
    int x,y;
    //Takes default Constructor values as x=0, y=0
    void print()
    {
        System.out.print("X="+x+"   Y="+y);
    }
}
