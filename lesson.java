import java.util.Scanner;

public class lesson {

    public static void main(String[] args ){

Scanner input=new Scanner(System.in);

   
System.out.print("ENTER YOUR FIRST NUMBER:");

int a= input.nextInt();

System.out.print("ENTER YOUR SECOND NUMBER:");

int b= input.nextInt();

System.out.print("ENTER YOUR THIRD NUMBER:");

int c= input.nextInt();

System.out.println("THE SUM OF YOUR NUMBERS ARE " +(a+b+c));

System.out.println("THE AVRAGE YOUR NUMBERS ARE " +((a+b+c)/3));

System.out.println("THE PRODUCT OF YOUR NUMBERS ARE "+(a*b*c));

if (a>b){

    
if (a>c){

    System.out.printf("%d is the largest", a);
    }}

if (b>a){

    

if (b>c){

    System.out.printf("%d is the largest ", b);
}}
if (c>b){



if (c>a){

    System.out.printf("%d is the largest ", c);
}
}
if (a<b){

   
if (a<c){

    System.out.printf("%d is the smallest", a);
}
}
if (b<c){

   
if (b<a){

    System.out.printf("%d is the smallest", b);
}
}

if (c<a){

   
if (c<b){

    System.out.printf("%d is the smallest", c);
}
}
}
    
}