package B01_B10;

import java.util.HashSet;

import common.Person;

// 이거는 블로그에 안올림
public class B07Collection_hashset2 {

	public static void main(String[] args) {

		HashSet<Person> set = new HashSet<Person>();
		
		Person p1 = new Person("문빈", 1);
		Person p2 = new Person("문빈", 2);
		Person p3 = new Person("문빈", 1);
		
		set.add(p1);
		set.add(p2);
		
		boolean b = set.add(p3);
		System.out.println("p3 객체 저장 여부 :"+b);
		System.out.println("HashSet에 저장된 객체수 :"+set.size());
		
		
	}

}
