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
	private Hobby hobby;
	private Person friends[];
	private String nickname;
	
	public Person (String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		this.nickname = createNickname(firstName);
		friends = new Person[3];
	}
	
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I live in " +home+".";
	}
	
	public void mingle(Person[] people) {
		for(Person p: people) {
			if(p != this) {
				p = betterFriend(p, friends[0]);
				
				addFriendToFirstPlace(p);
			}
		}
	}
	
	private Person betterFriend(Person p, Person q) {
		//having a friend is better than no friend at all
		if(p == null) {
			return q;
		}
		if(q == null) {
			return p;
		}
		if(p.getClass() == this.getClass()) {
			if(p.hobby == this.hobby) {
			return p;
			}
		}
		if(q.getClass() == this.getClass()) {
			if(q.hobby == this.hobby) {
				return q;
			}
		}
		//if none of these are true, just take p
		return p;
	}
	
	
	public void printFriends() {
		System.out.println("My name is "+firstName+" and these are my friends.");
	}
	
	/**
	 * Moves all Person in friends back one index and puts p at index 0
	 * @param p
	 */
	public void addFriendToFirstPlace(Person p){
		//this for loop goes backwards...
		for(int i = friends.length-1; i--) {
			
		}
	}
	
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I am from "+home+". Call me "+nickname+".";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		nickname = createNickname(firstName);
	}
	
	//Java IS PASS-BY VALUE
	//meaning the parameters of a method are just values, not references
	//so if you change those values, the original object is not is not affected.
	public static String createNickname(String name) {
		String nick = "";
		int secondVowelPsn = findSecond();
		
		nick = name.substring(0,secondVowelPsn);
		return nick;
	}
	
	public static findSecond(String word) {
		int index = word.length();
		boolean foundVowel = false;
		for(int i = 0; i < word.length(); i++) {
			if(word.substring(i,  i+1).equals("a") || word.substring(i,  i+1).equals("e") || 
				word.substring(i,  i+1).equals("i") || word.substring(i,  i+1).equals("o") || 
				word.substring(i,  i+1).equals("u")) {
				if(!foundVowel) {
					//
				}else {
					//
				}
			}
		}
		return index;
	}
}
