/*a Java program to find all pairs of elements in an array whose sum is 
equal to a specified number*/

package Lab_29th;

public class EqualSum {

		static void  pairs_value(int inputArray[], int inputNumber)
		  {
		  System.out.println("Pairs of elements and their sum : ");
		 
		  for (int i =  0; i < inputArray.length; i++)
		  {
		  for (int j  = i+1; j < inputArray.length; j++)
		  {
		  if(inputArray[i]+inputArray[j] == inputNumber)
		  {
		  System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
		  }
		  }
		  }
		  }
		  
		  public static void  main(String[] args)
		  {
		  pairs_value(new int[] {2, 7, 4, -4, 8, 5, 19},15);
		  
		  pairs_value(new int[] {16, -15, 9, 10, 14, 45, 12, 20}, 30);
		  
		  }
		}
