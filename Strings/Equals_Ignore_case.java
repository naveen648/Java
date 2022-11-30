public class Equals_Ignore_case {
    public static void main(String[] args)
        {
            String str="HEllo";
            String str_1="hELLo";
            String str_2="HOw";
            //boolean a=str.equalsIgnorecase(str_1);
            //boolean b=str_1.equalsIgnorecase()s;
            System.out.println(str.equalsIgnoreCase(str_1));// content is similar, so it is true
            System.out.println(str.equalsIgnoreCase(str_2));// content is not similar, so it is false
        }
}
