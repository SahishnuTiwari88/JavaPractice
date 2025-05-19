package com.basics.wrapper;

enum Dept{
	IT,CS,ECE,CIVIL;
	private Dept() {
		System.out.println(this.name());
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		Dept d = Dept.ECE;
//		
//		switch(d) 
//		{
//		case IT:System.out.println("Head : Ram\n Block : A");
//		break;
//		case CS:System.out.println("Head : Laxman\n Block : B");
//		break;
//		case ECE:System.out.println("Head : Sarvesh\n Block : C");
//		break;
//		case CIVIL:System.out.println("Head : Luthor\n Block : D");
//		break;
//		
//		}
//		
//		System.out.println(Dept.valueOf("ECE"));
//		System.out.println(d.ordinal());

	}

}
