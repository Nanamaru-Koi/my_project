package main;
import sub.Sub;

public class Main{
	public static void main(String[] args ){
		System.out.println("Hello World!");
		Sub sub = new Sub("test");
		sub.test();
		sub.test2();
		sub.test3();
		System.out.println(sub.getName());
	}
}