package arrays;

public class Person {

	public static final String[] FIRST_START = {"Chr", "M", "L", "Gr", "Ph", "B", "Th"};
	public static final String[] FIRST_MIDDLE = {"isti", "icha", "era", "eta", "ala", "ina", "ara"};
	public static final String[] FIRST_END = {"", "na", "n", "r", "tian", "s", "rs", "mp", "les"};
	
	public static final String[] LAST_START = {"Tr", "R", "Br", "Sh", "Ar", "St", "To"};
	public static final String[] LAST_MIDDLE = {"emm", "wo", "itt", "gee", "lel", "ele", "ode"};
	public static final String[] LAST_END = {"", "fa", "er", "ed", "u", "ski", "an", "oo", "en"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person (String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
	}
	
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I live in " +home+".";
	}
}
