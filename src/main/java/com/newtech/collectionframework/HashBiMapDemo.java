package com.newtech.collectionframework;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.common.collect.HashBiMap;
import com.newtech.collectionframework.Employee;;
public class HashBiMapDemo {
	
	HashBiMap<String, Employee> employee = HashBiMap.create();
	
	
	public String addToHashBiMap(String id,Employee emp){
		
		if(employee.put(id, emp) == null)
			return "Successfully Aded";
		else
			return "Error occoured!";
	}
	
	public void traverseHashBiMap(LinkedHashMap<String, Employee> empl){
		
		for(Map.Entry<String, Employee> entry : empl.entrySet()){
			System.out.println("Name = " + entry.getValue().getName() + ", Salary = " + entry.getValue().getSalary());
		}
	}
	
	public Employee findElementInHashBiMap(Employee emp){
		
		return employee.get(emp.getId());
		
	}
	
	public void deleteElementFromHashBiMap(Employee emp){
		employee.remove(emp.getId());
		System.out.println("element deleted successfully!");
		
	}
    

	
	
	

}
