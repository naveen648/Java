public class compareTo {
    public static void main(String[] args)
    {
        String s1="geeksforgeeks";
        String s2="for";
        String s3="home";
        int res1=s1.compareTo(s2);
        int res2=s1.compareTo(s3);
        if(res1==0)
        {
            System.out.println("Both S1 & S2 Are Same");
        }
        if(res1>0)
        {
            System.out.println("S1 > S2");
        }
        if(res1<0)
        {
            System.out.println("S1 < S2");
        }
         if(res2==0)
        {
            System.out.println("Both S1 & S3 Are Same");
        }
        if(res2>0)
        {
            System.out.println("S1 > S3");
        }
        if(res2<0)
        {
            System.out.println("S1 < S3");
        }
    }
}
