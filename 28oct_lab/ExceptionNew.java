/*Take two numbers x and y. Throw the exception if the two numbers are negative else print the 

Product of x and y.
Input Format
The only line of input consist of two integers, x and y.
Constraints
-20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:

java.lang.Exception: x and y should not be zero.*/

package Lab_28thOct;

import java.util.Scanner;//importing Scanner class
public class ExceptionNew {
	public int Product(int a,int b) throws Exception{
            if (  a==0 && b==0)//condition checking according to question
            throw new Exception("a and b should not be negetive");//throwing user define exception
            else  if(a < 0 || b < 0)//condition checking according to question
                throw new Exception("a or b should not be negative.");//throwing user define exception

        else
        	return a*b;//returning the result of product
        }
	 public static void main(String[] args) {//main method
			Scanner scan=new Scanner(System.in);//object of Scanner class
			ExceptionNew en=new ExceptionNew();//creating object of ExceptionNew class
			System.out.println("enter the input values of a and b : ");
			int a=scan.nextInt();//taking input for a
			int b=scan.nextInt();//taking input for b
			try {
				System.out.println("the result of product is : "+en.Product(a, b));// to get the result
			} catch (Exception e) {
				e.printStackTrace();//printing the Exception message
			}
	 }}
