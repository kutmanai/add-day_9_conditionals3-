package array_assignments;

import java.util.Arrays;

public class ArrayNumbersAssigments {

	public static void main(String[] args) {
		// task1 1) populate an int array with numbers from 1 to 10

		int[] num = { 1, 3, 5, 2, 6, 4, 9, 10, 8, 7 };
		for (int num1 : num) {
			System.out.print(num1 + " ");
		}

		// task2 take this array : int[] a = new int[]{4,5,6}; and create an array
		// called b with the
		// length of a + 1 more position. if the first array size is 3 the second array
		// size should
		// be 3+1. output the b array size to console. (remember an array positions
		// start from
		// zero but the length counts the actual number in an array,if an array has 3
		// positions
		// its length will be 3 when you create a new array you will need the actual
		// number of
		// positions).

		int[] a = new int[] { 4, 5, 6 };
		int[] b = new int[a.length + 1];

		System.out.print(a.length);
		System.out.println(b.length);

		System.out.println();

		// task3 print to the console "foo bar" using two positions from this array:

		String[] s_r = new String[] { "foo ", "hello", "bar", "world" };

		System.out.print(s_r[0] + s_r[2]);

		System.out.println();

		// task4)print 2.5 double to the console by adding numbers from this array:
		double[] d_r = new double[] { 0.2, 0.3, 1.0, 1.5, 2.0 };

		System.out.println(d_r[2] + d_r[3]);

		System.out.println();
		// task5 loop and print to the console the numbers from this array:
		int[] nums = new int[] { 5, 4, 3, 7, 8, 11 };
		for (int num1 : nums) {
			System.out.println(num1);
		}

		System.out.println();
		// 6)print to console the sum of this int array:

		int[] nums1 = new int[] { 6, 7, 11, 12, 2, 3 };
		int sum = 0;
		for (int n : nums1) {
			sum += n;
		}
		System.out.print(sum + " ");

		System.out.println();

		// task7)get the biggest number in an int array using a loop and print the
		// biggest number
		// to console, use this loop.

		int[] nums2 = new int[] { 60, 73, 9, 15, 200, 350 };
		int largest = nums2[0];
		for (int number : nums2) {
			if (number > largest) {
				largest = number;
			}
		}
		System.out.println(" Largest value :" + largest);
		System.out.println();

		// task8) loop a string array filled with fruit names and count how many
		// instances of the
//	               string "banana" are inside the array, after the loop print how many instances of
//	               banana you find

		String[] list = new String[] { "banana", "apple", "pinapple", "banana", "mango", "banana" };
		int count = 0;

		for (String fruit : list) {
			if (fruit.equals("banana")) {

				count++;
			}
			
			
			
		}
			System.out.println(count);

		

		// task9)copy old_r elements into new_r empty positions, new_r size is bigger
		// then old_r
//	            		   size by one. inside new_r last position put new_word "four", and then output the
//	            		   array using the java array util "Arrays.toString()". this is the starting code:
//	            		   String[] old_r = new String[] {"one","two","three"};
//	            		   String new_word ="four";
//	            		   String[] new_r = new String[old_r.length+1];
//	            		   hint: use a loop to loop all of old_r elements, use the loops increment int (if you
//	            		   dont have one create it int i = 0 and at the end of the loop put i++;) to put the
//	            		   element in the same position inside of new_r, after the loop put the new_word in
//	            		   the last position of new_r, use length­1 to point to the last position. finally use
//	            		   Arrays.toString() to easily print the new_r to console.

		String[] r_old = { "one", "two", "threes" };
		String n = "four";
		String[] r_new = new String[r_old.length + 1];
		for (int j = 0; j < r_old.length; j++) {
			r_new[j] = r_old[j];
			r_new[r_old.length] = n;
		}
		System.out.println(Arrays.toString(r_new));

	}

	// Task1010) the not so utopian tree. you have an int array describing the
	// growth of the tree
//	            		   every year for 10 years, for the first 3 years it shod grow 1 cm (the first 3 elements
//	            				   in the growth array), for the rest it shod grow for 2 cm, create a loop that will make
//	            				   sure this happens, if not change the values accordingly (if year is less then 3 and
//	            				   the element is less then 1 set it to one),if in later years the array element show a
//	            				   number less then 2 change the array element to 2.
//	            				   after that print the trees growth:

//	int[] growth = new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4 };
//	int treeSize = 0;
//	int year=0;
//
//	for(
//	int i = 0;i<growth.length;i++)
//	{
//		year++;
//		System.out.println("year" + year + "growth:" + growth[i] + "cm");
//		treeSize += growth[i];
//		System.out.println(" Tree size " + treeSize + "cm");
//	}

	/// Array multiplication questions and answers
	/*
	 * 1.b) abab 2.a) some_array.length; 3.b) String[]c=new String[5]; 4.c)0
	 *
	 * 5.c) 3 6.a) 7.d) 8.a) 9 14.c) 15.d)
	 * 
	 */

}


