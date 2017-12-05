package classnotes;

public class towerOfHanoi {

	 public static void main(String[] args) {
			System.out.println(hanoi());
		}
	
	public void hanoi(int n, String start, String help, String end) {
		if(n == 1) {
			System.out.println(start + " to " + end);
		}else {
			hanoi(n - 1, start, end, help);
			System.out.println(start+" to "+end);
			hanoi(n - 1, help, start, end);
		}
	}
	
}
