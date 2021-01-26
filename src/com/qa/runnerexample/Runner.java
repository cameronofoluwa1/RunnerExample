package com.qa.runnerexample;

public class Runner {

	public static void main(String[] args) {
		Person list[] = new Person[5];
		
		list[0] = new Person("Cameron", "Ofoluwa", "Student");
		list[1] = new Person("James", "Rod", "Teacher");
		list[2] = new Person("Sarah", "Allan", "Doctor");
		list[3] = new Person("Becky", "Charles", "Chef");
		list[4] = new Person("Bob", "Smith", "Driver");
		
		findUser(list, "Cameron");
	}

	public static void printNames(Person[] listname) {
		for(int i = 0; i < listname.length; i++) {
			System.out.println("INDEX = " + i + " " + listname[i].toString());
		}
	}

	public static void findUser(Person[] listname, String username) {
		for(int i = 0; i < listname.length; i++) {
			if(listname[i].getFName() == username) {
				System.out.println("INDEX = " + i + ", " + listname[i].toString());
			}else {
				System.out.println("Cannot find that user");
			}
		}
	}
}
