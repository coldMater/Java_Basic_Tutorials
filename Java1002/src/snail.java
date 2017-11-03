public class snail {
	// 달팽이배열
	public static void main(String[] args) {

		// [1] 준비
		int A[][] = new int[5][5]; // 1~5 사용
		int K = 0; // 출력할값을 담은 변수
		int N = 5; // 각 회전에서 수행할 수행횟수가 지정될 변수(5,4,3,2,1 로 변경됨)
		int SW = 1; // (+1)행과 열의 증가 , (-1)행과 열의 감소
		int I = 0, J = -1;

		// [2] 처리
		while (true) {
			for (int P = 0; P < N; P++) { // 시작은 1~5
				K = K + 1;
				J = J + SW; // 행고정 열변화
				A[I][J] = K;
			}
			N = N - 1;

			if (N == 0) {
				break;
			}

			for (int P = 0; P < N; P++) {
				K = K + 1;
				I = I + SW; // 열고정 행변화
				A[I][J] = K;
			}
			SW = SW * (-1); // 스위칭

		}

		// [3] 출력
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
