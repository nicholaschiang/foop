import java.util.ArrayList;
import java.util.Scanner;

public class Killing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			killEveryone(sc.nextInt());
		}
	}

	public static ArrayList<Integer> killEveryone(int size) {
		ArrayList<Integer> circle = new ArrayList<Integer>();
		fillArrayList(circle, size);
		
		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		boolean lastSurvived = false;
		while (circle.size() != 1) {
			if (lastSurvived) {
				// If last person survived, keep odd indices
				for (int i = 0; i < circle.size(); i++) {
					if (i % 2 != 0) {
						tempArr.add(circle.get(i));
					}
				}
				if (tempArr.get(tempArr.size() - 1) == circle.get(circle.size() - 1)) {
					lastSurvived = true;
				} else {
					lastSurvived = false;
				}
				circle.retainAll(tempArr);
			} else {
				// Otherwise, keep even indices
				for (int i = 0; i < circle.size(); i++) {
					if (i % 2 == 0) {
						tempArr.add(circle.get(i));
					}
				}
				if (tempArr.get(tempArr.size() - 1) == circle.get(circle.size() - 1)) {
					lastSurvived = true;
				} else {
					lastSurvived = false;
				}
				circle.retainAll(tempArr);
			}
			tempArr.clear();
		}	
		
		System.out.println("Survivor's #: " + circle);
		
		return circle;
	}

	private static void fillArrayList(ArrayList<Integer> arr, int n) {
		for (int i = 1; i <= n; i++) {
			arr.add(i);
		}
	}
}
