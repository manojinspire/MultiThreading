package Threads;





class helloworldprinter implements Runnable{
	
	
	public void run() {
		
		
		for(int i = 0 ; i < 10 ; i++)
			System.out.println("hi") ; 
	}
}
public class Practice2 {

	
	public static void main(String[] args) {
		helloworldprinter hwp  = new helloworldprinter() ; 
		
		Thread t = new Thread(hwp) ; 
		t.start(); 
		// hwp.run() ; 
		for(int j  = 0 ; j < 10 ; j++)
			System.out.println("bye");
	}
}
