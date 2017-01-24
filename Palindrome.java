import java.util.*;
class Palindrome
{
  public static void main(String args[])
  {
    String inputString;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Input a string");
    inputString = in.nextLine();
 
    int length  = inputString.length();
    int i, j, k, l;
 
    j= 0;
    k= length - 1;
    l= (j + k)/2;
 
    for (i = j; i <= l; i++) {
      if (inputString.charAt(j) == inputString.charAt(k)) {
        j++;
        k--;
      }
      else {
        break;
      }
    }
    if (i == l + 1) {
      System.out.println("Palindrome");
    }
    else {
      System.out.println("Not a palindrome");
    } 	
  }
}