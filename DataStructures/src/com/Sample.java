package com;

public class Sample {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder s1 = new StringBuilder("Java");
		 String s2 = "Love";
		 s1.append(s2);
		 s1.substring(4);
		 int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);
		
		Author writer = new Programmer();
		writer.write();

	}

}
abstract class Writer {
	 public  void write() {
	 System.out.println("Writing...");
	 }
	}
	class Author extends Writer {
	 public  void write() {
	 System.out.println("Writing book");
	 }
	 public  void write(int a) {
		 System.out.println("Writing book");
		 }
	}
	 class Programmer extends Author {
	 public  void write(int a ) {
	 System.out.println("Writing code");
	 }
	}
	 class SuperClass {
		 SuperClass(int x) {
		 System.out.println("Super");
		 }
		}
		 class SubClass extends SuperClass {
		 SubClass() {
		 super(10);
		 System.out.println("Sub 2");
		 }
		}

