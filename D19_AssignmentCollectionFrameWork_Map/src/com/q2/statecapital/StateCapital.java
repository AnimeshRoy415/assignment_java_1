package com.q2.statecapital;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StateCapital {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, String> stateCapital= new LinkedHashMap<String, String>();
		
		stateCapital.put("WB", "Koltala");
		stateCapital.put("Odisha", "Bhubaneswar");
		stateCapital.put("Bihar", "Patne");
		stateCapital.put("Jharkhand", "Ranchi");
		stateCapital.put("UP", "Lucknow");
		
		
		Set<Entry<String, String>> statesCapitals= stateCapital.entrySet();
		
		for(Map.Entry<String, String> city: statesCapitals) {
			
			System.out.println(city.getKey()+"====="+ city.getValue());
			
		}
		
		
	}

}
