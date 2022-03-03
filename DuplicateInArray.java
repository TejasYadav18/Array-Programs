package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArray {
	public static void main(String[] args) {
	
		
	int []arr= {1,2,3,1,4,6,4,5,7,8,9,8};
	
	Set hs =new HashSet();
	
	for (int i = 0; i < arr.length-1; i++)
	{
		if (hs.contains(arr)) {
			System.out.println("Duplicate "+ arr[i]);
			
		} else {
			hs.add(arr[i]);
			
		}
	}
	System.out.println(hs);
		
	//	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//		String[]words= {"Java","is","my","favourite","Language","Java","is","Popular"};
//		
//		List<String> lst =Arrays.asList(words);
//		HashSet<String > hs= new HashSet<String>(lst);
//		System.out.println(hs);
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		
//		int[]nums= {12,34,12,34};     //As aslist method is not working on primitive array we use for each
//		
//		List<Integer> lst2=new ArrayList<>();
//		
//		for (Integer i : nums) {
//			lst2.add(i);
//			System.out.println(i);
//		}
//		HashSet<Integer> hs = new HashSet<>(lst2);
//		System.out.println(hs);
//	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
			
					
