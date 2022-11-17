package myfirstjava;
class acess
            {
                int x;
                int y;
            }
public class accesing_variables 
{
    public static void main(String[] args) 
    {
        System.out.println("hello");
        acess a=new acess();
        a.x=10;
        a.y=20;
        System.out.println(a.x+" "+a.y);
    }
    
}
