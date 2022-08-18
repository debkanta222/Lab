//write a java program to convert minutes into a number of years and days 

package Activity;

public class Conversion {

	public static void main(String[] args) {
    int minutesInAYear= 60*24*365;//initializing variables
    int InputData=1234567;
    int years=(InputData/minutesInAYear);
    int days=(InputData/60/24)%365;
    
    System.out.println(InputData+" " + "minutes is : "+ years +" " +"years and "+ days+" "+"days");

	}

}
