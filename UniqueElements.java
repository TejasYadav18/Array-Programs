package Array;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
	public static void main(String[] args) {
		int [] arr = {1,3,2,1,5,4,6,9,5,4,9,7,8};
		
		Set hs = new HashSet();
	
		for (int i = 0; i < arr.length-1; i++) {
			if (hs.contains(arr)) {
				System.out.println("Duplicate "+ arr[i]);
				
			} else {
				hs.add(arr[i]);

			}
		}
		System.out.println(hs);
			
		}

}
