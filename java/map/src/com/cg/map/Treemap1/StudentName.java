package com.cg.map.Treemap1;

import java.util.Comparator;


public abstract class StudentName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}

	
	
	
	


}