package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import com.sun.javafx.collections.MappingChange.Map;

import sun.security.provider.certpath.CollectionCertStore;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("orange");
		al.add("apple");
		al.add("grape");
		al.add("mango");
		al.add("orange");
	System.out.println(al);
	al.iterator();
	System.out.println(al);
	al.trimToSize();
	System.out.println(al);
	LinkedList ll=new LinkedList();
	ll.add("orange");
	ll.add("apple");
	ll.add("grape");
	ll.add("mango");
	ll.add("orange");
	ll.add(5);
	ll.add('a');
	ll.add(true);
System.out.println(ll);
System.out.println(ll.size());
ll.clone();
System.out.println(ll);
//Collections.sort(ll);
//System.out.println(ll);
//Collections.sort(al);
//System.out.println(al);
//ll.clear();
//System.out.println(ll);	
		
	}

}
