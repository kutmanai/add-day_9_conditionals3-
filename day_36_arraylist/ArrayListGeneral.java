package day_36_arraylist;

import java.util.ArrayList;

public class ArrayListGeneral {

	public static void main(String[] args) {// TODO Auto-generated method stub
       ArrayList list = new ArrayList();
       //create a general (row type) arraylist
       //We can add any type of data to this list.int, double, String
       
       list.add("java");
       list.add("eclipse");
       list.add("Slack");
       list.add(456);
       list.add(true);
       System.out.println(list);
       list.add(345.2);
       list.add('-');
       System.out.println(list);
       System.out.println(list.get(0));
       System.out.println(list.size());
       list.add("water");
       list.add("Bless you");
       System.out.println(list.size());
	

}
}
