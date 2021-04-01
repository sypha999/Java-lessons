import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args ){

Scanner input=new Scanner(System.in);

   
System.out.print("ENTER YOUR FIRST NUMBER:");

int a= input.nextInt();

System.out.print("ENTER YOUR SECOND NUMBER:");

int b= input.nextInt();


if (a>b){
System.out.printf("%d is larger", a);
}

if (a<b){
System.out.printf("%d is larger", b);
}

if (a==b){
System.out.printf("%d equals %d", a, b);

}
    
}

}