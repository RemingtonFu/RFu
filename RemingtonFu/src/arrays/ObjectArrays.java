package arrays;

public class ObjectArrays {

	public ObjectArrays() {
		Object[] people = new Object[20];
		populate(people);
		people[0] = new Thing("coffee maker");
		for(Object p: people) {
			System.out.println(p);
		}
	}

	private void populate(Object[] people) {
		for(int i = 0; i < people.length; i++) {
			String firstName = randomNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough b = randomBorough();
			//BIG IDEA:
			//In Object[] (but not primitive arrays like int[] or double[])
			//you can have multiple data types (sub-classes of the declared type)
			if(Math.random() < .6){
				//60% of the time...
				int grade = (int)(Math.random()*5)+9;
				people[i] = new Student(firstName, lastName, b, grade);
			} else {
				//the other 40% of the time
				people[i] = new Person(firstName, lastName, b);
			}
		}
	}
	private String randomNameFrom(String[] a, String[] b, String[] c) {
		return get(a)+get(b)+get(c);
	}
	
	private String get(String[] a) {
		return a[(int)(Math.random()*a.length)];
	}
	
	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random()*Borough.NY_BOROUGHS.length)];
	}
	
	public Person[] selectGroup(Person[] population, int length) {
		Person[] group = new Person[length];
		group[0] = selectAPerson(population);
		for(int i = 0;  i < length; i++) {
			Person nextPerson = selectAPerson(population);
			while(personInGroup(group, nextPerson)) {
				nextPerson = selectAPerson(population);
			}
			group[i] = nextPerson;
		}
		return group;
	}
	public int countDifferences(Person[] arr1, Person[] arr2) {
		int count = 0;
		if(p.hobby == this.hobby) {
			count++;
			}
	}	 
	
	/**
	 * calls count differences on two Person arrays,
	 * each array must contain the same elements, but randomly ordered
	 * Print the number of differences between the two arrays
	 * Do this 100 times, print the average (hint: average needs to be a double)
	 */
	public void testShuffling(Person[] arr1, Person[] arr2) {
		countDifferences(arr1, arr2)
	}
	
	
	
	
	
	
		
	private boolean personInGroup(Person[] group, Person nextPerson) {
		for(int i = 0;  i < group.length; i++) {
			if (group[i] == nextPerson) {
				
			}
		}
	}
	
	private int selectAPerson(Person[] group, Person nextPerson) {
		
	}
	
}
