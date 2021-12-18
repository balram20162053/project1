package CollectionTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ArrayListTut1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 * String[] array = new String[3];
		 * 
		 * 
		 * System.out.println("Please enter 3 names to sort");
		 * 
		 * for (int i = 0; i < array.length; i++) { array[i] = s.nextLine(); }
		 */
		/*
		 * for(int i=0;i<array.length;i++) { char strarr[] =
		 * (array[i].toLowerCase()).toCharArray(); Arrays.sort(strarr);
		 * System.out.println(strarr); array[i]=Arrays.toString(strarr);
		 * System.out.println(array[i]); } System.out.println(Arrays.toString(array));
		 */
	    
		Employee e1= new Employee(20,"Balram","Associate Developer",50000.56);
		Employee e2= new Employee(10,"Ashok","software Developer",65000.25);
		Employee e3= new Employee(15,"Ram","software Engineer",35000.56);
		Employee e4= new Employee(8,"Sharmistha","Analyst",18000.58);
		
		Map<String,Employee> tm= new TreeMap<>();
		
		tm.put(e1.getName(), e1);
		tm.put(e2.getName(), e2);
		tm.put(e3.getName(), e3);
		tm.put(e4.getName(), e4);
		System.out.println(tm);
		
	    List<String> list= new ArrayList<>();
	    list.add("balram");
	    list.add("lovely");
	    list.add("ravi");
	    list.add("yash");
	    list.add("abcd");
	    for(int i=0;i<list.size();i++) {
	    	if(list.get(i).equals("yash")){
	    		list.set(i, "abc");
	    	}
	    }
	    String[] str = new String[list.size()];
	    for(int i=0;i<list.size();i++) {
	    	char st[] = list.get(i).toCharArray();
	    	Arrays.sort(st);
	    	str[i] = new String(st);
	    }
	    System.out.println(Arrays.toString(str));
	    System.out.println(list);
	    for(int i=0;i<list.size();i++) {
	    	if(list.get(i).equals(str[i])) {
	    		System.out.println(" Positive String");
	    	}else {
	    		System.out.println(" Negative String");
	    	}
	    }
	    
	    List l1= new ArrayList();
	    l1.add(2);
	    l1.add("Balram Chaudhary");
	    l1.add(98000);
	    l1.add(e1);
	    for(int i=0;i<l1.size();i++) {
	    	if(l1.get(i).equals("Balram Chaudhary")){
	    		l1.set(i, "Lovley");
	    	}
	    }
	    System.out.println(l1);
	    
	    List l2 = new LinkedList();
	    l2.add(5);
	    l2.add("Balram Chaudhary");
	    l2.add(102500.00);
	    System.out.println(l2);
	    Integer m=(Integer) l2.get(0);
	    System.out.println(m);
	    StringBuilder st1= new StringBuilder();
	    st1.append(l2.get(1));
	    st1.append("Chaudhary");
	    st1.reverse();
	    System.out.println(st1);
	    String s1= "ABC";
	    s1=s1+"CDE";
	    System.out.println(s1);
	    
	    
	    System.out.println(st1);
	    
	    HashSet set = new HashSet();
	    set.add(23);
	    set.add(5);
	    set.add(10);
	   
	    
	    System.out.println(set);
	    
	    ArrayList<Integer> newList= new ArrayList<Integer>();
	    newList.add(10);
	    newList.add(20);
	    newList.add(30);
	    newList.add(40);
	    newList.add(50);
	    Collections.reverse(newList);
	    System.out.println("Reverse the list "+newList);
	    
	    ArrayList newList1 = new ArrayList();
	    newList1.add(10);
	    newList1.add(30);
	    newList1.add("Balram Chaudhary");
	    
	    newList.removeAll(newList1);
	    System.out.println(newList);
	    System.out.println();
	    
	    //Just to test
	}

}
