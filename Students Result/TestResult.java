import java.util.*;

public class TestResult {
 
public static void main(String [] args){

Scanner take = new Scanner(System.in);

result pupilResult= new result ("zero", "F" );

System.out.printf("The initial score is %s and the initial grade is %s%n",pupilResult.getScore(),  pupilResult.getGrade());

System.out.println("enter the new score:");

String mainScore=take.nextLine();

pupilResult.setScore(mainScore);

System.out.println("enter equivalent grade to score:");

String adder =take.nextLine();

pupilResult.addGrade(adder);

System.out.printf("the new score is %s and the new grade is %s ",pupilResult.getScore(),   pupilResult.getGrade());



    }

}