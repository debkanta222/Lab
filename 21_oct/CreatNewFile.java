//QUESTION 2 : Write a program in Java to create a file in Java using Exception Handling

package Lab_20oct;
import java.io.File;   //importing file class
import java.io.IOException;  //importing IO Exception class
public class CreatNewFile {
    public static void main(String args[])
    {  
          try {  
                   File f = new File("G:\\Internship\\File Handling\\NewFile.txt");   //initialize File object and passing path as argument  
                    if (f.createNewFile()) {  //creating new file and checking condition
                        System.out.println("File " + f.getName() + " is created successfully.");
                    }
                     else {  
                              System.out.println("File is already exist in the directory."); 
                            }
                            } catch (IOException e) {  //catching exception if any exception occurs
                          System.out.println("An unexpected error is occurred.");  
                          e.printStackTrace();  //printing the exception message
              }   
}
}