
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Random;

public class ArithmeticApp{

public static void main(String... args){
Scanner scanner = new Scanner(System.in);
Random random = new Random();

String main = """
1. Display Equations
0. Exit
""";


boolean isLooping = true;

int index = 0;
while(isLooping){
System.out.print(main);
System.out.print("Enter operation: ");
int operation = scanner.nextInt();
switch(operation){
case 1->{
	for(int count = 0; count <= 10; count++){
	int number1 = random.nextInt(50 , 100);
	int number2 = random.nextInt(1 , 50);
	
	System.out.print("what is " + number1 + "-" + number2 + "? ");
	int result = scanner.nextInt();
	System.out.println();
	int solution = number1 - number2;
	
	for(int counter = 0; counter <= 2; counter++){
	if(result == solution){
		index += 1;
}

	
	if(result != solution){System.out.println("You're wrong!");
	System.out.print("Last chance what is " + number1 + "-" + number2 + "? ");
	result = scanner.nextInt();

	if(result == solution){System.out.println("You're correct!");
		
}
	System.out.println();
		break;
}
	else{System.out.println("You're correct!");
		break;
	
}	

	
	
}
}
	

	

}

case 0->{isLooping = false;}

}


System.out.println("You scored " + index + " out of ten");

int secondsToday = LocalTime.now().toSecondOfDay();

System.out.println("You finished in " + secondsToday + " seconds");


}























}







}