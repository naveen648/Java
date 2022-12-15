import java.util.ArrayList;
public class MethodAdd {
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("Java");
        al.add("Concept");
        System.out.println(al);
        al.add(1,"ArrayLists");
        System.out.println(al);
    }
}
