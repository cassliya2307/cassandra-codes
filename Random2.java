import java.util.Scanner;
public class Random2{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	double num = scanner.nextDouble();

	
if(num % 2 == 0 && num < 0){
	System.out.print("Negative Even");
}

else if(num % 2 == 0 && num > 0){
	System.out.print("Positive Even");
}

else if(num % 2 == 1 && num < 0){
	System.out.print("Negative Odd");
}
else if(num % 2 == 1 && num > 0){
	System.out.print("Positive Even");
}

else if(num == 0){

   System.out.print("Zero");
}





}

}