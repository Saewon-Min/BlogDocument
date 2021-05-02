package B01_B10;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

/*
HashSet 컬렉션
	Set 계열의 인터페이스를 구현한 컬렉션
	- 객체가 순서없이 저장됨
	- 객체의 중복저장은 기본적으로 허용하지 않음
		단, 기본클래스가 아닌 새롭게 정의한 클래스라면
		hashCode(), equals() 를 적절히 오버라이딩하여 정의해야한다.
	- Set은 집합의 성격을 가짐
 */
public class B06Collection_hashset {

	public static void main(String[] args) {

		// hashset 객체 생성
		HashSet<Object> set = new HashSet<Object>();
		
		String str1 = "옹성우";
		String str2 = "김선우";
		Date dateObj = new Date();
		int num = 100;
		
		Teacher teacher = new Teacher("송강",23,"체육");
		
		/*
		객체 저장
			add()메소드를 통해 저장되고 true 반환
		 */
		
		System.out.println(set.add(str1));
		set.add(str2);
		set.add(dateObj);
		set.add(num);
		set.add(teacher);
		
		System.out.println("[중복 저장 전 객체 수] : "+set.size()); // 4개
		
		/*
		기본 클래스형의 객체 중복 저장
			기본 클래스인 경우 별도의 오버라이딩 처리 없이 중복이 제거된다.
			따라서 아래의 경우 false가 반환됨
		 */
		System.out.println(set.add(str1) ? "저장성공":"저장실패");
		System.out.println("[중복 저장 후 객체 수] : "+set.size()); // 4개
		
		
		/*
		개발자가 직접 정의한 객체의 중복저장
			: 사용자 정의 클래스인 경우 hashCode, equals메소드를
			오버라이딩 하지 않으면 중복저장이 허용된다. 아래의 경우
			저장에 성공하여 true가 반환된다. 
		 */
		
		Teacher teacher2 = new Teacher("송강",23,"체육");
		System.out.println(set.add(teacher2) ? "중복저장성공":"중복저장실패");
		System.out.println("[(teacher2)중복 저장 후 객체 수] : "+set.size());
		
		
		
		
		/*
		저장된 객체 출력하기
			순서없이 저장되므로 출력의 순서도 지정할 수 없다.
		 */
		// 이터레이터 객체 생성
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			// Object 형으로 생성
			Object object = itr.next();
			
			// instanceof => 두 객체간 형변환 가능 여부에 따라 true, false값 반환
			
			if(object instanceof String) {
				System.out.println("String 타입:" + object);
			}
			else if(object instanceof Integer) {
				System.out.println("Integer타입:"+object);
			}
			else if(object instanceof Date) {
				System.out.println("Date타입:"+object);
			}
			else if(object instanceof Teacher){
				System.out.println("Teacher타입:"+object);
			}
			else {
				System.out.println("알수없음");
			}
			
		}
		
		
		// 객체의 존재 여부 확인
		System.out.println(set.contains(str1) ?"str1있음" :"str1없음" );
		
		// 객체 삭제
		System.out.println(set.remove(str1) ?"str1삭제성공" :"str1삭제실패");
		
		// 전체 삭제
		// 방법1
		set.clear();
		// 방법2
		set.removeAll(set);
		
		System.out.println("[전체 삭제 후 객체 수]:"+set.size());
		
	}

}
