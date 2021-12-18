package CollectionTut;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListTut {
	
	public static void main(String[] args) {
		LinkedList<Employee> list = new LinkedList<>();
		
		Employee e1= new Employee(20,"Balram","Associate Developer",50000.56);
		Employee e2= new Employee(10,"Ashok","software Developer",65000.25);
		Employee e3= new Employee(15,"Ram","software Engineer",35000.56);
		Employee e4= new Employee(8,"Sharmistha","Analyst",18000.58);
		
		list.add(e1);
		list.add(e2);	
		list.add(e3);
		list.add(e4);
		
//		Collections.sort(list , new Comparator<Employee>(){
//			public int compare(Employee e11,Employee e21) {
//				return e11.getId().compareTo(e21.getId());
//			}
//		});
		List<Employee> list1= list.stream().sorted((emp1,emp2)->emp1.getId().compareTo(emp2.getId())).collect(Collectors.toList());
		System.out.println(list1);
		
		LinkedList<String> list2 = new LinkedList<>();
		
	list2.add("Balram Chaudhary");
	list2.add("ravi kumar");
	list2.add("sharmistha upadhayay");
	list2.add("aditya kumar");
	list2.add("gaurav upadhayay");
	Collections.sort(list2);
	System.out.println(list2);
	 char ch1 = 'a';
	 char ch2 = 'A';
	 int a = ch1;
	 int b= ch2;
	 
	 for(char i= 'A';i<='Z';i++) {
		 System.out.println(i);
	 }
	 char test ='a';
	String st1 = String.valueOf(test);
	Integer num1 = Integer.valueOf(test);
	System.out.println(st1);
	System.out.println(num1);
	 
		
		
	}

}
