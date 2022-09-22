//
 //1.write a java program to print sum of odd numbers up to N?

package Lab;

import java.util.*;
public class SumDemo {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the number : ");
int n=scan.nextInt();
int oddSum = 0;
for(int i=1;i<=n;i++) {
	if(i%2!=0) {
		oddSum = oddSum+i;
	}
System.out.println("The Sum of Odd Numbers upto  " + n + "  =  " + oddSum);
}
}
}
