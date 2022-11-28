package functions;
public class function_void {
    public static void main(String[] args)
    {
        int x=10;
        func(x);
        System.out.println(""+x);
         //System.out.println("");
        //output=10 but not 15 bcoz 
    }
 public static void func(int x)
    {
        x=x+5;
    }
}
