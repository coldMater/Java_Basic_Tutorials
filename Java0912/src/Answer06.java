
public class Answer06 {

	public static void main(String[] args) {
		String[] countyNames = {"한국", "미국", "일본", "중국", "캐나다"};
		int[][] medals = {{7,8,2},{9,11,13},{7,5,7},{8,9,18},{9,2,10}};
		int[] rank = new int[countyNames.length];
		
		for(int i = 0; i < countyNames.length; i++) {
			int rankScope = 4;
			for (int j = 0; j < medals[i].length; j++) {
				rank[i] += medals[i][j] * rankScope;
				rankScope /= 2;
			}
		}
		
		for (int i = 0; i < rank.length - 1; i++) {
			for (int j = i + 1; j < rank.length; j++) {
				if(rank[i] < rank[j]) {
					int tmp = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp;
					
					String nameTmp = countyNames[i];
					countyNames[i] = countyNames[j];
					countyNames[j] = nameTmp;
				}
			}
		}
		
		System.out.println("메달 순위");
		for (int i = 0; i < countyNames.length; i++) {
			System.out.println((i + 1) + "위 : " + countyNames[i]);
		}
	}

}
