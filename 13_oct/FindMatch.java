/*
Q. 3  

Write a Java program to find sequences of lowercase letters joined with a underscore. */


package Lab;

public class FindMatch {
public static String match(String input) {
	if(input.matches("[a-z]+_[a-z]+")) {
		return "match found";
		}
	else {
		return "match not found";
	}
}
public static void main(String[] args) {
	System.out.println(match("debkanta_ch"));
	System.out.println(match("debkanta_ch"));
	System.out.println(match("debkanta_ch"));
}
}
