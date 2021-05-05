package B01_B10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/*
HashMap<k,v>
	: Map<T> 인터페이스를 구현한 컬렉션 클래스
	- key, value의 쌍으로 객체를 저장한다.
	- 키값은 중복 불가. 중복될 경우 덮어쓰기됨
	- 키값으로 검색 => 속도 향상
	
*/
public class E08Collection_hashmap {

	public static void main(String[] args) {
		
		// Map 컬렉션 생성.
		HashMap<String, String> map = new HashMap<String, String>();
		
		/*
		[객체 저장]
			: 객체 저장시 기존에 저장된 동일한 key값이 존재하면
			이전에 저장된 객체가 반환된다. 만약 처음 입력이라면
			null값이 반환된다.
		 */
		System.out.println("name 이라는 키값으로 저장된 이전의 값 :"+
				map.put("name", "뽀로로"));
		
		int num = 20;
//		map.put("age", num); //=> 에러발생 : value 타입이 맞지않음
		map.put("age", String.valueOf(num));
		map.put("gender", "여자");
		
		// map에 저장된 객체수 반환
		System.out.println("저장된 객체수: "+map.size());
		
		/*
		[중복 저장]
			: 기존에 입력된 name 키값이 있으므로 "뽀로로"가 출력된다.
			그리고 기존의 값이 "에디"로 갱신된다.
		 */
		System.out.println("name이라는 키값으로 저장된 이전의 값 : "+
				map.put("name", "에디"));
		System.out.println("키값으로 중복 저장 후 객체수 :"+map.size());
		System.out.println("name이라는 키값으로 덮어쓰기된 뒤 값 : "+
				map.get("name"));
		
		/*
		[출력하기]
		1. 키값을 알고 있을 때
			: get(키값)으로 출력
		 */
		System.out.println("키값을 알 때 : "+map.get("name"));
		
		
		/*
		2. 키값을 모를 때
			: keySet() 메소드를 호출하여 키값을 Set컬렉션으로 얻어온다.
			해당 반환값을 확장 for문을 통해 추출한다.
			※ Map계열의 컬렉션은 처음부터 확장 for문을 사용하는 것이 불가능
			  => key값을 먼저 얻어온 뒤 사용해야한다.
		 */
		System.out.println("[확장 for문 이용]");
		// map 컬렉션의 key값을 keys로 얻어온다.
		Set<String> keys = map.keySet();
		// key값을 얻어온 keys 컬렉션에서 value값을 하나씩 추출한다.
		for (String key : keys) { // key값을 얻어서
			String value = map.get(key); // value값을 추출
			System.out.println(String.format("%s : %s",key, value));
		}
		
		/*
		3. 이터레이터를 통한 출력
			: 이터레이터를 통해 출력할때도 keySet()을 통해
			먼저 key값을 얻어온 뒤 반복한다.
		 */
		System.out.println("[이터레이터 사용]");
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(String.format("%s : %s",key, value));

		}
		
		/*
		value만 얻어와야 될때
			: values() 메소드 이용
		 */
		System.out.println("[value 값들만 출력]");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}
		
		/*
		존재 유무 확인(containsKey())
			: key 혹은 value가 존재할 경우 true가 반환된다.
		 */
		System.out.println(
				map.containsKey("name") ? "name키값 있음":"name키값 없음");
		System.out.println(
				map.containsValue("남자") ? "남자 value 있음":"남자 value 없음");
		System.out.println(
				map.containsValue("여자") ? "여자 value 있음":"여자 value 없음");
		
		
		/*
		삭제
			: key값을 통해 삭제하고, 삭제되면 해당 value가 반환된다.
		 */
		System.out.println("삭제된 객체 : "+map.remove("age"));
		System.out.println("[age키값을 삭제한 후 출력]");
		for (String key : keys) {
			System.out.println(String.format("%s : %s",key, map.get(key)));
		}
		
		/*
		[전체삭제]
			: clear()만 사용가능함.
			removeAll() 메소드는 없음.
		 */
		map.clear();
		System.out.println("전체삭제후 객체수 : "+map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
