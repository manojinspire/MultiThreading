package MutextLockAdderSubtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class client { 
	
	public static void main(String[] args) throws InterruptedException {
		Count count = new Count() ;  
		Lock lock = new ReentrantLock() ; 
		adder adder = new adder(count,lock) ; 
		subtractor subtractor = new subtractor(count, lock) ; 
		Thread t1 = new Thread(adder) ; 
		Thread t2 = new Thread(subtractor) ; 
		t1.start() ; 
		t2.start() ; 
		
		
		t1.join() ; 
		t2.join() ; 
		
		
		// join will make wait for main thread to wait until thread1 and thread2 finishes  
		
		System.out.print(count.value);
	}

}
