public class MemberAccessModifiers {
    public static void main(String[] args)
    {
        B obj=new B();
        //System.out.print(obj.x);  "compilation ERROR"
        //note: we cant access the private members of a class in another class
        System.out.print(obj.getX());
    }
}
class B{
    private int x=20;
    // to access the private class members we have to create a function inside the class and return
    int getX()
    {
        return x;
    }
}
