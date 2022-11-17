package myfirstjava;
public class auto_boxing_and_unboxing {
    public static void main(String[] args)
    {
        Integer a=120,b=120,c=140,d=140;
        System.out.println("In case of value< 130 it shows *same*  but in case of value>=130 it shows *not same*" );
        if(a==b)
        {
            System.out.println("120=120 Same");
        }
        else
        {
            System.out.println("120=120 Not Same");
        }
        if(c==d)
        {
            System.out.println("140=140 Same");
        }
        else
        {
            System.out.println("140=140 Not Same");
        }
        System.out.println("Here 140=140 is not same because we are refering the value instead of comparing by using wrapping class objects of Non-Primitive*" );
    }
}
