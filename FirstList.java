public class FirstList {
	
	public FirstList() {
		size=0;
		intialCapacity = 10;
		currentCapacity =10 ;
		content = new int[intialCapacity];
		
	}
	
	private int [] content;                                     // store numbers
	private int intialCapacity;                         // intial size of the list
	private int currentCapacity;                           // current size of the list
	private int size;                                       // number of items stored in the list   ---23:57 final video
	
	
	
	
	
	
	public void add (int n) {
		content[size] = n;
		size++;
		
		
	}
	
	
	public void add (int n, int i) {
		
		
		
	}
	
	
	public int get (int i) {
		if (i < 0 || i >= size) {  
			
			return Integer.MIN_VALUE;
					
		}
		
		return content[i];
			
	}
	
	
	public int remove (int i) {
		
		return Integer.MAX_VALUE;
		
		
	}
	
	
	public int size() {
		
		return size;
		
	}
	

}

