//Write a Java program to compare two array lists.

package Lab_17thNov;

import java.util.ArrayList;//IMPORTING ARRAYLIST
import java.util.Arrays;//IMPORTING ARRAYS CLASS

public class CompareArrayList {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>(Arrays.asList("red","blue","white","green"));//ADDING VALUES IN ARRAYLIST
		ArrayList<String>al2=new ArrayList<>(Arrays.asList("red","blue","white","black","green"));////ADDING VALUES IN ARRAYLIST
System.out.println(al);////PRINTING THE ARRAYLIST
System.out.println(al2);//PRINTING THE ARRAYLIST

if(al.get(0).equals(al2.get(0))) {//COMPARISON LOGIC
	System.err.println("yes");
}
else System.out.println("no");
if(al.get(1).equals(al2.get(1))) {//COMPARISON LOGIC
	System.err.println("yes");
}
else System.out.println("no");
if(al.get(2).equals(al2.get(2))) {//COMPARISON LOGIC
	System.err.println("yes");
}
else System.out.println("no");//COMPARISON LOGIC
if(al.get(3).equals(al2.get(3))) {
	System.out.println("yes");
}
else System.err.println("no");
if(al2.get(4) != null) {//COMPARISON LOGIC
	System.err.println("yes");
}
else System.out.println("no");
	}

}
