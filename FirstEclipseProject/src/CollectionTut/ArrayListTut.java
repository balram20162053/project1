package CollectionTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

import CollectionTut.Employee;

public class ArrayListTut {
	
public static int compareByName1(Employee m1,Employee m2) {
		return m1.getName().compareTo(m2.getName());
	}

public static void main(String[] args) {
	
	List<Employee> list = new ArrayList();
	Employee e1= new Employee(20,"Balram","Associate Developer",50000.56);
	Employee e2= new Employee(10,"Ashok","software Developer",65000.25);
	Employee e3= new Employee(15,"Ram","software Engineer",35000.56);
	Employee e4= new Employee(8,"Sharmistha","Analyst",18000.58);
	
	
	Integer arr[]= {20,30,30,40,60,10,5};
	String str[]= {"Lovely","Balram","Ravi","Manvi"};

	int len1=str.length;
	for(int i=0;i<len1;i++) {
		if(str[i]=="Ravi") {
			str[i]="Ashok";
		}
	}
	System.out.println(Arrays.toString(str));
	System.out.println("Ascending Order"+Arrays.toString(str));
	Arrays.sort(str,Collections.reverseOrder());
	System.out.println("Descending Order"+Arrays.toString(str));
	
	for(String s:str) {
		StringBuilder st= new StringBuilder(s);
		st.reverse();
		for(int i=0;i<st.length();i++) {
			System.out.print(st.charAt(i)+" ");
		}
	}
	
	
	Arrays.sort(arr);
	System.out.println("Ascending Order"+Arrays.toString(arr));
	Arrays.sort(arr,Collections.reverseOrder());
	System.out.println("Desending Order"+Arrays.toString(arr));
	
	String str1="Balram Chaudhary";
	System.out.println(str1);
	
	char ch[]= str1.toCharArray();
	for(char chr: ch) {
		System.out.print(chr+" ");
	}
	
	
	
	System.out.println("\n+++++++++++++++++++++++++++++++++++++++ ArrayList ++++++++++++++++++++++++++++++++++");
	
	
	List<Integer> list1 = new ArrayList<>();
	list1.add(5);
	list1.add(4);
	list1.add(6);
	list1.add(3);
	list1.add(7);
	list1.add(2);
	list1.add(9);
	list1.add(1);
	
	System.out.println("Original Array"+list1);
	Collections.sort(list1);
	System.out.println("In Ascending Order "+list1);
	Collections.sort(list1,Collections.reverseOrder());
	System.out.println("In Descending Order "+list1);
	
	List<Integer> newList1=list1.stream().filter(i->(i%2)==0).collect(Collectors.toList());
	list1.stream().filter(e->e>6).forEach(e->{System.out.print(e+" ");});
	System.out.println("\n");
	list1.stream().map(i->i=i+10).forEach(e->System.out.print(e+" "));
	System.out.println(newList1);
	
	List<String> list2 = Arrays.asList("BALRAM","LOVELY","RAVI","ASHOK");  //Immutable LIST
	System.out.println(list2);
	Collections.sort(list2,Collections.reverseOrder());
	System.out.println(list2);
	
	List<Integer> list3 = new ArrayList<>(Arrays.asList(4,5,6,7));    //Immutable List
	list3.add(3);
	System.out.println(list3);
	
	
	List<Integer> list4 = list3.stream().filter(i->i>5).collect(Collectors.toCollection(ArrayList::new));
	Iterator<Integer> iter= list4.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	System.out.println(list4.toString());
	
	List<Employee> emp = new ArrayList<>();
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e3);
	emp.add(e4);
	System.out.println(emp);
	Collections.sort(emp, ArrayListTut::compareByName1);
	System.out.println(emp);
	System.out.println(emp);
	
	List<Employee> streamList= emp.stream().sorted((emp1,emp2)->emp1.getId().compareTo(emp2.getId())).collect(Collectors.toList());
	System.out.println(streamList);
	
	int arr1[]= {4,46,53,56,57,75,78};
	int n=arr1.length;
	System.out.println("length is "+n);
	int low=0,high=n-1;
	int num=53;
	int ans=-1;
	while(low<=high) {
		int mid=(low+high)/2;
		System.out.println(mid+" "+arr1[mid]+" "+num);
		if(arr1[mid]==num) {
			ans=mid;
			break;
		}
		if(num>arr1[mid]) {
			low=mid+1;
		}else {
			high=mid-1;
		}
	}
	
	System.out.println(ans);

	System.out.println("++++++++++++++++++++Input Output++++++++++++++++++++++++");
	Scanner sc= new Scanner(System.in);
	/*
	 * System.out.println("Enter the name : "); String name=sc.nextLine();
	 * System.out.println("Value of name is : "+name);
	 * 
	 * System.out.println("Enter the value of a :"); int a=sc.nextInt();
	 * System.out.println("Value of a is :"+a);
	 * 
	 * int arr12[] = new int[5]; int n1= arr12.length; for(int i=0;i<n1;i++) {
	 * System.out.println("Enter "+(i+1)+" element :"); arr12[i]= sc.nextInt(); }
	 * System.out.println(Arrays.toString(arr12));
	 */
	
	String names[]= new String[4];
	int len= names.length;
	for(int i=0;i<len;i++) {
		System.out.println("Enter "+(i+1)+" element :");
		names[i]=sc.nextLine();
	}
	System.out.println(Arrays.toString(names));
	
	
	
	
}
}
