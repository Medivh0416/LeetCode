package edu.uic.xuchu;

import java.util.*;
import java.util.Map.Entry;

public class SortHashMap {

	public static void main(String[] args) {
		User u1=new User();
		User u2=new User();
		User u3=new User();
		u1.setName("Jack");
		u1.setAge(22);
		
		u2.setName("Penny");
		u2.setAge(23);
		
		u3.setName("Rose");
		u3.setAge(17);
		
		HashMap<Integer, User> hashMap=new HashMap<Integer, User>();
		hashMap.put(2, u1);
		hashMap.put(4, u2);
		hashMap.put(1, u3);
		System.out.println(hashMap);
		HashMap sortedHashMap= sort(hashMap);
		System.out.println(sortedHashMap);
	}

	private static HashMap sort(HashMap<Integer, User> hashMap) {
		Set<Entry<Integer,User>> entrySet=hashMap.entrySet();
		ArrayList<Entry<Integer,User>> list=new ArrayList<Entry<Integer,User>>(entrySet);
		list.sort(new Comparator<Entry<Integer,User>>() {

			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				return o2.getValue().getAge()-o1.getValue().getAge();
			}
		});
		LinkedHashMap<Integer,User> linked=new LinkedHashMap<Integer, User>();
		for(Entry<Integer,User> e:list){
			linked.put(e.getKey(), e.getValue());
		}
		return linked;
	}
}
