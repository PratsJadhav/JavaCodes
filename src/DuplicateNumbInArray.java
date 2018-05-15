import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbInArray {

	public static void main(String args[])
	{
		Integer [] array = {10,3,11,10,3,3};
		
		Set<Integer> s = new HashSet<Integer>(Arrays.asList(array));
	    Set<Integer> dupli = new HashSet<Integer>();
		for(Integer a: s)
		System.out.println(""+a);
		
		
		Integer [] temp = new Integer[10];
		int j=0;
		for(Integer i: array)
		{
			if(dupli.contains(i))
			{
				//System.out.println(i+" is duplicate");
			  temp[j++] = i;
			}else
			{
				dupli.add(i);
			}
		}
		
		Set<Integer> fin = new HashSet<Integer>(Arrays.asList(temp));
		for(Integer dd: fin)
			System.out.println("duplicate = "+dd);
	}
}
