package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public void print(String[] a) {
		for (String i : a)
			System.out.println(i);
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public void printreverse(String[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public void printOther(String[] a) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public void printRandom(String[] a) {
		ArrayList<Integer> printed = new ArrayList<Integer>();
		while (printed.size() <= a.length) {
			int rand = (int) (Math.random() * a.length);
			while (printed.contains(rand)) {
				rand = (int) (Math.random() * a.length);
			}
			System.out.println(a[rand]);
			printed.add(rand);
		}
	}

}
