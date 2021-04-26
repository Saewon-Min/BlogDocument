package B01_B10;

public class B02Array {

	public static void main(String[] args) {
		
		// 배열 선언
		// 1차원배열
		int[] num = new int[3];
		// 각 인덱스에 값을 저장
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		System.out.println("배열의 2번째 요소값 : "+num[1]);
		System.out.println("********************************************");
		
		// 배열 선언
		int[] arr = new int[10];
		// for문을 이용하여 arr배열을 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+10;
		}
		// for문을 이용하여 arr배열을 전체출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"번 인덱스의 값 : "+arr[i]);
		}
		System.out.println("********************************************");
		
		
		// 배열 초기화 방법
		// 방법1 : 배열 선언 후 초기화
		int[] initArr = new int[1];
		initArr[0] = 100;
		for (int i = 0; i < initArr.length; i++) {
			System.out.println("initArr["+i+"] :" + initArr[i]);
		}
		
		// 방법2 : 배열 선언과 동시에 초기화
		int[] initArr2 = new int[] {1,20,300}; 
		//int[] initArr2 = new int[3] {1,20,300}; => 에러발생 
		for (int i = 0; i < initArr2.length; i++) {
			System.out.println("initArr2["+i+"] :" + initArr2[i]);
		}
		
		
		// 방법3 : 배열을 초기값만으로 선언
		int[] initArr3 = {11,13,17,19,23};
		for (int i = 0; i < initArr3.length; i++) {
			System.out.println("initArr3["+i+"] :" + initArr3[i]);
		}
		
		
		System.out.println("*********************2차원배열***********************");
		
		// 2차원 배열
		// 배열을 초기값만으로 선언
		int[][] twoArr = {
				{1},
				{2,3},
				{4,5,6},
				{7,8,9,10}
		};
		
		System.out.println("배열 세로크기 : "+ twoArr.length);
		
		// 각 행의 크기가 다를 경우 출력 포맷
		for (int i = 0; i < twoArr.length; i++) {
			System.out.printf("%d행의 크기 : %d\n",i,twoArr[i].length);
		}
				
		// for문으로 2차원 배열 생성 및 출력
		// 선언 및 초기화
		int[][] twoFor = new int[3][4];
		for (int i = 0; i < 3; i++) { // 행
			for (int j = 0; j < 4; j++) { // 열
				twoFor[i][j] = i+j;
			}
		}
		// 출력
		for (int i = 0; i < twoFor.length; i++) { // 행
			for (int j = 0; j < twoFor[i].length; j++) { // 열
				System.out.print(twoFor[i][j] + " ");
			}
			// 출력 후 개행
			System.out.println();
		}		
			
	}

}
