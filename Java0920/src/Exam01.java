import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//�߰� add
		list.add("hello");
		list.add("hello2");
		list.add("hello3");
		list.add("hello4");
		
		//��� get
		String str = list.get(3);
		System.out.println(str);
		
		//���� size(�迭���� length)
		int size = list.size();
		System.out.println(size);
		
		//���� remove
		list.remove(1);
		System.out.println(list.size());
		
		//���� set
		list.set(0, "apple");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//��ü ���� clear
		list.clear();
		
		System.out.println(list.size());
	}

}
