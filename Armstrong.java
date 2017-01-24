import java.util.Scanner;
 class Armstrong
{
   public static void main(String args[])
   {
      int n, sum = 0, t, r, d = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("Input a number to check if it is an Armstrong number or Not:");      
      n = in.nextInt();
       t = n;
     
         while (t != 0) {
         d++;
         t = t/10;
      }
 
      t = n;
 
      while (t != 0) {
         r = t%10;
         sum = sum + power(r, d);
         t = t/10;
      }
 
      if (n == sum)
         System.out.println(n + " is an Armstrong number.");
      else
         System.out.println(n + " is not an Armstrong number.");         
   }
 
   static int power(int n, int r) {
      int c, p = 1;
 
      for (c = 1; c <= r; c++) 
         p = p*n;
 
      return p;   
   }
}