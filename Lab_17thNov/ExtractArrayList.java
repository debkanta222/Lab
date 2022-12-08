//Write a Java program to extract a portion of an array list.

package Lab_17thNov;

import java.util.ArrayList;//IMPORTING ARRAYLIST
import java.util.Arrays;//IMPORTING ARRAYS CLASS

public class ExtractArrayList {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>(Arrays.asList("red","blue","white","green","black","pink"));//STORING THE VALUES INTO THE ARRAYLIST
		System.out.println(al);//PRINTING THE ARRAYLIST
		System.err.println(al.subList(0, 3));//extracting from position 1 to 4
	}

}
