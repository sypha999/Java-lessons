import java.util.*;
import java.lang.*;
public class shapes{

public static void main(String [] args){

Scanner input =new Scanner(System.in);

System.out.print("enter the radius of the circle:");
int a= input.nextInt();

System.out.println("the diameter of the circle is " +(a*2));

System.out.println("the circumfrence of the circle is " +(2*a*Math.PI));

System.out.println("the area of the circle is "+(Math.PI*a*a));
}

}