
public class B01MethodOverloading {

	// 첫번째 메소드
	static void person(int juminNum) {
		System.out.println("주민번호 : "+juminNum);
		
	}
	
	// 두번째 메소드(첫번째 메소드 오버로딩)
	static void person(int juminNum, int gender) {
		System.out.println("주민번호 : " + juminNum);
		System.out.println("성별(남자:1,3 여자:2,4) :" +gender );
		
	}
	
	// 세번째 메소드(첫번째,두번째 메소드 오버로딩)
	static void person(int juminNum, String gender) {
		System.out.println("주민번호 : "+juminNum);
		System.out.println("성별(남자:M 여자:F) : "+gender);
	}
	
	public static void main(String[] args) {
		person(123456);
		person(987654,2);
		person(456123,"F");

	}

}
