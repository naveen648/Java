class ThisReturns {
    public static void main(String[] args)
    {
        Point obj1=new Point(5,10);
        obj1.print();
        obj1.setX(6).setY(11);//changing class variables value of x & y using (.)Dot Operator or notation
        obj1.print();
    }
}
class Point{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    Point setX(int x)
    {
        this.x=x;
        return this;    //changing constructor variables using "this" keyword
    }
    Point setY(int y)
    {
        this.y=y;
        return this;
    }
    void print()
    {
        System.out.println("X = "+x+"\tY = "+y);
    }
}
