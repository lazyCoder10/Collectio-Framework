package com.newtech.collectionframework;
import java.util.*;

public class LinkedHasMapDemo {
	
	
	LinkedHashMap<String,Employee> employee = new LinkedHashMap<>();
	
	
	public String addTolinkeddMap(String id,Employee emp){
		
		if(employee.put(id, emp) == null)
			return "Successfully Aded";
		else
			return "Error occoured!";
	}
	
	public void traverseLinkedHashMap(LinkedHashMap<String, Employee> empl){
		
		for(Map.Entry<String, Employee> entry : empl.entrySet()){
			System.out.println("Name = " + entry.getValue().getName() + ", Salary = " + entry.getValue().getSalary());
		}
	}
	
	public Employee findElementInLinkedHashMap(Employee emp){
		
		return employee.get(emp.getId());
		
	}
	
	public void deleteElementFromLinkedHashMap(Employee emp){
		employee.remove(emp.getId());
		System.out.println("element deleted successfully!");
		
	}
	

}
