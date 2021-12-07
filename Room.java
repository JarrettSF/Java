/**
 * 
 * 
 * Room Class
 * 
 * @author ID13BN61
 *
 */
public class Room extends Building {

	
	
	/**
	 * Atrributes for this class
	 * 
	 */
	
	
	
	//String labeled protected so that I could use polymorphism in the office and lecture hall tabs
protected String roomNumber;
	
	private String maxCompacity;

	
	/**
	 * Getters and Setters for this class
	 * 
	 */
	
	
	
	
	
	protected String getRoomNumber() {
		return roomNumber;
	}
	
	

	protected void setRoomNumber(String roomNumber) {
		
		
		String hac = null;
		
		if (roomNumber.length() < 4 )
			return;
		
		if ( !roomNumber.matches("[A-Z \\ ]{0,2}[0-9]{0,4}")  )
			
			// This is where I forced the system to throw an exception and it is also where I handled it.

			try {
				 String text =   roomNumber;
				 if (hac != roomNumber)
		         throw new IllegalArgumentException(text); }  catch (Exception e ) {System.out.println("The input you entered is not valid");} 
	else { this.roomNumber = roomNumber;}

			
			return;
		
		
		
	}

	
	
	
	
	
	public String getMaxCompacity() {
		return maxCompacity;
	}

	
	
	
	public void setMaxCompacity(String maxCompacity) {
		
		String yac = null;
		
		if (maxCompacity.length() > 16 )
			return;
		
		if (!maxCompacity.matches("[0-9 \\ .]{0,15}") )
			
			// This is where I forced the system to throw an exception and it is also where I handled it.
			
			try {
				 String text =   maxCompacity;
				 if (yac != maxCompacity)
		         throw new IllegalArgumentException(text); }  catch (Exception e ) {System.out.println("The input you entered is not valid");} 
	else { this.maxCompacity = maxCompacity;}

			
			
		return;
		
	}
	
	
	

	
}