public class Exceptions{
public static void main(String args[]){
String Languages[]={"c","c++","java","Perl","Python","C#"};
try{
for(int c=1;c<5;c++)
{
System.out.println(Languages[c]);
}
}
catch(Exception e){
System.out.println(e);
}
}
}