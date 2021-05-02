package B01_B10;

import java.util.ArrayList;
import java.util.Iterator;

public class B05Collection_list {

	public static void main(String[] args) {

		/*
		list1처럼 타입매개변수 부분을 생략하거나 
		list2처럼 Object로 설정하면
		모든 객체를 저장할 수 있는 컬렉션을 정의할 수 있다.
		*/
		ArrayList list1 = new ArrayList();
		ArrayList<Object> list2 = new ArrayList<Object>();
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		/*
		객체저장 : add() 메소드
			* add(객체) 
				순차적으로 저장하면서 인덱스는 0부터 자동으로 부여됨
			* add(인덱스, 객체) 
				인덱스를 직접 부여하여 객체를 저장.
				단, 인덱스를 건너뛰면 예외가 발생한다.
			* size() 
				컬렉션에 저장된 객체의 개수를 반환한다.
				배열의 크기와 동일하다고 생각하면 됨.
				
		 */
		list.add("블랙핑크");
		list.add("BTS");
		list.add("itzy");
		list.add(3,"옹성우");
		//list.add(5,"최우식"); => 에러발생(인덱스를 건너뛸수 없다.)
		list.add(list.size(),"아이유");
		
		System.out.println("중복저장 전 객체 수 :"+list.size());  // 5
		
		
		/*
		중복저장
			List는 배열의 속성을 가짐 -> 데이터 중복 허용
			add()메소드는 추가에 성공한 경우 true값을 반환.
		 */
		//		list에 옹성우가 추가된다면 ? true일때반환값 : false일때 반환값
		System.out.println(list.add("옹성우") ? "중복저장됨":"중복저장안됨");  // 중복저장됨
		System.out.println("중복 저장 후 객체 수:"+list.size());  // 6
		
		
		/*
		리스트 컬렉션 출력하기
			일반 for문 / 확장 for문
			: 컬렉션을 다룰때는 주로 확장 for문을 사용한다.
		
			get(인덱스) : 인덱스에 해당하는 객체를 반환
		 */
		
		// 일반 for문
		// list의 사이즈만큼 반복하여 list의 i번째 값을 반환한다.
		System.out.println("[일반 for문]");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+" ");
		}
		System.out.println();
		
		// 확장 for문
		// list에 들어있는 String 객체를 하나씩 반환하여 출력한다.
		System.out.println("[확장 for문]");
		for (String st : list) {
			System.out.println(st + " ");
		}
		System.out.println();
		/*
		Iterator 사용법
		1. 컬렉션에 저장된 내용을 Iterator에 알려주기 위해 객체를 생성함
		2. hasNext()로 반환할 객체가 있는지 검사하고, next()로 해당 객체를 반환한다.
		3. 모든 객체가 반환되었다면 false를 반환한다.
		 */
		System.out.println("[Iterator 사용]");
		Iterator itr = list.iterator();
		// itr에 다음 객체가 있다면 계속 반환한다.
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		System.out.println();
		
		
		/*
		덮어쓰기 : set(인덱스, 객체)
			기존의 내용을 변경한다.
			기존의 내용은 삭제된다.
		 */
		// 인덱스 5번의 내용을 변경
		list.set(5, "김선우");
		// 확장 for문을 이용해 전체 출력
		// Object는 최상위 객체이므로 String값도 출력이 가능하다.
		System.out.println("[변경 후 출력]");
		for (Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println();
		
		/*
		끼워넣기(삽입하기)
			add(삽입할 인덱스, 객체)
				: 새로운 객체가 해당 인덱스에 삽입되고
				기존의 객체는 자동으로 뒤로 밀리게된다.
		*/
		list.add(3, "엔하이픈");
		System.out.println("[기존 값 사이에 새로운 값 끼워넣기]");
		for (Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println();
		
		
		/*
		포함여부확인 : contains(객체)
			찾고자 하는 객체가 있는 경우 true를 반환한다.
			위치한 인덱스까지는 확인할 수 없다.
		
		 */
		System.out.println(list.contains("김선우") ? "김선우 있음":"김선우 없음");
		System.out.println(list.contains("박성훈") ? "박성훈 있음":"박성훈 없음");
		
		
		/*
		삭제
			방법1 : 인덱스로 삭제
			remove(인덱스)
				인덱스를 통해서 삭제를 진행한 후 완료되면 해당 객체를 반환한다.
				삭제 후에는 인덱스가 자동으로 재부여 된다.
				어떤 객체가 삭제 되었는지 확인이 가능하다.
		 */
		Object obj = list.remove(2);
		System.out.println("삭제된 객체 : "+obj);
		
		/*
		방법2 : indexOf()를 통해 인덱스를 찾은 후 삭제
		 */
		int index = list.indexOf("블랙핑크");
		System.out.println("블랙핑크의 인덱스 : "+index);;
		list.remove(index);
		
		/*
		방법3 : 인스턴스의 참조값을 통해 삭제
		 */
		System.out.println(list.remove("BTS") ? "삭제성공":"삭제실패");
		
		System.out.println("[삭제 후 출력]");
		
		for (Object ob : list) {
			System.out.println(ob+" ");
		}
		System.out.println();
		
		// 전체 삭제
		// 방법1
		list.removeAll(list);
		// 방법2
		list.clear();
		
		
		
	}

}
