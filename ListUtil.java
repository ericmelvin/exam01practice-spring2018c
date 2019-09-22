package exam01;
import java.util.ArrayList;
import java.util.List;
public class ListUtil {
    public static List < Integer > partialProducts(List < Integer > list) {
		
		
		if (list == null || list.size() == 0) {
			throw new IllegalArgumentException("Bad input.");
		}
		
		List<Integer> newList = new ArrayList<>();
		
		// For testing
		System.out.print("List: ");
		for (int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		
		int product = list.get(0);
		newList.add(product);
		for (int i=1; i<list.size(); i++) {
			product = list.get(0);
			for (int j=1; j<=i; j++) {
				product *= list.get(j);
				
					
				}
				newList.add(product);
			}
			return newList;
		}
}