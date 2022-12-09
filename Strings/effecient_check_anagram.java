public class effecient_check_anagram {
    public static void main(String[] args)
    {
        String s1="abbcde";
        String s2="abcdbe";
        boolean ans=are_anagram(s1,s2);
       System.out.println(ans);
    }
    static final int CHAR=256;
   public static boolean are_anagram(String s1,String s2)
   {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int count[]=new int[CHAR];
        for(int i=0;i<s2.length();i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
   }
}
