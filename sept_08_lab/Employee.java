/*Write a java class to develop an employee class object using 
constructor.
The constructor hold initialized the emp name & emp Id for 5 Emp
now write another class having name and from this class you have to 
create 5 employee objects but 
you are not allowed to use new keyword.*/

package Lab;

 class Employee1 {
	 String empname;
	 int id;
	  Employee1(String empname,int id){
		this.empname=empname;
		this.id=id;
	}
   void show() {
	 System.out.println(empname+" "+id);
 }}
class Employee{
	public static void main(String[] args) {
		Employee1 e=new Employee1("dev",1);
		Employee1 e2=new Employee1("arnab",2);
		Employee1 e3=new Employee1("abhishek",3);
		Employee1 e4=new Employee1("rohit",4);
		e.show();
		e2.show();
		e3.show();
		e4.show();
	}
}

