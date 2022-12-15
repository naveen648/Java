import java.util.ArrayList;
public class MethodContainsRemove {
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("Java");
        al.add("Concept");
        al.add("ArrayLists");
        System.out.println(al);
        System.out.println(al.contains("Java"));
        al.remove("Concept");
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        System.out.println(al.contains("ArrayLists"));
        al.remove("python");
    }
}
