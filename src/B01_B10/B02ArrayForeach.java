package B01_B10;

public class B02ArrayForeach {

	public static void main(String[] args) {
		
		// 위에서 진행했던 for문 => for-each문으로 향상시키기
		// 1차 배열
		// 선언 및 초기화
		int[] initArr3 = {11,13,17,19,23};
		
		for (int i : initArr3) {
			System.out.println(i);
		}

		// 2차 배열
		// 선언 및 초기화
		int[][] twoArr = {
				{1},
				{2,3},
				{4,5,6},
				{7,8,9,10}
		};
		
		// 출력
		for (int[] a : twoArr) { // 행
			for (int b : a) { // 열
				System.out.print(b + " ");
			}
			// 출력 후 개행
			System.out.println();
		}	
		
		

	}

}
