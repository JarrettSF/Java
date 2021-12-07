import static org.junit.Assert.*;

import org.junit.Test;


/**
 * 
 * JUNIT tests for methods in Building and Room classes
 * 
 * 
 * 
 * 
 * @author id13bn61 Jarrett Flowers
 *
 */
public class assignment3Tests {

	
	
	
	
	//state test to determine if input is not valid
	@Test
	public void notALetter() {
		
		Building b = new Building();
		String notALetter = "+++`~";
		b.setState(notALetter);
		
		
		
	}
	
	
	
	
	//state test to determine if input is valid
	@Test
public void isALetter() {
		

	Building b = new Building();
	String isALetter = "mm";
	b.setState(isALetter);
		
	}
	
	//Name test to determine if input is not valid
	@Test
	public void notAName() {
		
		Building b = new Building();
		String noName = "~~~12";
		b.setName(noName);
		
		
		
	}
	
	
	
	
	//Name test to determine if input is valid
	@Test
public void isAName() {
		

	Building b = new Building();
	String isName = "m.m";
	b.setName(isName);
	
	
	
		
		
	}
	
	
	
	
	//Address test to determine if input is not valid
	@Test
	public void notAddress() {
		
		Building b = new Building();
		String noAddress = "~~~12";
		b.setAddress(noAddress);
		
		
	}
	
	
	
	
	//Address test to determine if input is valid
	@Test
public void isAddress() {
		

	Building b = new Building();
	String isAddress = "m.m";
	b.setAddress(isAddress);
	
	
	
		
		
	}
	
	
	
	
	//Floor test to determine if input is not valid
	@Test
	public void notACity() {
		
		Building b = new Building();
		String notACity = "+++";
		b.setCity(notACity);
		
		
		
	}
	
	
	
	
	//Floor test to determine if input is valid
	@Test
public void isACity() {
		

	Building b = new Building();
	String isACity = "Alpha";
	b.setCity(isACity);
		
	}
		
		
		
		
		
		//zipCode test to determine if input is not valid
		@Test
		public void notAZip() {
			
			Building b = new Building();
			String notAZip = "+++`~";
			b.setZipcode(notAZip);
			
			
			
		}
		
		
		
		
		//zipCode test to determine if input is valid
		@Test
	public void isAZip() {
			

		Building b = new Building();
		String isAZip = "78976";
		b.setZipcode(isAZip);
			
		}
	
	
	
	
		//Floor test to determine if input is not valid
				@Test
				public void notAFloor() {
					
					Building b = new Building();
					String notAFloor = "+++`~";
					b.setZipcode(notAFloor);
					
					
					
				}
				
				
				
				
				//Floor test to determine if input is valid
				@Test
			public void isAFloor() {
					

				Building b = new Building();
				String isAFloor = "78976";
				b.setZipcode(isAFloor);
					
				}
				
				
				
				
				//roomNumber test to determine if input is not valid
				@Test
				public void notARoomNumber() {
					
					Room b = new Room();
					String notARoomNumber = "+++`~";
					b.setRoomNumber(notARoomNumber);
					
					
					
				}
				
				
				
				
				//roomNumber test to determine if input is valid
				@Test
			public void isARoomNumber() {
					

				Room b = new Room();
				String isARoomNumber = "AC7897";
				b.setRoomNumber(isARoomNumber);
					
				}
	
				
				
				
				
				//maxCompacity test to determine if input is not valid
				@Test
				public void notMaxCompacity() {
					
					Room b = new Room();
					String notMaxCompacity = "+++`~";
					b.setMaxCompacity(notMaxCompacity);
					
					
					
				}
				
				
				
				
				//maxCompacity test to determine if input is valid
				@Test
			public void isMaxCompacity() {
					

				Room b = new Room();
				String isMaxCompacity = ".7897";
				b.setMaxCompacity(isMaxCompacity);
					
				}
				
				
				
				//seatingStyle test to determine if input is not valid   //     Not sure if this Unit test is working correctly 
				@Test
				public void noSeating() {
					
					lectureHall l = new lectureHall();
					int noSeating = 0;
					l.setSeatingStyle(noSeating);
					
					
					
				}
				
				
				
				
				//seatingStyle test to determine if input is valid
				@Test
			public void isSeating() {
					

				lectureHall b = new lectureHall();
				int isSeating = 3;
				b.setSeatingStyle(isSeating);
					
				}
				
				
				
	

}
