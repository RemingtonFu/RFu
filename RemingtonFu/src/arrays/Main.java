package arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectArrays oA = new ObjectArrays();
		Person s = new Person("Remington", "Fu", Borough.NY_BOROUGHS[0]);
		int x = 10;
		int[] a = {5,6,7};
		test(s,x,a);
		System.out.pringln(s+", "+x+", "+Arrays.toString(a));
	
		
	}
	/**
	 * PASS-BY-VALUE EXAMPLES
	 * THIS DOES NOT CHANGE THE NAME
	 */
	public static void test(String s, int x, int[] arr) {
		String name = s.getFirstName();
		name = "Remy";
		x = 5;
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
	}
	
	/**
	 * PASS-BY-VALUE EXAMPLES
	 * THIS DOES CHANGE THE NAME
	 * THIS ALSO CHANGES THE ARRAY
	 * NO METHOD CAN PERMANENTLY CHANGE AN INT
	 * (you can if you set it at a return type)
	 */
	public static void test2(String s, int x, int[] arr) {
		s.setFirstName("Remy");
		x = 5;
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
	}
	

}
