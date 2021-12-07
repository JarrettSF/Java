/** 

@author Jarrett Flowers and Peter Tubene
 
 
 */
 
public class bObject {
		String uObject;
		
	    String Name;
	    
	    String State;
	    
	    String Address;
	    
	    String City;
	    
	    int zipCode;
	    
		private int [] content;                                     // store numbers
		private int intialCapacity;                         // intial size of the list
		private int currentCapacity;                           // current size of the list
		private int size;                                       // number of items stored in the list   ---23:57 final video
		
		
	    
	    
	    public int[] getContent() {
			return content;
		}




		public void setContent(int[] content) {
			this.content = content;
		}




		public int getIntialCapacity() {
			return intialCapacity;
		}




		public void setIntialCapacity(int intialCapacity) {
			this.intialCapacity = intialCapacity;
		}




		public int getCurrentCapacity() {
			return currentCapacity;
		}




		public void setCurrentCapacity(int currentCapacity) {
			this.currentCapacity = currentCapacity;
		}




		public int getSize() {
			return size;
		}




		public void setSize(int size) {
			this.size = size;
		}




		bObject(String uObject, String Name, String Address, String State, String City, int zipCode){
	        this.uObject = uObject;
	    	this.Name = Name;
	        this.Address = Address;
	        this.State = State;
	        this.City = City;
	        this.zipCode = zipCode;
	       

	    }




		public String getuObject() {
			return uObject;
		}




		public void setuObject(String uObject) {
			this.uObject = uObject;
		}




		public String getName() {
			return Name;
		}




		public void setName(String name) {
			Name = name;
		}




		public String getState() {
			return State;
		}




		public void setState(String state) {
			State = state;
		}




		public String getAddress() {
			return Address;
		}




		public void setAddress(String address) {
			Address = address;
		}




		public String getCity() {
			return City;
		}




		public void setCity(String city) {
			City = city;
		}




		public int getZipCode() {
			return zipCode;
		}




		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}
	
}
