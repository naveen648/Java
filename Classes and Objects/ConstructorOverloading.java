class User{
    String name;
    User()
    {
        name="Default";
    }
    User(String name)
    {
        this.name=name;
    }
}
class ConstructorOverloading{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            User user = new User();
            System.out.println(user.name);
            
            String name = read.readLine();
            
            User user2 = new User(name);
            System.out.println(user2.name);
        }
    }
}
