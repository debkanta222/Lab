package Activity;

public class Break1 {

	public static void main(String[] args) {
		int InputData=12345;
		System.out.println( "the input data is:"+InputData);
		int a=(InputData/10000)%10;
		int b=(InputData/1000)%10;
		int c=(InputData/100)%10;
		int d=(InputData/10)%10;
		int e=(InputData%10);
		System.out.println("result after breaking : " +a+" "+b+" "+c+" "+d+" "+e);
		

	}

}
