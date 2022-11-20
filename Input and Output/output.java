public class output {
    public static void main(String[] args)
    {
        int x=100,y=200;
        System.out.format("value of x=%d\n",x);
        double z=Math.PI;
        System.out.println("PI value = "+z);
        System.out.format("value of float = %.2f\n",z);
        System.out.format("value of float = %5.2f\n",z);
        System.out.format("value of float = %05.2f\n",z);
        System.out.printf("x=%d , y=%d\n",x,y);
    }
}
