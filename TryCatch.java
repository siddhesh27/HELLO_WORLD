public class TryCatch{
public static void main(String args[]){
try{
int data;
data=80/0;
}
catch(ArithmeticException e){
System.out.println(e);
}
System.out.println("No. Cannot Be Divided By Zero...");
}
}