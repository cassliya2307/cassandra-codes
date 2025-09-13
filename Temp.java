import java.util.Scanner;
public class Temp{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a temperature in celcius: ");
	int temp = scanner.nextInt();

	if(temp<0){

System.out.print("It's freezing");

}

else if(temp>=0 && temp<=15){
	System.out.print("It's cold");
}


else if(temp>=16 && temp<=25){

	System.out.print("It's warm");
}

else if(temp>25){

System.out.print("It's hot");



}


}

}