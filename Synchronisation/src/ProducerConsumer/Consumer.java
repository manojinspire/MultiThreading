package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

	Queue<Object> store ; 
	int cap ; 
	String name ; 
	Semaphore ps ; 
	Semaphore cs ; 
	Consumer(Queue<Object> store , int cap ,String name , Semaphore ps , Semaphore cs){
		this.store = store; 
		this.cap = cap ; 
		this.name = name ; 
		this.ps = ps ; 
		this.cs = cs  ; 
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
				try {
					cs.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				System.out.println(name +"  removing an object of" + store.size()) ; 
				store.remove() ; 
			
			ps.release() ; 
	
		}
		
	}

}
