package main;
import sub.Sub;

public class Main{
	public static void main(String[] args ){
		System.out.println("Hello World!");
		Sub sub = new Sub("test",23);
		sub.test();
		System.out.println(sub.getName());
	}
}