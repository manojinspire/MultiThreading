package adder_subtractorExampleusingAtomicDataTypes.copy;

public class adder implements Runnable{
	
	
	Count count ; 
	
	adder(Count count){
		this.count = count ; 
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1 ; i<=100 ; i++) {
			count.value.addAndGet(i) ; 
		}
	}

}
