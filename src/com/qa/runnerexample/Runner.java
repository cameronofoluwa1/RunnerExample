package com.qa.runnerexample;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Person list[] = new Person[5];
		
		list[0] = new Person("Cameron", "Ofoluwa", "Student");
		list[1] = new Person("James", "Rod", "Teacher");
		list[2] = new Person("Sarah", "Allan", "Doctor");
		list[3] = new Person("Becky", "Charles", "Chef");
		list[4] = new Person("Rod", "die", "rich");
		
		createPerson(list);
	}

	public static void printNames(Person[] listname) {
        for (Person i : listname)
            System.out.println(i);
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
	
	public static void createPerson(Person[] listname) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String fname = scan.nextLine();	
        System.out.println("Enter your last name : ");
        String lname = scan.nextLine();		
        System.out.println("Enter your job type : ");
        String job = scan.nextLine();
        listname = Arrays.copyOf(listname, listname.length + 1);
        listname[listname.length -1] = new Person(fname, lname, job);
        for (Person i : listname)
            System.out.println(i);
	}
}
