package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Numbe implements Callable<String>{
	
	int num; 
	Numbe(int num){
		this.num = num ; 
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "number is  " +num+"  Thread is  "+ Thread.currentThread().getName();
	}
	
	
	

}
public class callable {
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService execute = Executors.newFixedThreadPool(10) ; 
		
		for(int i = 0 ; i < 100 ; i++) {
			
			
			Numbe n = new Numbe(i) ; 
			Future<String> f = execute.submit(n) ; 
			System.out.println(f.get());
		}
	}

}
