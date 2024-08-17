package com.kiran.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetdemoExamle {

	private static void hasSet() {
		Set<Book> set1 = new TreeSet<>(new PubDateDscComparator());
		Book book1 = new Book(201, "Wings of will", 2004);
		Book book2 = new Book(201, "Wings of Fire", 2004);
		Book book3 = new Book(203, "Atomic Habits", 2018);
		Book book4 = new Book(202, "Harry Potter", 2021);
		Book book5 = new Book(204, "Effective java", 2023);
		set1.add(book1);
		set1.add(book2);
		set1.add(book3);
		set1.add(book4);
		set1.add(book5);

		for (Book books : set1) {
			System.out.print("Book" + books);
		}
	}

	public static void main(String[] args) {
		hasSet();
	}
}

class Book /* implements Comparable */ {
	private int id;
	private String name;
	private int year;

	public Book(int id, String name, int year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", year=" + year + "]" + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return name == other.name;
	}

	/*
	 * @Override public int compareTo(Object book) { return
	 * getName().compareTo(((Book) book).getName()); }
	 */

}

class TitleComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Book) o1).getName().compareTo(((Book) o2).getName());
	}

}

class PubDateAScComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
       if(((Book)o1).getYear()==((Book)o2).getYear()) {
		return ((Book)o1).getName().compareTo(((Book)o2).getName());
	}
       else if (((Book)o1).getYear()<((Book)o2).getYear()){
    	   return  -1;
       }
       else {
    	   return 1;
       }

}}

class PubDateDscComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
       if(((Book)o1).getYear()==((Book)o2).getYear()) {
		return ((Book)o1).getName().compareTo(((Book)o2).getName());
	}
       else if (((Book)o1).getYear()<((Book)o2).getYear()){
    	   return  1;
       }
       else {
    	   return -1;
       }

}}

