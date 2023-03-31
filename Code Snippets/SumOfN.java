import java.util.Scanner;
class SumOfN{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Input to return Total Sum  ");
      int n=sc.nextInt();
      System.out.print("Total sum of = "+sumcount(n));
      sc.close();
    }
    static int sumcount(int n)
    {
        int ans=0;
      while(n>0)
      {
        ans=ans+n;
        n--;
      }
      return ans;
    }
}
