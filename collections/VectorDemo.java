package collections;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		Collections.addAll(v, 10, 20, 30, 40, 50);
		System.out.println(v);
		System.out.println();
		
		for(int i = 0; i <= v.size()-1; i++) {
			System.out.println(v.get(i));
		}
		System.out.println();
		
		Iterator itr = v.iterator();
		while(itr.hasNext() == true) {
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println(v.size());
		ListIterator litr = v.listIterator(5);
		while(litr.hasPrevious() == true) {
			System.out.println(litr.previous());
		}

	}

}
