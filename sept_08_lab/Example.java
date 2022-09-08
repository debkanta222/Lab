//Q.3... Develop a public java class and make sure nobody can create 
//any object of this class from outside the class

// Ans: Yes. We can.

package Lab;

class Question3{
}
public class Example {
	Example(){
		Question3 Q=new Question3();
	}
	public static void main(String[] args) {
		Example e=new Example();
	}
}
