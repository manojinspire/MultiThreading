package Threads;


 class mythread extends Thread {
	
	 
	 public void run() {
		 
		 for(int i = 0 ; i < 10  ; i++) {
			 
			
			 System.out.println("child thread") ; 
			
			
		 }
		 
	 }
	 
	
}
public class demon {
	
	
	public static void main(String[] args) {
		
		
		mythread t = new mythread() ; 
		t.setDaemon(true);
		t.start();
		
		System.out.println("main ended") ; 
		
		
	}

}
