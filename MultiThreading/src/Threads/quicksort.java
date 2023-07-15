package Threads;




public class quicksort { 
	
	
	
	
	public static int getpivot(int[] arr , int start  , int end) {
		
		
		int ele = arr[start] ; 
		
		
		int count = 0 ; 
		
		for(int i = start ; i<= end ; i++) {
			if(arr[i] < ele) {
				count+=1 ; 
			}
		}
		
		int i = start ; 
		int j = end ; 
		
		int temp = arr[start+count] ; 
		arr[start+count] = ele ; 
		arr[start] = temp;
		while(i<start+count && j > start+count) {
			if(arr[i] < ele) {
				i+=1 ;
			}
			if(arr[j] >= ele) {
				j-=1 ;
			}
			
			if(arr[i] >= ele && arr[j]  < ele) {
				int x = arr[i] ; 
				arr[i] = arr[j] ; 
				arr[j] = x ; 
			}
		}
		
		return start+count ; 
		
	}
	public static void solve(int[] arr , int start , int end) {
		
		
		if(start >= end) {
			return ; 
		}
		int pivot = getpivot(arr , start , end) ; 
		
		solve(arr,start , pivot-1) ; 
		solve(arr, pivot+1 , end) ; 
		
		return ; 
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,6,3,2,2} ; 
		
		solve(arr , 0 , arr.length-1)  ; 
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i] +" ") ; 
		}
	}
	
	

}
