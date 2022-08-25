//Write a java program to find factorial of any number.
package Activity;
import java.util.Scanner;
public class FactorialCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  int fact=1;  
		 System.out.println("enter the number : ");
		 int number=scan.nextInt();
		  for( int i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  

	}

