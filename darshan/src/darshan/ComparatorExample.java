package darshan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,34));
		list.add(new Student(2,65));
		list.add(new Student(3,93));
		list.add(new Student(4,89));
		list.add(new Student(5,27));
		
		//Collections.sort(list,(s1,s2)->{return s1.marks<s2.marks?1:-1;});
		Collections.sort(list);
		
		//list.forEach(System.out::println);
		
		Map<String, String> map=new HashMap<>();
		map.put("name", "darshan");
		map.put("school", "aps");
		map.put("college", "bias");
		
		Set<String> key=map.keySet();
		for(String k:key)
			System.out.println(map.get(k));
		//key.forEach(System.out.println(map.get(key)));
		//System.out.println(map.get("school"));
		
		

	}

}
