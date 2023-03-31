import java.util.Scanner;
class PositiveNegative{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>1)
    {
      System.out.print("The number is positive.");
    }
    else
    {
      System.out.print("The number is negative.");
    }
    sc.close();
  }
}
