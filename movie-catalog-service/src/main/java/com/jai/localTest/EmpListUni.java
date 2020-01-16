package com.jai.localTest;

import java.util.ArrayList;
import java.util.List;

public class EmpListUni {

	public static void main(String[] args) {
		List list = new ArrayList<Employee>();
		Employee e1 =new Employee("455", "JAI", 123);
		list.add(e1);
		Employee e2 =new Employee("112", "JAIC", 214);
		list.add(e2);
		Employee e3 =new Employee("455", "JAI", 123);
		list.add(e3);
		Employee e4 =new Employee("875", "IAJ", 321);
		list.add(e4);
		Employee e5 =new Employee("888", "SIKK", 888);
		list.add(e5);
		list.add(e4);
		list.add(e4);
		
		System.out.println(e1.equals(e3));
		
		System.out.println(list.size());
		
		System.out.println(list);
	}

}
