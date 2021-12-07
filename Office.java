/**
	 * 
	 * Office Classs
	 * 
	 *  * @author Jarrett Flowers
 *
	 * @param occupant
	 */
	
public class Office extends Room 
{
	
	private String occupant;

	
	/**
	 * 
	 * setters and getters for this class
	 */
	
	// polymorphism: this method is a child of the Room class
	public String getRoomNumber() {
		return roomNumber;
	}
	
	
// polymorphism: this method is a child of the Room class
	public void setRoomNumber(String roomNumber) {
		
		
		if ( !roomNumber.matches("[A-Za-z \\ ]{0,2}[0-9]{0,4}[A-Za-z \\\\ ]{0,1}")  )
			return;
		
		
		this.roomNumber = roomNumber;
	}

	
	
	
	public String getOccupant() {
		return occupant;
	}


	
	public void setOccupant(String occupant) {
		
		
		if ( !occupant.matches("[ A-Za-z  \\  -',.]{0,60}")  )
			return;
		
		
		
		
		this.occupant = occupant;
	}
	
	
	
	
	

}
