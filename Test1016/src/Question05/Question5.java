package Question05;

public class Question5 {

	public static void main(String[] args) {
		int[] arr = {15, 40, 79, 26, 54};
		System.out.print("정렬 전 : ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int[] sort_Arr = sort(arr);
		System.out.print("정렬 후 : ");
		
		for (int i = 0; i < sort_Arr.length; i++) {
			System.out.print(sort_Arr[i] + " ");
		}
	}

	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

}
