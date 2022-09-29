/*Program to create library book Management system
to store and display book details in library where you can 
create two classes one is main another one is library, where you can 
create two methods as addBook,dispanseBook and 
bookId,bookName,bookAuthor as instance variables*/

package Lab_29th;
import java.util.*;
 class LibraryManagement {
private String bookId;
private String bookName;
private String bookAuthor;
int booksNumber;
int total;
Scanner scan=new Scanner(System.in);
public void addBook(String bookId,String bookName,String bookAuthor) {
	this.bookId=bookId;
	this.bookId=bookName;
	this.bookId=bookAuthor;
}
 int dispanseBook;
public void dispanseBook(String bookId,String bookName,String bookAuthor) {
	if((bookId==bookName)&&(bookName==bookAuthor)){
		System.out.println("book found");
	}
	else {
		System.out.println("book is not here ");
	}
}
class Anything{
	public static void main(String[] args) {
		LibraryManagement lm=new LibraryManagement();
		lm.addBook("1234EFF","JAVA","IDK");
		lm.dispanseBook("127FSGH","JAVA","ME");
	}
	 
	 
 }}
