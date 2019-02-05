package collection;
import java.util.*;

import comparatorExamples.IntegerDescending;


public class HashSetExample
{
	public static void main(String args[])
	{
		HashSet h=new HashSet();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add(null);
		h.add("d");
		h.add(10);
		System.out.println(h.add("a"));
		System.out.println(h);
	    
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("a");
		lh.add("b");
		lh.add("c");
		lh.add(null);
		lh.add("d");
		lh.add(10);
		System.out.println(lh.add("a"));
		System.out.println(lh);
		
		
		TreeSet<Integer> s=new TreeSet<Integer>();
		s.add(5);
		s.add(6);
		s.add(2);
		s.add(1);
		s.add(7);
		s.add(9);
		
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(5));
		System.out.println(s.tailSet(5));
		System.out.println(s.subSet(1,5));
		
		TreeSet<Integer> t=new TreeSet<Integer>(new IntegerDescending());
		
		t.add(9);
		t.add(3);
		t.add(1);
		t.add(5);
		t.add(765);
		t.add(745);
		t.add(8);
		
		System.out.println(t);
				
		
	}

}
