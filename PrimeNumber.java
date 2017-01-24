import java.util.Scanner;
class PrimeNumber
{
   public static void main(String args[])
   {		
	int t;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number for check:");
	int num=scan.nextInt();
	for(int i=2;i<=num/2;i++)
	{
                         t=num%i;
	   if(t==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
   }
}