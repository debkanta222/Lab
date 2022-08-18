//Write a java program that accepts two integers from the user and then prints the sum,
//the difference ,the product,the average,the distance ,the maximum and the minimum.


package UserInput;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);//creating the object of scanner class
		int a,b;//initializing the variables
		System.out.println("enter the first number:");
		a=scan.nextInt();
		System.out.println("enter the second number:");
		b=scan.nextInt();
		System.out.println("the sum is:" + (a+b));
		System.out.println("the difference is:"+ (a-b));
		System.out.println("the product is:"+ (a*b));
		System.out.println("the averge is:"+ ((a+b)/2));
		System.out.println("the distance is:"+ (a-b));
		System.out.println("the maximum number is:"+ (Math.max(a, b)));
		System.out.println("the minimum number is:"+ (Math.min(a, b)));
	
		
	}

}
