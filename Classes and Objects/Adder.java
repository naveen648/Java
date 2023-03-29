import java.util.*;
class User{
    String name;
    User(){
        name="Default";
    }
}
class Adder{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0){
            User user = new User();
            System.out.println(user.name);
        }
    }
}
