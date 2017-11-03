
public class Exam08 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = new int[3][3];
		
		System.out.println("변경 전");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr2[j][i] = arr[2-i][j];
			}
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			int k = 0;
//			for (int j = 2; j >= 0 ; j--) {
//				arr2[i][k] = arr[j][i];
//				k++;
//			}
//		}
		
		System.out.println("변경 후 ");
		for(int i=0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
	}

}
