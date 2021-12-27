package Week1.day2;

import java.util.Arrays;

public class Week1Assignment {
	public static void main(String[] args) {
		Week1Assignment obj = new Week1Assignment();
		obj.palindrome();
		obj.primeNumber();
		obj.negativeNumber();
		obj.intersectionArray();
		obj.secondSmallest();
		obj.missingValue();
	}

	// Palindrome Method
	public void palindrome() {
		int input = 25252, inputFinal = 0;
		int inputTemp = input;

		while (inputTemp > 0) {
			int rem = inputTemp % 10;
			inputFinal = (inputFinal * 10) + rem;
			inputTemp = inputTemp / 10;
		}
		if (input == inputFinal) {
			System.out.println("The given number is Palindrome");
		} else {
			System.out.println("The given number is not palindrome");
		}
	}

	// Prime Number Method
	public void primeNumber() {
		int input = 999;
		int counter = 0;
		for (int i = 2; i <= input; i++) {
			int primeNum = input % i;
			if (primeNum == 0) {
				counter = counter + 1;
			}
		}
		if (counter == 1) {
			System.out.println("Given number is Prime number:" + input);
		} else {
			System.out.println("Given number is not prime number:" + input);
		}

	}

	// Covert Negative to Positive method
	public void negativeNumber() {
		double input = -350;
		if (input < 0) {
			input = input * -1;
			System.out.println("Given number is Negative");
			System.out.println("Given Negative number is converted into positive number" + " " + input);
		} else if (input > 0) {
			System.out.println("Given number is positive number:" + " " + input);
		} else {
			System.out.println("Given number is neither positive or Negative");
		}

	}

	// Find Intersection
	public void intersectionArray() {
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					int k = 0;
					int[] array3 = new int[k + 1];
					array3[k] = array1[i];
					System.out.println("Intersection array is:" + array3[k]);
					k = k + 1;
				}
			}

		}

	}
	
	//Second Smallest number in array
	public void secondSmallest() {
		int[] array1= {1,9,6,7,5,10};
		Arrays.sort(array1);
		System.out.println("Second smallest number is:"+array1[1]);

	}
	
	//Find missing value in array
	
	public void missingValue() {
		int[] array1= {1,2,3,5,6,7};
		Arrays.sort(array1);
		int arrLength=array1.length;		
		for(int i=1;i<arrLength;i++) {
			if(i!=array1[i-1]) {
				System.out.println("Missing value is"+i);
				break;
			}
		}

	}

}
