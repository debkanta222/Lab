package Lab_nov3;

import java.util.ArrayList;
public class ListLoader {
	int StartNumber; int LastNumber;
public void loadList(int StartNumber, int LastNumber) {
	this.LastNumber=LastNumber;
	this.StartNumber=StartNumber;
	
		ArrayList<Integer>L=new ArrayList<Integer>();
		for(int i=0;i<=100000;i++) {
		L.add(i);
}}
public static void main(String[] args) {
	ListLoader LL=new ListLoader();
	int a=(int)System.currentTimeMillis();
	System.out.println("response time brfore : "+System.currentTimeMillis());
	LL.loadList(0, 100000);
	int b=(int)System.currentTimeMillis();
	System.out.println("response time after : "+System.currentTimeMillis());
	System.out.println("difference : "+ (b-a)+" millis");
	ThreadNew t1=new ThreadNew();
	ThreadNew1 t2=new ThreadNew1();
	t1.start();
	try {
		t2.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	t2.start();
}
}
class ThreadNew extends Thread{
	public void run() {
		
		ArrayList<Integer>N=new ArrayList<Integer>();
		for(int i=0;i<=5000000;i++) {
		N.add(i);
		System.out.println(N.get(i));
		
	}}}
	class ThreadNew1 extends Thread{
		public void run() {
			ArrayList<Integer>M=new ArrayList<Integer>();
			for(int i=5000000;i<=10000000;i++) {
			M.add(i);
			System.out.println(M.get(i));
		}}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	