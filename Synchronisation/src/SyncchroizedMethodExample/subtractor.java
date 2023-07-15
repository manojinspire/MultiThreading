package SyncchroizedMethodExample;

public class subtractor implements Runnable {

	
	Count count ; 
	subtractor(Count count){
		this.count = count ; 
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=100 ; i++) {
			count.incrementValue(-i); 
		}
	}

}
