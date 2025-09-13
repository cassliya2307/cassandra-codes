import java.util.Scanner;
public class Age2{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
	System.out.print("Enter an age: ");
	int age = scanner.nextInt();

	if(age>=0 && age<=12){

System.out.print("You're a child");

}

else if(age>=13 && age<=19){
	System.out.print("You're a teen");
}


else if(age>=20 && age<=59){

	System.out.print("You're an adult");
}

else{

System.out.print("You're a senior");



}


}

}