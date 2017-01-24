import java.util.Scanner;
class Factorial
{
   public static void main(String args[])
   {
      int n, x, fact= 1;
 
      System.out.println("Enter an integer to calculate it's factorial");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if ( n < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for (x=1;x<=n;x++)
            fact = fact*x;
 
         System.out.println("Factorial of "+n+" is = "+fact);
      }
   }
}