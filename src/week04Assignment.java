import java.util.ArrayList;
import java.util.List;

import javax.naming.Name;

public class week04Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = new int[8];
		
		// ages to add 3, 9, 23, 64, 2, 8, 28, 93.
		
		ages[0] = 3;
		ages[1] = 9; 
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
	     
	// print out the result of element 0 from 7 
int lastElement = ages[ages.length - 1];	
int result = (lastElement - ages[0]);
System.out.println(result);
// increased the array size to 8 to accommodate all elements, accessed the last element of the array - the first

int[] ages2 = new int[10];
 // ages2 needs to have 9 elements
ages2[0] = 10;
ages2[1] = 20;
ages2[2] = 30;
ages2[3] = 40;
ages2[4] = 50;
ages2[5] = 60;
ages2[6] = 70;
ages2[7] = 80;
ages2[8] = 90;
ages2[9] = 100;

// repeat previous steps
System.out.println("----------------");
int lastElement2 = ages[ages.length - 1];
int result2 = (lastElement2 - ages[0]);
System.out.println(result2);
int sum = 0;
for (int i = 0; i < ages2.length; i++) {
	sum += ages2[i];
}
System.out.println("----------------");	
System.out.println(sum / 10 + " is the average.");

// calculated the average by iterating thru the ages2 array and printed the result / the length of the array
System.out.println("-----------------");		
String[] names = new String[6];
names[0] = ("Sam");
names[1] = ("Sally");
names[2] = ("Tim");
names[3] = ("Tommy");
names[4] = ("Buck");
names[5] = ("Bob");
int sumNames = 0;
for (String name : names) {
	sumNames += name.length();
}
double average = (double) sumNames / names.length;
System.out.println("The average number of letters is" + " " + average);
// above is the solution to calculating the average number of letters in the List of names
System.out.println("------------------");
// concat the names together separated by a space, will be referencing the StringBuilder learned in the lab
StringBuilder concatNames = new StringBuilder();
for (String name : names) {
	concatNames.append(name).append(" ");
}
System.out.println(concatNames.toString());
// learned that you can have multiple .append statements in the same line

/*
 * How do you access the last element in an array?
 * If you don't know the amount of data in an array the easiest way is array.length - 1.
 * System.out.println(array.length - 1);
 * 
 * How do you access the first element in an array?
 * Array's are 0 based, meaning array[0] will always be the first element of the array.
 * System.out.println(array[0]);
 */

int[] nameLengths = new int[names.length];
for (int i = 0; i < names.length; i++) {
    nameLengths[i] = names[i].length();
}
// did this to hold the values of each name length
for (int length : nameLengths) {
    System.out.print(length + " ");
}
// this accomplishes iterating over the array to calculate the length of each name in the array
		
int sumOfNames = 0;
for (int length : nameLengths) {
	sumOfNames += length;
}
System.out.println();// used to make a break in console.
System.out.println(sumOfNames + " is the total sum of each name length.");


	}
	// method to return concatenated word
	public static String Hello(String word, int n) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(word);
		}
		return result.toString();
	}
	// method to create full name
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		
	}
	// method to return true if sum is greater than 100
	public static boolean sumOfNumbers(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
	return sum > 100;
	}
	// method to return the average double
	public static double average (double[] numbers) {
		int total = 0;
		for (double number : numbers) {
			total += number;
		
		}
		return total / numbers.length;
	}

	/*
	 * method that takes two arrays of double and returns true if the average of the elements
	 *  in the first array is greater than the average of the elements in the second array.
	 */
	
	public static boolean isAverageGreater (double[] array1, double[] array2) {
		double sum1 = 0.0;
		double sum2 = 0.0;
		
		for (double number : array1) {
            sum1 += number;
        }
        double average1 = 0;
        if (array1.length > 0) {
            average1 = sum1 / array1.length;
        }

        for (double number : array2) {
            sum2 += number;
        }
        double average2 = 0;
        if (array2.length > 0) {
            average2 = sum2 / array2.length;
        }

        return average1 > average2;
    }
	// returns true if it is hot outside and i have more than 10.50
	public static boolean willBuyDrink (double moneyInPocket, boolean isHotOutside) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	// this method takes an existing list of integers and sorts through them to compile a new list of
	//integers made entirely of the whole even numbers of the previous list
	public static List<Integer> isNumberEven (List<Integer> list){
		List<Integer> evenList = new ArrayList<Integer>();{
			for (Integer number : list) {
				if (number % 2 == 0) {
					evenList.add(number);
		}
		return evenList;
		
	}
}
}
}