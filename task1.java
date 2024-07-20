package test;

public class task1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 4, 45, 99 };

		int firstLargest = 0;
		int secondLargest = 0;

		for (int num : arr) {
			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			}
		}

		System.out.println("The second largest element is: " + secondLargest);
	}
}
