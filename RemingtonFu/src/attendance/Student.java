package attendance;

public class Student implements Attendee{
	String firstName = "";
	String lastName = "";
	boolean present = false;
	
	public Student(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public boolean isPresent() {
		return this.present;
	}
	@Override
	public void setPresent(boolean present) {
		this.present = present;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public boolean matches(String first, String last) {
		return (first.toUpperCase() == this.firstName.toUpperCase() && last.toUpperCase() == this.lastName.toUpperCase());
	}

	@Override
	public boolean matches(String last) {
		return (last.toUpperCase() == this.lastName.toUpperCase());
	}

	@Override
	public String getReportString() {
		String strLastName;
		if (this.lastName.length() > 20)
			strLastName = this.lastName.substring(0, 17) + "...";
		else
			strLastName = String.format("%-20s", this.lastName);  //Pad string from right with Max 20 spaces.
		
		String strFirstName;
		if (this.firstName.length() > 20)
			strFirstName = this.firstName.substring(0, 17) + "...";
		else
			strFirstName = String.format("%-20s", this.firstName);  //Pad string from right with Max 20 spaces.
		
		String strPresent;
		if (this.present)
			strPresent = "PRESENT";
		strPresent = "ABSENT";
		
		return (strLastName + strFirstName + strPresent);
	}
	
}