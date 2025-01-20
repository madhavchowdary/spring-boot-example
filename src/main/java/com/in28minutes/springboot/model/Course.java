package com.in28minutes.springboot.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {
	
	String id;
    String name;
    String description;
    List<String> steps;
	
	public Course(String id,
            String name,
            String description,
            List<String> steps) {

}
	
}