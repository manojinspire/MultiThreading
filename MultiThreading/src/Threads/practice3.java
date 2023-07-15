package Threads;


class NumberPrinter implements Runnable{

	
	int number ;
	
	NumberPrinter(int number){
		this.number = number;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
			
		
		
		System.out.println("number value is" +number+ " Thread Name is" + Thread.currentThread().getName()) ; 
		
		
	}
	
	
}
public class practice3 { 
	
	
	
	
	public static void main(String[] args) {
		
		
		for(int i= 0; i< 100 ; i++) {
			NumberPrinter np = new NumberPrinter(i) ; 
			Thread t = new Thread(np) ; 
			t.start(); 
			
		}
	}

}
