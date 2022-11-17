package myfirstjava;
public class wrapper_classes {
    public static void main(String[] args)
    {
        int a=99;
        //wrapper classes are non primitive they are only reference
        //autoboxing and unboxing
        Integer wrap_class=a;                    
        int b=wrap_class;
        System.out.println("value of  a = "+a);
        System.out.println("value of  wrap_class = "+wrap_class);
        System.out.println("value of  b = "+ b );
    }
}
