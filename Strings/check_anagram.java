import java.util.Arrays;
public class check_anagram {
    public static void main(String[] args)
    {
        String s1="abbcde";
        String s2="abcdbe";
        boolean ans=are_anagram(s1,s2);
       System.out.println(ans);
    }
   public static boolean are_anagram(String s1,String s2)
   {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char a1[]=s1.toCharArray();
        Arrays.sort(a1, 0, 0);
        s1=new String(a1);
        
        char a2[]=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
        return s1.equals(s2);
   }
}
