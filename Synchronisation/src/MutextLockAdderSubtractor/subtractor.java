package MutextLockAdderSubtractor;

import java.util.concurrent.locks.Lock;

public class subtractor implements Runnable {

	
	Count count ; 
	Lock lock ; 
	subtractor(Count count , Lock  lock){
		this.count = count ; 
		this.lock = lock ; 
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=100 ; i++) {
			lock.lock();
			count.value-=i ; 
			lock.unlock() ; 
		}
	}

}
