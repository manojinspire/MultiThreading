package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

	Queue<Object> store ; 
	int cap ; 
	
	String name  ; 
	Semaphore ps ; 
	Semaphore cs ; 
	Producer(Queue<Object> store , int cap ,String name,Semaphore ps , Semaphore cs ){
		this.store = store; 
		this.cap = cap ; 
		this.name = name  ;
		this.ps = ps ; 
		this.cs = cs ; 
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			try {
				ps.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
				System.out.println(name +"  adding an object of "+store.size() ) ; 
				store.add(new Object()) ; 
			
			cs.release()  ; 
		
		}
		
	}

}
