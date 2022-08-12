//Write a java program to check whether java is installed on your computer.

class Installation{
public static void main (String[]args){
System.out.println("\nJava Version:"+System.getProperty("java.version"));//printing java version
System.out.println("Java Runtime Version:"+System.getProperty("java.runtime.version"));//printing jre version
System.out.println("Java Home:"+System.getProperty("java.home"));//printing java home//printing java home
System.out.println("Java Vendor:"+System.getProperty("java.vendor"));//printing java vendor
System.out.println("Java Vendor URL:"+System.getProperty("java.vendor.url"));//printing java vendor url
System.out.println("Java Class Path:"+System.getProperty("java.class.path")+"\n");//printing java classpath
}
}
