package ArrayExam;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("hi1");
//		list.add("hi2");
//		list.add("hi3");
//		list.add("hi4");
//		list.add("hi5");
//		
//		System.out.println(list.size());
//		
//		System.out.println(list.get(0));
//		
//		list.remove(1);
//		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		//list.clear();
//		
//		list.set(0, "hh");
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		Student s1 = new Student();
		s1.name = "È«±æµ¿";
		s1.number = "2017";
		
		Student s2 = new Student();
		s2.name = "Àå°üÀå";
		s2.number = "2002";
		
		Student s3 = new Student();
		s3.name = "Á¤¾à¿ë";
		s3.number = "1998";
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println(list.get(0).name);
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).name.equals("È«±æµ¿")) {
				list.get(i).name = "°­»õÈû";
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
		}
	}

}
