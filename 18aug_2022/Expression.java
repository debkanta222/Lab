//Write a java program to find the value of specified expression

package Activity;

public class Expression {

	public static void main(String[] args) {
		String s1="(101+0)/3";
		String s2="(3.0e-6*10000000.1)";
		String s3="(true && true)";
		String s4="(false && true)";
		String s5="((false&&false)||(true&&true))";
		String s6="((false||false)&&(true&&true))";
		System.out.println((s1 + ":" + (101+0)/3));
		System.out.println((s2+ ":" + 3.0e-6*100000000.1));
		System.out.println(s3 +":" + (true && true));
		System.out.println(s4+ ":"+ (false && true));
		System.out.println(s5+ ":"+ ((false&&false)||(true&&true)));
		System.out.println(s6+ ":"+ ((false||false)&&(true&&true)));

	}

}
