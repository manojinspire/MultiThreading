package Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


class Number implements Runnable{
	
	int  i  ;
	Number(int i){
		this.i = i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Number is" +i +"Thread is" + Thread.currentThread().getName()) ; 
		
	}
	
	
	
}
public class executorpool {
	
	public static void main(String[] args) {
		
		Executor executor = Executors.newFixedThreadPool(10) ; 
		
		for(int i  = 0 ; i<100 ; i++) {
			Number n = new Number(i) ;
			executor.execute(n) ; 
		}
	}
}
