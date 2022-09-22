// 2. Write a java program to illustrate Calculator class with addition, subtraction, multiplication methods that can take
//any number of parameters to perform the operation, without using method/constructor overloading.
 

package Lab;
import java.util.*;
 class CalculatorDemo {
	 int a,b;
public int addition(int a,int b) {
	this.a=a;
	this.b=b;
	return a+b;
}
  int x,y;
public int substraction(int x,int y) {
	this.x=x;
	this.y=y;
	return x-y;
}
 int i,j;
public int multiplication(int i, int j) {
	this.i=i;
	this.j=j;
	return i*j;
}
}
class Calculator{
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the number for multiplication : ");
		 int i=scan.nextInt();
		 int j=scan.nextInt();
		 CalculatorDemo obj=new CalculatorDemo();
		 System.out.println("the result of multiplication is : "+obj.multiplication(i,j));
		 System.out.println(" enter the number for addition : ");
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 System.out.println("the result of multiplication is : "+obj.addition(a,b));
		 int x=scan.nextInt();
		 int y=scan.nextInt();
		 System.out.println("the result of substraction is : "+obj.substraction(x,y));
	}
}