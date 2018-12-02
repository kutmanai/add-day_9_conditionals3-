package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdate {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		nums.add(500);
		System.out.println(nums);
		
		//update 100 to 1000
		nums.set(0, 1000);
		System.out.println(nums);
		

		//double the value of index 1
		
		nums.set(1,nums.get(1) *2);
		System.out.println(nums);
		
		//find the position of 300 and make it 3
		
		nums.indexOf(300);
		System.out.println(nums);
		
		int pos=nums.indexOf(300);
		nums.set(pos, 3);
		System.out.println(nums);
		
		nums.set(nums.indexOf(500), 65);
		System.out.println(nums);
		
		
		
	}

}
