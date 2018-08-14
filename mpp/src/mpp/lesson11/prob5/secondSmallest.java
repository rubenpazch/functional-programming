package mpp.lesson11.prob5;
import java.util.Arrays;
import java.util.List;
public class secondSmallest {
	public static <T extends Comparable> T secondSmallest(List<T>
	list) {
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if (smallest.compareTo(secondSmallest) > 0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for (T next : list) {
			if (next.compareTo(smallest) < 0) {
				secondSmallest = smallest;
				smallest = next;
			} else if (next.compareTo(secondSmallest) < 0) {
				secondSmallest = next;
			}
		}
		return secondSmallest;
	}
	public static void main(String[] args) {
		System.out.println(secondSmallest(Arrays.asList(2,7,3,9,14)));
	}


}
