package Tongue_Twister;

import java.util.ArrayList;
import java.util.Random;

public class TongueManager {
	private ArrayList<String> list = new ArrayList<String>();
	private Random rd = new Random();
	private int index;
	public final int count;
	
	public TongueManager() {
		this(3);
	}
	
	public TongueManager(int count) {
		this.count = count;
		list.add("경찰청 철창살이 쇠 철창살이냐 철 철창살이냐");
		list.add("저기 계신 저분이 박 법학박사이시고 여기 계신 이분이 백 법학박사이시다");
		list.add("우리 집 옆집 앞집 뒷창살은 흩겹창살이고,우리집 뒷집 앞집 옆창살은 겹흩창살이다");
		list.add("옆집 팥죽은 붉은 팥죽이고, 뒷집 콩죽은 검은 콩죽이다");
		list.add("서울특별시 특허허가과 허가과장 허과장");
		list.add("한국관광공사 곽진광 관광과장");
		list.add("대우 로얄 뉴 로얄");
		list.add("철수 책상 철 책상");
		list.add("저기 가는 저 상장사가 새 상 상장사냐 헌 상 상장사냐");
		list.add("작년에 온 솥장수는 새 솥장수이고, 금년에 온 솥장수는 헌 솥장수이다");
		list.add("저기 저 뜀틀이 내가 뛸 뜀틀인가 내가 안 뛸 뜀틀인가?");
		list.add("고려고 교복은 고급 교복이고 고려고 교복은 고급 원단을 사용했다");
		list.add("간장 공장 공장장은 장 공장장이고 된장 공장 공장장은 강 공장장이다");
		list.add("네가 그린 기린 그림은 못 그린 기린 그림이고 내가 그린 기린 그림은 잘 그린 기린 그림이다");
		list.add("The sixth sick sheikh's sixth sheep's sick");
	}

	private void makeRandom() {
		index = rd.nextInt(list.size());
	}
	
	public String getGameMSG() {
		makeRandom();
		return list.get(index);
	}

	public boolean check(String tongue) {
		return (list.get(index).equals(tongue));
	}
}
