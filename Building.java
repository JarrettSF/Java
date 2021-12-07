import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Building Class
 * 
 * 
 * * @author Jarrett Flowers
 * 
 *
 * @author ID13BN61
 *
 */
public class Building {

	
	// this code block try belongs to G.Vincenti -- I will load the JSON file in the
		// constructor and save the relevant information to two array lists

	public Building() {
		
		
		zipCodes = new ArrayList<>();
		states = new ArrayList<>();
		
		// I will load the JSON file in the constructor and save the relevant information to two array lists
		try {
			JSONArray objects = (JSONArray) (new JSONParser()).parse(new FileReader("src/USCities.json"));
			for ( Object item : objects ) {
				JSONObject stateObject = (JSONObject)item;
				String jsonZIPCode = stateObject.get("zip_code").toString();
				String jsonState = stateObject.get("state").toString();
				// Padding the ZIP code
				while (jsonZIPCode.length() < 5)
					jsonZIPCode = "0" + jsonZIPCode;
				//System.out.println(jsonZIPCode + " - " + jsonState);
				zipCodes.add(jsonZIPCode);
				states.add(jsonState);				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	
	
	
	
	
	
	
	
	/**
	 * Attributes for building object.
	 * 
	 * 
	 * 
	 */
	
	// G.Vincenti attributes are the first three
	
	public static final String UNKNOWN_INFO = "Not Available";
	public static final String UNKNOWN_ZIP_CODE = "00000";
	public static final int UNKNOWN_FLOORS = 0;
	
	private String name;

	private String address;

	private String city;

	private String zipcode;

	private String floors;

	private String state;

	
	private ArrayList<String> zipCodes;
	private ArrayList<String> states;

	

	/**
	 * 
	 * Setters and Getters for building object.
	 * @param state 
	 */
	
	
	public void setState(String state) {
		String aac = null;
		
		// Vincenti code
		if ( state.equalsIgnoreCase(Building.UNKNOWN_INFO) ) {
			this.zipcode = Building.UNKNOWN_INFO;
			return;
		}

		
		if ( !state.matches("[A-Za-z]{0,2}") )  
			
			// This is where I forced the system to throw an exception and it is also where I handled it.

			
			try {
			 String text =   state;
			 if (aac != state)
	         throw new IllegalArgumentException(text); }  catch (Exception e ) {System.out.println("The input you entered is not valid");} 
		
		// Vincenti code
		else { this.state = state;}
		for ( int i = 0; i < states.size(); i++ ) {
			if ( states.get(i).equalsIgnoreCase(state) ) {
				this.state = state;
				this.state = states.get(i);
				return ;
				
			}
		} 
		
		
			
			
		} 

	
public String getState() {

	
	
	
		return state ;
		
		
		
	}

/**
 * 
 * 
 * @param state
 * @throws Exception


*/


	


	
	
	


	public String getName() {
		
		
		
		return name;
		
		
		
	}

	public boolean setName(String name) 	{ 
		
		String pac = null;
		
		if ( name == null )
			return false ;
		
		if ( name.equalsIgnoreCase(Building.UNKNOWN_INFO) ) {
			this.name = Building.UNKNOWN_INFO;
			return true;
		}
		
		
		if ( !name.matches("[A-Za-z \\-',.]{0,40}") )  
			
			// This is where I forced the system to throw an exception and it is also where I handled it.

			
		try {
		 String text =   name;
		 if (pac != name)
         throw new IllegalArgumentException(text); } catch (Exception e ) {System.out.println("The input you entered is not valid");} 
		
		else {this.name = name;}
	return false;
	
		// Vincenti code



		
		
	}

	public String getAddress() {
		
		
		
		return address;
		
		
		
	}

	public boolean setAddress(String address) {
		
		String sac = null;
		
		if ( address == null )
			return false ;
		
		// Vincenti code
		if ( address.equalsIgnoreCase(Building.UNKNOWN_INFO) ) {
			this.address = Building.UNKNOWN_INFO;
			return true;
		}
		
		
		if ( !address.matches("[A-Za-z \\-',.]{0,40}") )  
			
			// This is where I forced the system to throw an exception and it is also where I handled it.

			
			try {
			 String text =   address;
			 if (sac != address)
	         throw new IllegalArgumentException(text); } catch (Exception e ) {System.out.println("The input you entered is not valid");}
		else {this.address = address;}
		
		return false;
		
		
	}

	public String getCity() {
		
		
		
		return city;
		
		
		
	}

	public boolean setCity(String city) {
		
		String lac = null;
		
		if ( city == null )
			return false ;
		
		
		// Vincenti code
		if ( city.equalsIgnoreCase(Building.UNKNOWN_INFO) ) {
			this.city = Building.UNKNOWN_INFO;
			return true;
		}
		
if ( !address.matches("[A-Za-z \\-',.]{0,40}") )  
			
	// This is where I forced the system to throw an exception and it is also where I handled it.

	
			try {
			 String text =   city;
			 if (lac != city)
	         throw new IllegalArgumentException(text); } catch (Exception e ) {System.out.println("The input you entered is not valid");}
		else {this.city = city;}
		
		return true ;
		
		
	}

	public String getZipcode() {
		
		
		
		return zipcode;
	
		
	}
	
	

	public boolean setZipcode(String zipcode)  {
		
		String bac = null;
		
		if ( zipcode == null )
			return false ;
		
		
		// Vincenti code
		if ( zipcode.equalsIgnoreCase(Building.UNKNOWN_ZIP_CODE) ) {
			this.zipcode = Building.UNKNOWN_ZIP_CODE;
			return true;
		}
		
if ( !zipcode.matches("[0-9]{0,5}") )  
			
	// This is where I forced the system to throw an exception and it is also where I handled it.

	
			try {
			 String text =   zipcode;
			 if (bac != zipcode)
	         throw new IllegalArgumentException(text); }  catch (Exception e ) {System.out.println("The input you entered is not valid");} 
else { this.zipcode = zipcode;}


		// Vincenti code
		
	
			
		
		
		for ( int i = 0; i < zipCodes.size(); i++ ) {
			if ( zipCodes.get(i).equalsIgnoreCase(zipcode) ) {
				this.zipcode = zipcode;
				this.zipcode = zipCodes.get(i);
				return true;
			}
		}
	
			return false ;
		
			
	}

	public String getFloors() {
		
		
		
		return floors;
		
		
		
	}

	public void setFloors(String floors) {

		
		String kac = null;
		
		if ( !floors.matches("[0-9]") ) 
			
			// This is where I forced the system to throw an exception and it is also where I handled it.

			
			try {
				 String text =   floors;
				 if (kac != floors)
		         throw new IllegalArgumentException(text); }  catch (Exception e ) {System.out.println("The input you entered is not valid");} 
	else { this.floors = floors;}

			
		return;
		
					
					
					
					
	}

}
