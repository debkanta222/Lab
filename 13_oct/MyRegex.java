/*
Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. 

Use the following definition of an IP address:
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

Some valid IP address:
000.12.12.034
121.234.12.12
23.45.12.56

Some invalid IP address:
000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip

In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.
Just write the MyRegex class which contains a String . The string should contain the correct regular expression.
(MyRegex class MUST NOT be public)  */


package Lab;

import java.util.regex.*;

public class MyRegex {
	public static void main(String args[]) {
		System.out.println("Output: " + check("000.12.12.034")); // Case 1
		System.out.println("Output: " + check("121.234.12.12")); // Case 2
		System.out.println("Output: " + check("000.12.234.23.23")); // Case 3
		System.out.println("Output: " + check("i.am.not.an.ip")); // Case 4
	}

	public static boolean check(String ip) {
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
		String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
		Pattern p = Pattern.compile(regex);
		if (ip == null) { // if empty return false
			return false;
		}
		Matcher m = p.matcher(ip);
		return m.matches(); // For return if the IP if matched
	}
}