public class string_memory_allocation {
    public static void main(String [ ] args)
    {
        String s1="geeks";
        String s2="geeks";
        String s3=new String("geeks");
        if(s1==s2)
        {
            System.out.println("Yes S1 & S2 are Same Content, So it is Referenced To Same Memory Location & Memory is Optimized by Compiler");
        }
        else
        {
            System.out.println("no S1 & S2 are not same reference");
        }
         if(s1==s3)
        {
            System.out.println("Yes S1 & S3 are same content and referenced to same memory location & memory is optimized");
        }
        else
        {
            System.out.println("No S1 & S3 are Not Name Reference Even if Same Content Because We Have Created New String S3 ");
        }
    }
}
