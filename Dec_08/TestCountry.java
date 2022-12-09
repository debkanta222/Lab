package Lab_8th_Dec;

import java.util.HashSet;//importing HashSet
import java.util.Set;//Importing Set

public class TestCountry {
		Set<String> H1 = new HashSet<>();//creating set
		
		
		public void storeCountryNames(String CountryName) {//method 1
		H1.add(CountryName);	
		}
		
			public String retrieveCountry(String CountryName) {//method 2
				for (String s : H1) {
					if(H1.contains(CountryName)) {	
					return CountryName;
					}
					else {
						return null;
						}
				}
				return null;						
			}
				
public static void main(String[] args) {
	TestCountry obj =new TestCountry();
	obj.storeCountryNames("India");// adding values to set
	obj.storeCountryNames("Australia");
	obj.storeCountryNames("England");
	System.err.println(obj.H1);//printing the set
	System.err.println(obj.retrieveCountry("India") +" "+ "Present in the ArrayList");//return India
	
	System.out.println(obj.retrieveCountry("Canada"));//will return null as it is not present
}
}
