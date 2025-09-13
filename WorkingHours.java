import java.util.Scanner;
public class WorkingHours{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number of hours: ");
	double hours = scanner.nextDouble();

	System.out.print("Enter hourly rate: ");
	double rate = scanner.nextInt();


	


if(hours>40){

	double total2 = 1.5 * hours * rate;
	System.out.print("Total pay is: " + total2);


}

else{

	double total = hours * rate;
	System.out.print("Total pay is" + total);

}

	}

}