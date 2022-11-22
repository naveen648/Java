public class java_operators {
    public static void main(String[] args)
    {
        int x=10,y=20;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(y/x);
        int z=x+y*10;
        System.out.println(z);
        //Post-fix increment
        z=x++;
        System.out.println(z+" "+x);
        //Pre-fix imcrement
        z=++x;
        System.out.println(z+" "+x);
    }
}
