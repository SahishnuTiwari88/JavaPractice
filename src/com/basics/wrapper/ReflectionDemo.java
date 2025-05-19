package com.basics.wrapper;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My{
	private int x;
	public float b;
	protected String c;
	double d;
	
	public My() {}
	public My(int a,float b) {}
	
	public void display(int a,int b) {}
	public String name() {
		return c;
		
	}
}

public class ReflectionDemo {

	public static void main(String[] args) {
		Class c = My.class;
		System.out.println(c.getName());
		System.out.println(c.getPackageName());
		
//		Field[] fields = c.getDeclaredFields();
//		for(Field f:fields) {
//			System.out.println(f);
//		}
//		
//		Constructor[] constructors = c.getConstructors();
//		for(Constructor ct:constructors) {
//			System.out.println(ct);
//		}
//		
		Method[] methods = c.getMethods();
//		for(Method me:methods) {
//			System.out.println(me);
//		}
		
		Parameter[] parameters = methods[0].getParameters();
		for(Parameter par:parameters) {
			System.out.println(par);
		}
		
	}

}
