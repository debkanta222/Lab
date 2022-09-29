/*  Question 2 : Banking Operations reate a class with customer private instance 
variables as accountNumber,accountName,accountBalance and 
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two 
customers*/


package Lab_29th;
import java.util.*;
public class Bank {
private int accountNumber;
private String accountName;
private  double accountBalance;
Scanner sc=new Scanner(System.in);
public void creatAccount(int accountNumber,String accountName,double accountBalance) {
	this.accountNumber=accountNumber;
	this.accountName=accountName;
	this.accountBalance=accountBalance;
}
private double addAmount;
public void setAmount(double addAmount) {
	 accountBalance+=addAmount;
	
}
public void getAmount() {
	System.out.println("account name is : "+accountName);
	System.out.println("account balance is : "+accountBalance);
}
public void withDrawAmount() {  
    long amount;  
    System.out.println("Enter the amount you want to withdraw: ");  
    amount = sc.nextLong();  
    if (accountBalance >= amount) {  
    	accountBalance = accountBalance - amount;  
        System.out.println("Balance after withdrawal: " + accountBalance);  
    } else {  
        System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );  
    }  
}  
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Bank b=new Bank();
	b.creatAccount(12345678, "dev", 10000.5);
	b.setAmount(20500.6);
	b.getAmount();
	b.withDrawAmount();
	Bank b1=new Bank();
	b1.creatAccount(12394658, "devil", 20000.5);
	b1.setAmount(30500.6);
	b1.getAmount();
	b1.withDrawAmount();
}
}
