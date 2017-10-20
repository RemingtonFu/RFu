package arrays2d;

public class Main {

	/**
	 * increases the element in arr at index psn and
	 * decreases the elements at psn - 1 and psn + 1, 
	 * if they exist
	 * 
	 * This idea iws another major topic in AP CSA.
	 * It is the idea of avoiding an ArrayIndexOutOfBoundsException
	 * you will it on quizzes, tests, and project rubrics
	 * 	BE WARY.
	 * 
	 */
	public static void changeNeighbors(int[] arr, int psn) {
		for(int i = 0; i < arr.length; i++) {
			arr[psn] = arr[psn]++;
			arr[psn-1] = arr[psn-1]--;
			arr[psn+1] = arr[psn+1]--;
		}
	}
}
