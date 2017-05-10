package com.newtech.collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	// TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
	//It contains only unique elements.
	//It cannot have null key but can have multiple null values.
	//It is same as HashMap instead maintains ascending order. 
	
	public TreeMap<String, Employee> empoloyee = new TreeMap<String, Employee>();
	
	public void addToTreeMap(String id, Employee emp){
		
		if(empoloyee.put(id, emp) == null){
			System.out.println("Successfully added!");
		}
		else
			System.out.println("Insertion error");
		
	}
	
	public void traverseTreeMap(TreeMap<String, Employee> empl){
		
		for(Map.Entry<String, Employee> emp: empl.entrySet()){
			System.out.println("Name: "+ emp.getValue().getName() +"Salary: "+ emp.getValue().getSalary());
		}
	}
	
	public Employee findElementInTreeMap(Employee emp){
		
		return empoloyee.get(emp.getId());
	}
	
	public TreeMap<String, Employee> deleteElementFromTreeMap(Employee emp){
		
		empoloyee.remove(emp.getId());
		return empoloyee;		
	}
	

}
