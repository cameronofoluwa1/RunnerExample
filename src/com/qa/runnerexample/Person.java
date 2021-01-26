package com.qa.runnerexample;

public class Person {
	
	String fname;
	String lname;
	String job;
	
	public Person(String fname, String lname, String job) {
		this.fname = fname;
		this.lname = lname;
		this.job = job;
	}
	
	public void setFName(String fname){ this.fname = fname; }
	public String getFName() {return this.fname;	}
	
	public void setLName(String lname){ this.lname = lname; }
	public String getLName() {return this.lname;	}
	
	public void setJob(String job){ this.job = job; }
	public String getJob() {return this.job;	}
	
	public String toString() {
		String toString = "First name: " + getFName() + "\nLast name: " + getLName() + "\nJob name: " + getJob();
		return toString;
	}
	/// Test
}
