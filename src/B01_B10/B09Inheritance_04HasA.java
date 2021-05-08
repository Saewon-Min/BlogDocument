package B01_B10;

// 총을 표현한 클래스
class Gun{
	// 총알을 표현한 멤버변수
	int bullet;
	
	public Gun(int bNum) {
		bullet = bNum;
	}
	
	public void shutGun() {
		System.out.println("총을 쏨");
		bullet--; // 총알이 감소됨
	}
	
}


// 경찰을 표현한 클래스
class Police{
	// 수갑을 표현한 멤버변수
	int handCuffs;
	// 보유한 권총을 나타내는 Gun객체
	Gun gun;
	
	public Police(int bNum, int hCuff) {
		handCuffs = hCuff;
		
		/*
		권총 보유 여부 초기화
			: 만약 총알이 없는 상태라면 보유한 권총이 없는 것으로
			표현하기 위해 멤버변수는 null로 초기화한다.
			참조변수가 null 값이란 것은 참조할 객체가 없다는 의미이다
			즉, heap영역에 생성된 객체가 없는 것을 의미한다.
		 */
		
		if (bNum<=0) {
			gun = null;
		}else {
			gun = new Gun(bNum);
		}
		
	}	

	// 수갑을 채우는 행위를 표현한 메소드
	public void putHandcuff() {
		
		System.out.println("수갑채움");
		handCuffs--;
		
	}
	
	// 경찰이 권총을 발사하는 행위를 표현한 메소드
	public void shut() {
		if(gun==null) {
			// 경찰이 권총을 보유하지 않았다면 발사할 수 없음
			System.out.println("보유한 권총 없음");
		}else {
			// Gun클래스의 멤버메소드를 호출
			gun.shutGun();
		}
		
	}
}



public class B09Inheritance_04HasA {

	public static void main(String[] args) {
		
		// 권총을 보유한 경찰을 표현
		System.out.println("===경찰1(권총보유)==");
		Police police1 = new Police(5, 3);
		police1.shut();
		police1.putHandcuff();
		
		
		// 권총을 보유하지 못한 경찰을 표현
		System.out.println("===경찰2(권총보유X)==");
		Police police2 = new Police(0, 3);
		police2.shut(); // 총알을 발사할 수 없음
		police2.putHandcuff();
		
		

	}

}
