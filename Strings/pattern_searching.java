public class pattern_searching 
{
    public static void main(String[] args)
    {
        String str="abcdedfgabc";
        String pat="abc";
        System.out.print("Pattern Detected at Index ");
        for(int i=0; i<str.length()-pat.length()+1; i++)
        {
            if(str.substring(i,i+pat.length()).equals(pat))
                    {
                        System.out.print(i+" ");
                    }
        }
    }
}
