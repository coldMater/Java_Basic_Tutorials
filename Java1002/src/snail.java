public class snail {
	// �����̹迭
	public static void main(String[] args) {

		// [1] �غ�
		int A[][] = new int[5][5]; // 1~5 ���
		int K = 0; // ����Ұ��� ���� ����
		int N = 5; // �� ȸ������ ������ ����Ƚ���� ������ ����(5,4,3,2,1 �� �����)
		int SW = 1; // (+1)��� ���� ���� , (-1)��� ���� ����
		int I = 0, J = -1;

		// [2] ó��
		while (true) {
			for (int P = 0; P < N; P++) { // ������ 1~5
				K = K + 1;
				J = J + SW; // ����� ����ȭ
				A[I][J] = K;
			}
			N = N - 1;

			if (N == 0) {
				break;
			}

			for (int P = 0; P < N; P++) {
				K = K + 1;
				I = I + SW; // ������ �ຯȭ
				A[I][J] = K;
			}
			SW = SW * (-1); // ����Ī

		}

		// [3] ���
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
