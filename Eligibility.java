import java.util.Scanner;
public class Eligibility{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
	System.out.print("Enter your attendance percentage: ");
	double percent = scanner.nextDouble();

	System.out.print("Enter your average score: ");
	double average = scanner.nextDouble();


if(percent>=75 && average>=75){
	System.out.print("Eligible");
}

else{
	System.out.print("Not Eligible");

}

}

}