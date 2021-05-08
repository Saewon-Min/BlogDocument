package B01_B10;

public class B04callByReference {

	static void callByReference(int[] ref) {
		int temp;
		// swap 진행
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
	}
	
	public static void main(String[] args) {
		// 배열 초기화
		int[] arr = {100,200};
		
		System.out.println("메인메소드 - swap 전 출력");
		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		// 메소드 호출
		callByReference(arr);
		
		System.out.println("메인메소드 - swap 전 출력");
		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		
		
	}

}
