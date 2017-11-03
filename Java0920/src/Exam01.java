import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//추가 add
		list.add("hello");
		list.add("hello2");
		list.add("hello3");
		list.add("hello4");
		
		//출력 get
		String str = list.get(3);
		System.out.println(str);
		
		//길이 size(배열에서 length)
		int size = list.size();
		System.out.println(size);
		
		//삭제 remove
		list.remove(1);
		System.out.println(list.size());
		
		//수정 set
		list.set(0, "apple");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//전체 삭제 clear
		list.clear();
		
		System.out.println(list.size());
	}

}
