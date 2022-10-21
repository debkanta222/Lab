/*Problem: 3
Write a program to create custom exception in java.*/

package Lab_20oct;

class invalidAgeException extends Exception{// class representing custom exception  
	invalidAgeException(String str){// calling the constructor of parent Exception 
		super(str);
	}
}
public class CustomException {// class that uses custom exception InvalidAgeException 
	public void checkAge(int age) throws invalidAgeException{//method for checking the age
		if(age<=18||age>=25) {
			throw new invalidAgeException(" not eligible to enroll");//throw an object of user defined exception  
		}
		else
			System.out.println(" eligible to enroll");
	}
public static void main(String[] args) throws invalidAgeException  {
	CustomException ce =new CustomException();//object creation of CustomException class
	ce.checkAge(24);//method calling
	
}
}