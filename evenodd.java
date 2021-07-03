package Java;
import java.util.Scanner;
public class evenodd {
	public static void main(String[] args) {
		System.out.println("Welcome to BasicCoreProgram");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a value of a-");  
		double value = sc.nextDouble();
		double num = value % 2;
		if (num == 0) {
			System.out.println("Number is even:"+value);
		}
		else {
			System.out.println("Number is odd:"+value);
		}		
	}
}
