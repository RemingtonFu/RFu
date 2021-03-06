package arrays;

import java.util.Arrays;

public class ArraysMain {

	private String[] testArray;
	private int[] intRay;
			
	public ArraysMain() {
		intRay = new int[100];
//		populate(intRay);
//		checkOccurences(intRay, 3, 18);
		populate1ToN(intRay);
		shuffle(intRay);
		//Arrays is a Utility class included in Java for formatting output
		System.out.println(Arrays.toString(intRay));
	}
	
	public int[] reverseOrder(int[] arr) {
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[arr.length - 1 - i];
		}
		return newArr;
	}
	
	public void reverseOrderOriginal(int[] arr) {
		for(int i = 0; i < arr.length/2; i++) {
			swap (arr, i, arr.length - 1 - i);
		}
	}
	
	/**
	 * remove the element at index zero, push every other element up by one. 1 to 0, 2 to 1, etc...
	 * put the element that was at zero at the end of arr
	 * @param arr
	 */
	public void frontToBack(int[] arr) {
		 int front = arr[0];
		 for(int i = 0; i < arr.length - 1; i++) {
			 arr[i] = arr[i + 1];
		 }
		 arr[arr.length - 1] = front;
	}

	/**
	 * moves the front to the back repeatedly, exactly n times
	 * @param arr
	 * @param n
	 */
	public void cycleThrough(int[] arr, int n) {
		int repeatTimes = 0;
		int back = arr[arr.length-1];
		while(repeatTimes =< n) {
			for(int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i - 1];
			}
			arr[arr.length - 1] = back;
			repeatTimes++;
		}
	}
	
	/**
	 * returns the length of the longest sequence of consecutive integers in arr
	 * For example lCS({1, 2, 3, 7, 8, 9, 10}) returns 4 because 7, 8, 9, 10 is 4 integers long
	 * @param arr
	 * @return
	 */
	public int longestConsecutiveSequence(int[] arr) {
		int sequence = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]+1 == arr[i + 1]) 
				sequence++;
		}
		return sequence;
	}
	
	/**
	 * returns two pieves of information data[0] which is the length of the kongest sequence and
	 * data[1] which is the position where the sequence begins
	 * @param arr
	 * @return
	 */
	public int[] longestConsecSeqAndPos(int[] arr) {
		int[] data = new int[2];
		return data;
	}
	
	/**
	 * returns true if arr[pos] and arr[pos + 1] are sequential
	 * @param arr
	 * @param pos
	 * @return
	 */
	public boolean nextElementIsInSequence(int[] arr, int pos) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[pos]+1 == arr[pos + 1]) 
				return true;
		}
		return false;
	}
	
	/**
	 * returns the length of the sequence starting at index pos
	 * example: cL({1,2,3,2,3,1},3) returns 2
	 * @param arr
	 */
	public int consecutiveLength(int[] arr, int pos) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			
		}
	}
	
	public void countLessThan(int[] arr, int n) {
		int output = 0;
		for(int i = 0; i < arr.length; i++) {
			
		}
	}
	
	private void shuffle(int[] arr ) {
		for(int i = 0; i < arr.length; i++) {
			swap(arr, (int) (Math.random()*arr.length), (int)(Math.random()*arr.length));
		}
	}
	
	private void swap(int[] arr, int i, int j) {
		int placeholder = arr[i];
		arr[i] = arr[j];
		arr[j] = arr[placeholder];			
		}
	
	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
	}
	
	private void checkOccurences(int[] arr, int start, int end) {
		int[] counter = new int[end - start + 1];
		for(int value: arr) {
			counter[value - start]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println("A " +(start + i)+ " was rolled " +counter[i]+ " times.");
		}
	}
	
	private void populate(int[] intRay) {
		for(int i = 0; i < intRay.length; i++) {
			intRay[i] = diceRoll(2);
		}
	}
	
	public void notes() {
		//1. collection of primitives or ovjects
		//SPECIAL NOTE: This is the ONLY collection of primitives
		
		//2. size cannot be modified
		
		//3. Elements of an array are REFERENCES to objects.
		//In other words, changing an element of an array changes
		//the REFERENCE, not the object (more on this later)
		
		//______________________________________________________________
		
		//There are two types of constructors. The first we've seen already:
		int[] firstType = {3, 14, -9, 10};
		//this constructor can only be used at the declaration. Error: 
		//firstType = {12, 13. 14. 15};
		
		//the 2nd type:
		testArray = new String[50];
		/*SPECIAL NOTE: for primitive arrays, when they are instantiated,
		 * the are automatically populated with 0s. This is not the case with
		 * Object arrays, which are populated with 'null'
		 */
		
		//standard 'for' loop
		for(int i = 0; i < testArray.length; i++) {
			System.out.println("The #" +i+" item is:" +testArray[i]);
		}
		
		//for each loop (useful only when you don't need to keep track of an index
		for(String value: testArray) {
			//"for each int in test Array..."
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		ArraysMain arrayPractice = new ArraysMain();
	}
	
	/**
	 * Returns the result from rolling "numberOfDice" dice.
	 * @param numberOfDice
	 * @return
	 */
	public int diceRoll(int numberOfDice) {
		int roll = 0;
		for(int i = 0; i < numberOfDice; i++) {
			roll = roll + 1+(int)(Math.random()*6);
		}
		return roll;
	}
	
}
