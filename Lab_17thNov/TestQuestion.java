/*1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store 
even numbers from 2 to N, where N is a integer which is passed as a parameter to the 
method storeEvenNumbers(). The method should return the ArrayList (A1) created. 
2. In the same class create a method printEvenNumbers()which iterates through the 
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format 
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method 
should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it 
should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.*/


package Lab_17thNov;

import java.util.ArrayList;//importing ArrayList

public class TestQuestion {


	ArrayList<Integer> num = new ArrayList<Integer>();//creating first Integer ArrayList
	ArrayList<Integer> num2 = new ArrayList<Integer>();//creating second Integer ArrayList
	
	public ArrayList<Integer> storeEvenNumbers(int N) {//creating method called storeEvenNumbers
		for(int i = 2; i<N ; i=i+2)//logic for storing the even number
			num.add(i);
		return num;
	}
	public ArrayList<Integer> printEvenNumbers() {//creating method called printEvenNumbers
		for(int i : num)
			num2.add(i*2);//adding the multiplied numbers into the second ArrayList
		return num2;
	}
	public int retrieveEvenNumbers(int N) {//creating method called retriveEvenNumbers
		int n = 0;
		for(int i : num) {//logic for searching first ArrayList
			if(i==N) 
				n = N;
		}
		return n;
	}
	public static void main(String[] args) {//main method
		
		TestQuestion ev = new TestQuestion();//creating object of 
		System.err.println(ev.storeEvenNumbers(25));//printing and invoking storeEvenNumbers
		System.err.println(ev.printEvenNumbers());//printing and invoking printEvenNumbers
		System.err.println(ev.retrieveEvenNumbers(14));//printing and invoking retrieveEvenNumbers
		////printing and invoking retrieveEvenNumbers which will return zero as first ArrayList contains 2-25 numbers
		System.out.println(ev.retrieveEvenNumbers(30));
	}	
		
}