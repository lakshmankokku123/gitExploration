package ListPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class SinglyLinkedListConcept {

	private static final Iterator<Integer> Integer = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NEW CHANGE FOR GIT 
		
		LinkedList<String> ll= new LinkedList<String>();
		LinkedList<Integer>il= new LinkedList<Integer>();
		il.add(99);
		il.add(63);
		il.add(30);
		il.add(56);
		il.add(100);
		
		System.out.println("the value of array elements is " +il);
		
		//LinkedList<String> ll= new LinkedList<String>();
		ll.add("Srinivasaro");
		ll.add("Lalitha");
		ll.add("Ram");
		ll.add("Lakshman");
		System.out.println("The elementys of Linked List are" +ll);
		ll.addFirst("LakshmiPrasanna");
		
		System.out.println("the new added linked List is" +ll);
		
		ll.set(0,"Sathwick");
		ll.remove(2);
		
		
		
		Iterator<String> it=ll.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next());
			
		}
		
		//Iterator<Integer>=il.iterator();
		
		
		for(String str:ll) {
			
			System.out.println(str);
		}
		//Iterator<int>iit=it.iterator();
		
		for( int i:il) {
			
			System.out.println(i);
			
		}

	}

}
