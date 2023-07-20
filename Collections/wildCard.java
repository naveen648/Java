import java.util.ArrayList;

class Students{
    public void print(){
        System.out.println("Students");
    }
}
class MngmStudents extends Students{
    public void print(){
        System.out.println("Management Students");
    }
}
class EnggStudents extends Students{
    public void print(){
        System.out.println(1234);
    }
}


public class wildCard {
    static void printstudents(ArrayList<? extends Students> al)
    {
        for(Students s:al){
            s.print();
        }
    }
    public static void main(String[] args){
        ArrayList<EnggStudents> al1 =new ArrayList<>();
        al1.add(new EnggStudents());
        al1.add(new EnggStudents());
        ArrayList<MngmStudents> al2 =new ArrayList<>();
        al2.add(new MngmStudents());
        printstudents(al1);
        printstudents(al2);
    }
}
