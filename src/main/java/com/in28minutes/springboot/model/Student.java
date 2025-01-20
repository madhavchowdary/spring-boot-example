package com.in28minutes.springboot.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
	
	String id;
    String name;
    String description;
    List<Course> courses;
	
	public Student(String id,
            String name,
            String description,
            List<Course> courses) {

}	
}