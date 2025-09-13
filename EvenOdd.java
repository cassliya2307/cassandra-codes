import java.util.Scanner;
public class EvenOdd{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = scanner.nextInt();

if(num % 2 == 0){
	System.out.print("It's an even number");
}


else if(num % 2 == 1){

	System.out.print("It's an odd number");
}

else{

System.out.print("Invalid");



}


}

}