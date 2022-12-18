public class Continue2 {
    public static void main(String[] args)
    {
        int i=0;
        while(i<6)
        {
            i++;
            System.out.println("Before "+i);
            if(i==2||i==4)
                continue;
            System.out.println(" After "+i);
            //i++;
        }
    }
}
