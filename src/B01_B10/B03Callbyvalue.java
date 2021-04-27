package B01_B10;

public class B03Callbyvalue {

	
	// 정의한 메소드
	public static void callByValue(int fNum, int sNum) {
		int temp;
		
		// swap(스왑)을 진행
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		
		System.out.println("callByValue 메소드 내부 :"+
					"first : "+fNum +" second : "+sNum);
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		int first = 100, second = 200;
		
		System.out.println("main메소드 내부 - 호출 전 :"+
				"first : "+first +" second : "+second);
		
		callByValue(first, second);
		
		System.out.println("main메소드 내부 - 호출 후"+
				"first : "+first +" second : "+second);

	}

}
