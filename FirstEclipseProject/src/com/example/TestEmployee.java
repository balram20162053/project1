package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestEmployee {
	
public static void main(String[] args) {
//	Vector<Employee> list;
	List<Employee> list = new ArrayList<>();
	
	
	Employee e1= new Employee(20,"Balram","Associate Developer",50000.56);
	Employee e2= new Employee(10,"Ashok","software Developer",65000.25);
	Employee e3= new Employee(15,"Ram","software Engineer",35000.56);
	Employee e4= new Employee(15,"Sharmistha","Analyst",18000.58);
	
//	list1.put(e1.getId(), e1);
//	list1.put(e2.getId(), e2);
//	list1.put(e3.getId(), e3);
	TreeSet<Employee> ts = new TreeSet<>();
	
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	
	
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
//    Collections.sort(list);
    
    System.out.println(list);
    System.out.println(ts);
	/* id , name , role
	 * 
	 * select count(*) from employees where Group by role having role='manager' and ;	 *  
	 *  */
	
}
}
