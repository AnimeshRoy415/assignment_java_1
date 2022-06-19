package com.q1.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Student> hashMap = new HashMap<>();
		
		hashMap.put("W.B", new Student(01,"Anni", 692));
		hashMap.put("Odisha", new Student(04,"sanny", 570));
		hashMap.put("Asam", new Student(05,"Ram", 558));
		hashMap.put("Bihar", new Student(02,"sam", 590));
		hashMap.put("Sikim", new Student(03,"Jadu", 579));
		hashMap.put("Tripura", new Student(06,"Madhu", 510));
		
	
		
		Set<Map.Entry<String, Student>>  students= hashMap.entrySet();
		
		Set<Map.Entry<String, Student>> treestudent= new TreeSet<>(new MarkComparator());
		
		for(Map.Entry<String, Student> steMap: students ) {
			
			treestudent.add(steMap);
		}
		
		
		
		for(Map.Entry<String, Student> s: treestudent) {
			
			System.out.println(s.getKey()+ " ------> "+ s.getValue());
		}
		

	}

}
