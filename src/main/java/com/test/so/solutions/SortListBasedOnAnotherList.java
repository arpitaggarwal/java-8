package com.test.so.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortListBasedOnAnotherList {

	public static void main(String[] args) {

		List<DatabaseObject> databaseObjectList = getDatabaseObjectList();

		Comparator<DatabaseObject> cmp = Comparator.comparing(
				DatabaseObject::getOrder).thenComparing(
				DatabaseObject::getSuborder);
		Collections.sort(databaseObjectList, cmp);
		
		List<ServiceObject> serviceObjectList = getServiceObjectList();
		
		System.out.println(sort(serviceObjectList, databaseObjectList));
		
		System.out.println("Final List \n" + getSortedList(serviceObjectList, databaseObjectList));
	}

	public static List<ServiceObject> sort(final List<ServiceObject> serviceObjectList, final List<DatabaseObject> databaseObjectList) {
        
		final Map<String, List<ServiceObject>> map = databaseObjectList.stream().collect(Collectors.toMap(i->i.getName(), i-> new ArrayList<>()));
        
	    /* for (ServiceObject serviceObject : serviceObjectList) {
        List<ServiceObject> value = map.get(serviceObject.getValue());
        if (value != null)
        	value.add(serviceObject);
        }*/
	    
        serviceObjectList.stream().map(e-> {
	    	List<ServiceObject> value = map.get(e.getValue());
	    	 if (value != null){
	    		 value.add(e);
	    	 }
	    	return e;
	    }).collect(Collectors.toList());
        
        serviceObjectList.clear();
        
	    for (DatabaseObject string : databaseObjectList)
	        for (ServiceObject obj : map.get(string.getName()))
	        	serviceObjectList.add(obj);
	    
	    return serviceObjectList;
	    
	   /* List<ServiceObject> list = databaseObjectList.stream()
                .flatMap(p -> map.get(p.getName()).stream())
                .map(e-> e)
                .collect(Collectors.toList());
	    
	    System.out.println(list);*/
	}
	
	public static List<ServiceObject> getSortedList(final List<ServiceObject> serviceObjectList, final List<DatabaseObject> databaseObjectList) {
       final Map<String, List<ServiceObject>> map = databaseObjectList.stream().collect(Collectors.toMap(i-> i.getName(), i-> new ArrayList<>()));
       serviceObjectList.stream().map(e-> map.get(e.getValue()).add(e)).collect(Collectors.toList());
	   return databaseObjectList.stream().flatMap(i -> map.get(i.getName()).stream()).map(e-> e).collect(Collectors.toList());
	}

	
	private static List<DatabaseObject> getDatabaseObjectList() {
		final List<DatabaseObject> databaseObjectList = new ArrayList<>();
		DatabaseObject obj1 = new DatabaseObject();
		obj1.setName("GBDF");
		obj1.setOrder(2);
		obj1.setSuborder(4);

		DatabaseObject obj2 = new DatabaseObject();
		obj2.setName("AVHL");
		obj2.setOrder(2);
		obj2.setSuborder(3);

		DatabaseObject obj3 = new DatabaseObject();
		obj3.setName("KGHV");
		obj3.setOrder(1);
		obj3.setSuborder(4);

		DatabaseObject obj4 = new DatabaseObject();
		obj4.setName("QOPI");
		obj4.setOrder(2);
		obj4.setSuborder(2);

		DatabaseObject obj5 = new DatabaseObject();
		obj5.setName("AAKL");
		obj5.setOrder(1);
		obj5.setSuborder(1);

		databaseObjectList.add(obj1);
		databaseObjectList.add(obj2);
		databaseObjectList.add(obj3);
		databaseObjectList.add(obj4);
		databaseObjectList.add(obj5);
		return databaseObjectList;
	}
	
	private static List<ServiceObject> getServiceObjectList() {
		final List<ServiceObject> serviceObjectList = new ArrayList<>();
		ServiceObject obj1 = new ServiceObject();
		obj1.setKey("1");
		obj1.setValue("GBDF");
		
		ServiceObject obj2 = new ServiceObject();
		obj2.setKey("1");
		obj2.setValue("QOPI");

		ServiceObject obj3 = new ServiceObject();
		obj3.setKey("1");
		obj3.setValue("AAKL");

		serviceObjectList.add(obj1);
		serviceObjectList.add(obj2);
		serviceObjectList.add(obj3);

		return serviceObjectList;
	}

}

class ServiceObject {
	private String key;
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ServiceObject [key=" + key + ", value=" + value + "]";
	}
}

class DatabaseObject {

	private String name;
	private int order;
	private int suborder;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getSuborder() {
		return suborder;
	}

	public void setSuborder(int suborder) {
		this.suborder = suborder;
	}

	@Override
	public String toString() {
		return "DatabaseObject [name=" + name + ", order=" + order
				+ ", suborder=" + suborder + "]";
	}

}