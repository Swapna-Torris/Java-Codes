package collectionsdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		//10
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		marksList.add(76);
		marksList.add(77);
		marksList.add(66);
		marksList.add(66);
		System.out.println(marksList);
		System.out.println(marksList.size());
		System.out.println(marksList.get(1));
		System.out.println(marksList.remove(1));
		System.out.println(marksList);
		boolean result = marksList.contains(66);
		System.out.println(result);
		
		System.out.println("+++++++++++++++++++++++++++++");
		HashSet<Integer> marksList1 = new HashSet<Integer>();
		marksList1.add(76);
		marksList1.add(77);
		marksList1.add(66);
		marksList.add(66);
		System.out.println(marksList1);
		System.out.println(marksList1.size());
		System.out.println(marksList1.remove(66));
		System.out.println(marksList1);
		boolean result1 = marksList1.contains(66);
		System.out.println(result1);
		
		System.out.println("+++++++++++++++++++++++++++++");
		HashMap<Integer,String> empList = new HashMap<Integer, String>();
		empList.put(76,"Rama");
		empList.put(77,"Ramji");
		empList.put(66,"Ram");
		empList.put(79,"Raama");
		System.out.println(empList);
		System.out.println(empList.size());
		System.out.println(marksList1.remove(79));
		System.out.println(marksList1);
		boolean result11 = empList.containsKey(66);
		System.out.println(result11);
		boolean result12 = empList.containsValue("Rama");
		System.out.println(result12);
		Set<Integer>   empids = empList.keySet();
		System.out.println(empids);
		Collection<String> empNames = empList.values();
		System.out.println(empNames);
		System.out.println(empList.get(76));
		
		
		System.out.println("+++++++++++++++++++++++++++++");
		TreeSet<Integer> marksList11 = new TreeSet<Integer>();
		marksList11.add(76);
		marksList11.add(77);
		marksList11.add(66);
		marksList11.add(66);
		System.out.println(marksList11);
		System.out.println(marksList11.size());
		System.out.println(marksList11.remove(66));
		System.out.println(marksList11);
		boolean result111 = marksList11.contains(66);
		System.out.println(result111);
		
		Vector<Integer> dataList = new Vector<Integer>();
		dataList.add(176);
		dataList.add(175);
		dataList.add(173);
		dataList.add(178);
		System.out.println(dataList);
		System.out.println(dataList.size());
		System.out.println(dataList.get(1));
		System.out.println(dataList.remove(1));
		System.out.println(dataList);
		boolean result123 = dataList.contains(66);
		System.out.println(result123);
		System.out.println("Vector Data using Enumeration");
		Enumeration<Integer> e = dataList.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Vector Data using Iterator");
		Iterator<Integer> itr = dataList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Vector Data using List Iterator");
		ListIterator<Integer> litr = dataList.listIterator();
			while(litr.hasNext()) {
			System.out.println(litr.next());
		}
			System.out.println("Vector Data using List Iterator in backward direction");
			while(litr.hasPrevious()) {
				System.out.println(litr.previous());
			}
				
			Collections.sort(dataList);
			System.out.println("sorted vector data = " + dataList);
	}

}
