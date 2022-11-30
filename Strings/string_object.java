public class string_objects {
    public static void main(String[] args)
    {
        String s1="geeks";
        String s2=s1;
        s1=s1+"forgeeks";  //or s1=s1.concat("forgeeks"); and strings are immutable
        System.out.println(s1);
        System.out.println(s1==s2);
        System.out.println("S1!=S2 (false) because new object is Created when \'S1\' is concatenated  ");
    }
}
