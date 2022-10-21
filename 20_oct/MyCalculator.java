/*Problem: 4
Create a class MyCalculator which consists of a single method long power(int, int). 
This method takes two integers, n and p, as parameters and finds n^p . If either n or 
p is negative, then the method must throw an exception which says "n or p should 
not be negative.". Also, if both n and p are zero, then the method must throw an 
exception which says "n and p should not be zero."
Input Format
Each line of the input contains two integers, n and p.
Constraints
-10 < n < 10
Lab Session 20th oct 2022
-10 < p < 10
Output Format
Each line of the output contains the result, if both n and p are positive. If either n or p 
is negative, the output contains "n and p should be non-negative". If both n and p are 
zero, the output contains "n and p should not be zero.".
Sample TestCase 1
Input
12 2
2 10
0 0
2 -1
Output
144
1024
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative*/


package Lab_20oct;

import java.util.Scanner;//importing Scanner class
class MyCalculator {
    public long power(int n, int p) throws Exception//method may have exception
    {  
         if(n < 0 || p < 0)//condition checking according to question
            throw new Exception("n or p should not be negative.");//throwing user define exception
         else if(n == 0 && p == 0)//condition checking according to question
             throw new Exception("n and p should not be zero.");//throwing user define exception
        else
            return (long)(Math.pow(n,p));//logic for n^p
    }
    public static void main(String[] args) {//main method
		Scanner scan=new Scanner(System.in);//object of Scanner class
		MyCalculator mc=new MyCalculator();//instance of MyCalculator class
		System.out.println("enter the input values of n and p : ");
		int n=scan.nextInt();//taking input for n
		int p=scan.nextInt();//taking input for p
		try {
			System.out.println(mc.power(n, p));
		} catch (Exception e) {
			e.printStackTrace();//printing the Exception message
		}
	}
}

