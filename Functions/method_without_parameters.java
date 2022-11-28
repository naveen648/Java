public class method_with_parameters {
    public static void main(String[] args)
    {
        int x=10,y=20;
        System.out.println(getmax(x,y));
    }
 public static int getmax(int x,int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
}
