class ThisKeyword {
    public static void main(String[] args) 
    {
        A obj1=new A(10,20);
        A obj2=new A(50,100);
        obj1.print();
        obj2.print();
    }
}
class A{
    int x,y;  
    A(int x,int y)  //Overrides the scope of above x and y values
    {
        this.x=x;
        this.y=y;
    }
    void print()
    {
        System.out.println("X = "+x+"\tY = "+y);
    }
}
