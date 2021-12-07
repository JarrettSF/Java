/**
 * 
 * 
 * Lab Class
 *  * @author Jarrett Flowers
 * @author Jasmine Whitaker
 * 
 * @author ID13BN61
 *
 */
public class Lab extends Building {
	
	
	
	private String[] Departments = new String [3];
	
	private String supervisor;
	
	
	
	
	
	/**
	 * Getters and Setters for this class
	 * 
	 */
	
	
	
	
	public String[] getDepartments() {
		return Departments;
	}

	public void setDepartments(String string) {
		
		
		
		
		
	}

	
	
	
	
	
	
	
	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		
		
		if ( !supervisor.matches("[ A-Za-z  \\  -',.]{0,60}")  )
			return;
		
		
		
		
		
	}



}
