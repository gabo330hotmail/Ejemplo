/**
 * 
 */
package com.akc.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author juan.ortega
 *
 */
public class Person {
    
	@NotNull
	@Size(min=2,max=6)
	private String name;
	
	@NotNull
	@Min(18)
	private String age;
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * constructor vacio
	 */
	public Person() {
	
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
