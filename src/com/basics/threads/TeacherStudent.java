package com.basics.threads;

class WhiteBoard {
	String text;
	int noStudent = 0;
	int count = 0;

	synchronized public void write(String msg) {
		System.out.println("Teacher writes "+msg);
		while(count != 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.text = msg;
		count = noStudent;
		notifyAll();
	}

	synchronized public String read() {
		while(count == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String result = text;
		count--;
		if(count == 0) {
			notify();
		}
		return result;
	}

	public void attandance() {
		noStudent++;
	}
}

class Teacher extends Thread {
	WhiteBoard wht;
	String str[] = { "Java is a language", "It is OOPs", "It supports Multithreading", "end" };

	public Teacher(WhiteBoard wht) {
		this.wht = wht;
	}

	public void run() {
		for (int i = 0; i < str.length; i++) {
			wht.write(str[i]);
		}
	}
}

class Student extends Thread {
	WhiteBoard wht;
	String name;

	public Student(WhiteBoard wht, String name) {
		this.wht = wht;
		this.name = name;
	}

	public void run() {
		String out;
		wht.attandance();
	do {
		out = wht.read();
		System.out.println(name+ " Reading "+out);
		System.out.flush();
		
	}while(out != "end");
	
}
}

public class TeacherStudent {

	public static void main(String[] args) {
		WhiteBoard wb = new WhiteBoard();
		Teacher t = new Teacher(wb);
		Student s1 = new Student(wb, "1. Sarvesh");
		Student s2 = new Student(wb, "2. Sahishnu");
		Student s3 = new Student(wb, "3. Sarang");
		Student s4 = new Student(wb, "4. Satranj");
		t.start();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}

}
