import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	/*
	 *public static void main(String[] args) {
	 *        List<Integer> testArrayList = new ArrayList<Integer>();
	 *        int[] testArray = {1, 2, 3, 4, 5};
	 *        for (int i : testArray) {
	 *                testArrayList.add(i);
	 *        }
	 *        System.out.println("Original: " + testArrayList);
	 *        
	 *        Iterator<Integer> iter = testArrayList.iterator();
	 *        while (iter.hasNext()) {
	 *                int val = iter.next();
	 *                System.out.print(val + " ");
	 *                if (val == 2) {
	 *                        val = 3;
	 *                }
	 *        }
	 *        System.out.println();
	 *        System.out.println("Result: " + testArrayList);
	 *               
	 *}
	 */

	public static void main(String[] args) {
		String test = "asantalivedasadevilatnasa";
		System.out.println("Test String: " + test);
		System.out.println("Result: " + isPalindrome(test));

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			test = sc.next();
			System.out.println("Test String: " + test);
			System.out.println("Result: " + isPalindrome(test));
		}
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static boolean isPalindrome(String str) {
		System.out.println("Original (len: " + str.length() + "): " + str);
		System.out.println("Original endIndex: " + (str.length() - 1));
		return isPalindrome(str, 0, str.length() - 1);
	}
	
	private static boolean isPalindrome(String str, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			return true;
		} else if (str.length() == 2) {
			if (str.charAt(0) == str.charAt(1)) {
				return true;
			}
		} else if (str.charAt(startIndex) == str.charAt(endIndex)) {
			String smaller = str.substring(startIndex + 1, endIndex); // NOTE: substring() does not include the last char
			return isPalindrome(smaller, 0, smaller.length() - 1);
		}
		
		return false;
	}
}
