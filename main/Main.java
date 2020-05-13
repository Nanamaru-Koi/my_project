package main;
import sub.Sub;

public class Main{
	public static void main(String[] args ){
		System.out.println("Hello World!");
		Sub sub = new Sub("test",26);
		System.out.println(sub.getName());
		System.out.println(sub.getAge());
	}
}