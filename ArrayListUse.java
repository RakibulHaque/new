import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUse {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<>();

		System.out.println("size: " + number.size());

		number.add(10);
		number.add(20);
		number.add(2, 30);
		number.add(40);

		/*
		 * Iterator itr = number.iterator();
		 * 
		 * while(itr.hasNext()) { System.out.println("array:"+itr.next()); }
		 */

		for (int i : number) {
			System.out.println("value" + i);
		}

		// System.out.println(number);
		System.out.println(number.size());

	}

}
