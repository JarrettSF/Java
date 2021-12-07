
import java.util.Arrays;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import java.io.IOException;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * 
 * 
 * Main Class
 * 
 * @author Jarrett Flowers and Peter Tubene
 * 
 * @author ID13BN61
 *
 */



public class assignment3 {

	private static final int NAN = 0;

	public static void main(String[] args) throws Exception {
		
		Scanner userInput = new Scanner(System.in);
		
		
		/**
		 * 
		 * JSON file writer
		 * 
		 * 
		 * 
		 */ 
		
		
		
		 	
		/**
		 * 
		 * 
		 * main class objects
		 * 
		 * 
		*/
		
		Building b = new Building();
		
		bObject s = new bObject(null, null, null, null, null, 0);
	
		Room r = new Room();
		
		lectureHall l = new lectureHall();
		
		
	
	//	oneContainer <String> contains = new oneContainer <String> ();    IMPORTANT !!
		
//		FirstList newArray = new FirstList();
//		newArray.add(5);
//		newArray.add(10);
//		newArray.add(15);
		//System.out.print(newArray.get(2));
		
//		for (int i = 0; i < newArray.size(); i++) {
			
//			System.out.println("Element " + i + ": " + newArray.get(i));   // 1:10 video on creating larger array and adding elements
			
//		}
		 /**
		  * Code that allows users to create their own objects
		  * 
		      $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/

		
		// creating building object 
		 Scanner nput = new Scanner(System.in);
		int x = 0;
		
		do {
	System.out.print("What type of structure would you like to build? Building, Room, Lab, Office, Wet Lab, Dry Lab or Lecture Hall?");     
	
	System.out.print(System.lineSeparator());
	
	String uObject = nput.nextLine();
	
	
	System.out.print("Enter the name of you structure ?");     
	
	System.out.print(System.lineSeparator());
	
	String simp = nput.nextLine();

	System.out.print("Enter the address ?");  
	
	System.out.print(System.lineSeparator());
	
	String pimp = nput.nextLine();
	
	System.out.print("Enter the state ?");  
	
	System.out.print(System.lineSeparator());
	
	String wimp = nput.nextLine();
	
	System.out.print("Enter the city ?");  
	
	System.out.print(System.lineSeparator());
	
	String limp = nput.nextLine();
	 
	System.out.print("Enter the zip code?");  
	
	System.out.print(System.lineSeparator());
	
	int imp = nput.nextInt();
	
	
	
	
	  ArrayList<bObject> build = new ArrayList<>();
	  build.add(new bObject(uObject, simp, pimp, wimp, limp, imp));

      for (bObject place: build) {
    	  
    	
          System.out.println("They type of object you created is a: " + place.uObject + " The name of your object is: "
      
        		  + place.Name +" :Address " +place.Address + " State:  "+ place.State + " City: " + place.City + " zipCode: " + place.zipCode + " The amount of floors are: "  );
          
          
          Scanner put = new Scanner(System.in);
          System.out.print(System.lineSeparator());
          
          System.out.println("Would you like to build another object? Y/N" );
          
         
          String y = null, Y = null;
          String reply = put.nextLine();
          if (reply == y || reply == Y) { x = 1; } else x = 3 ;
          
          
      }
		} while ( x == 1);  
		
	
	
		
	
		
		/**
		 * 
		 * Instructions for users to enter their data.
		 *  
			
		
		*/

		System.out.print("Enter the name ?");
		
		String temp = userInput.nextLine();
		b.setName(temp); 
		
	System.out.print(System.lineSeparator());
	
			
System.out.print("Enter the state ?");
		
		String op = userInput.nextLine();
		b.setState(op);
		
		System.out.print(System.lineSeparator());
		
System.out.print("Enter the address ?");
		
		String wop = userInput.nextLine();
		b.setAddress(wop);
		
		System.out.print(System.lineSeparator());
		
		
System.out.print("Enter the city ?");
		
		String yop = userInput.nextLine();
		b.setCity(yop);
		
		
		System.out.print(System.lineSeparator());   
		
System.out.print("Enter the zipcode ?");
		
		String or = userInput.nextLine();
	
		
		b.setZipcode(or);
		
		System.out.print(System.lineSeparator());
		
		
System.out.println("Enter the amount of floors ?");
		
		String yy = userInput.nextLine();

			b.setFloors(yy);
			
			
			System.out.print(System.lineSeparator());
			
			
			System.out.println("Enter the room Number? ");
			
			String rr = userInput.nextLine();

				r.setRoomNumber(rr);
				
				System.out.print(System.lineSeparator());
				
				System.out.print("What is the maximum compacity? ");
				
				String mc =userInput.nextLine();

				r.setMaxCompacity(mc);                                                          
					
				System.out.print(System.lineSeparator());     
	
					System.out.print("What is the preferred seating style? ");   
					
					System.out.print(System.lineSeparator());
					
					System.out.print(" 1 = Stadium"); 
					
					System.out.print(System.lineSeparator());
					
					System.out.print(" 2 = Small Group with Tables ");  
					
					System.out.print(System.lineSeparator());
					
					System.out.print(" 3 = Traditional Classrom"); 
					
					System.out.print(System.lineSeparator());
					
					System.out.print(" 4 = Individual Chairs "); 
					
					int ss = userInput.nextInt();
					l.setSeatingStyle(ss);
					
					System.out.print(System.lineSeparator()); System.out.print(System.lineSeparator());
				
					
					
				
		
		System.out.println( "So Your Seating Style is: "  + l.getSeatingStyle() + " Person: " + b.getName() + " State:  " + b.getState() + " Address: " + b.getAddress() + ", " + "City: " + b.getCity()
		
							+ ", " + "Zipcode: " + b.getZipcode() + ", " + "Floors: " + b.getFloors() + " Room Number:" + r.getRoomNumber()
							
				+ " Compacity: "  + r.getMaxCompacity() );
		
		userInput.close();
	
		
	


	}
		
}	
		
		
		
		

