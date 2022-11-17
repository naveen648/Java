public class explicit_conversion {
    public static void main(String[] args)
    {
        double a=105.0;
        int b=(int)a;
        char c=(char)b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);// c output is "i" because of conversion of int to char which is ASCII value
    }
}
