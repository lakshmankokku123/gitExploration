package ListPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		//int a[]= new int[5]; static array
		//a[0]=10;
		//a[1]=20;
		
		ArrayList ar= new ArrayList();
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("Selenium");
		ar.add(10);
		ar.add("Lakshman");
		//System.out.println(ar.size());//size of array
		ar.add('L');
		ar.add(10.1);
		//System.out.println(ar.size());
		//System.out.println(ar.get(3));
		ar1.add(1000);
		//ar1.add("LakshmanKokku");
		ArrayList<E> ar3= new ArrayList<E>();
		
		
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		EmployeeClass e1= new EmployeeClass("Lakshman",25,30000);
		EmployeeClass e2= new EmployeeClass("Mounika",25,30000);
		EmployeeClass e3= new EmployeeClass("Rekha",25,30000);
		
		ArrayList<EmployeeClass> ar4 = new ArrayList<EmployeeClass>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse the values;
		
		Iterator<EmployeeClass> it=ar4.iterator();
		while(it.hasNext()){
			EmployeeClass emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.salary);
			
		}
		
		
		
		

	}

}
