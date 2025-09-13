import java.util.Scanner;
public class Account{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
	System.out.print("Enter your atccount balance: ");
	double balance = scanner.nextDouble();

	
if(balance<100){
	System.out.print("Low");
}

else if(balance>=100 && balance<=1000){
	System.out.print("Medium");

}

else if(balance>1000){
  	System.out.print("High");

}

}

}