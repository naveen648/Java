package functions;
class point{ int x,y;}
public class functions_non_primitive {
    public static void main(String[] args)
    {
        point p=new point();
        p.x=5;
        p.y=10;
        System.out.println("Before Function "+p.x+" "+p.y);
        func(p);
        System.out.println("After Function "+p.x+" "+p.y);
    }
    public static void func(point p)
    {
        p.x=10;
        p.y=10;
    }
}
