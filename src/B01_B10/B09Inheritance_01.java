package B01_B10;

// 부모클래스
class Man{
	/*
	멤버변수가 상속관계에 있다 하더라도 private으로 선언되면
	클래스 내부에서만 접근가능하다. 즉, 상속받은 하위클래스에서는
	직접 접근이 불가능하다.
	 */
	private String name;
	
	// 생성자는 오버로딩하여 정의함
	// 기본 생성자
	public Man() {
		System.out.println("Man클래스 디폴트 생성자 호출됨");
	}
	
	// 매개변수가 있는 생성자
	public Man(String name) {
		this.name = name;
		System.out.println("Man클래스 인자 생성자 호출됨");
	}
	
	// 멤버메소드 정의
	public void tellYourName() {
		System.out.println("Man클래스");
		System.out.println("내 이름은 "+name+"입니다.");
		
	}
	
	
}

// 자식클래스
class BusinessMan extends Man{
	private String company;
	private String position;
	
	/*
	상속받은 자식 클래스는 부모 클래스의 생성자를 호출하여 부모객체가
	먼저 생성되도록 해야한다.
	super()는 부모 클래스의 생성자를 호출하는 역할을 하게 되며
	만약 super()를 기술하지 않으면 디폴트(기본)생성자가 호출된다.
	*/
	
	public BusinessMan(String name,String company, String position) {
		super(name); // String 매개변수를 1개 갖는 생성자를 호출한다.
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");
	}
	
	public void tellYourInfo() {
		System.out.println("회사명 : "+company+"입니다.");
		System.out.println("직급 : "+position+"입니다.");
		
		// 부모클래스에 정의되어있는 멤버메소드 호출. 상속 받았으므로 호출 가능
		System.out.println("BusinessMan클래스");
		tellYourName();
		
		
	}
	
	
	
	
}



public class B09Inheritance_01 {

	public static void main(String[] args) {

		/*
		자식 클래스를 통해 객체를 생성하지만, 실행 결과에는 부모클래스의 생성자가
		먼저 호출된다. 항상 부모객체가 먼저 생성된 후 자식객체가 생성된다.
		 */
		BusinessMan man1 = new BusinessMan("김선우", "엔하이픈", "멤버");
		
		// BusinessMan에서 정의된 메소드 호출
		man1.tellYourInfo();
		// Man에서 정의된 메소드를 BusinessMan을 통해 호출
		man1.tellYourName();
		
		
	}

}
