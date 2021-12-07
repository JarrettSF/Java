/**
 * Lecture Hall Class
 * @author ID13BN61
 *
 */
public class lectureHall extends Room {

	
	
	private int seatingStyle;
	
	String seats = null;
	
	String msg = null ;
	
	
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
		
		
		if ( !roomNumber.matches("[A-Za-z \\ ]{0,2}[0-9]{0,4}[LH \\ ]{0,2}")  )
			return;
		
		
		this.roomNumber = roomNumber;
	}

	
	
	

	public void setSeatingStyle(int seatingStyle) {
		        
            
      
		
		this.seatingStyle = seatingStyle;
	}
	
	
	
	
	
	
	public int getSeatingStyle() {


		
		
		String seats = null;
        switch (seatingStyle) {
            case 1:  seats = "You have selected Stadium seating.";
                     break;
            case 2:  seats = "You have selected Small Group with Tables";
                     break;
            case 3:  seats = "You have selected Traditional Classroom";
                     break;
            case 4:  seats = "You have selected Individual Chairs";
                     break;
            default: msg = "Invalid Option" ;
            break;
	
        }
           
        
        
       
        if (seatingStyle == 1) {
            System.out.println(seats);
        } else if (seatingStyle == 2) {
            System.out.println("You have selected Small Group with Tables");
        }else if (seatingStyle == 3) {
            System.out.println("You have selected Traditional Classroom");
        }else if (seatingStyle == 4) {
            System.out.println("You have selected Individual Chairs");
        
        }
    	
		

		return seatingStyle;
		
		
	}
	
		
	
}
