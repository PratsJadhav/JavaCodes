import java.util.HashMap;
import java.util.Set;

public class DupliNumb {

	public static void main(String args[])
	{
		Integer array[] = {4,7,2,6,2,4,4};
		
		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		
		for(Integer c: array)
		   {
			   if(hp.containsKey(c))
				   hp.put(c, hp.get(c)+1);
			   else
				   hp.put(c, 1);
		   }
		Set<Integer> s = hp.keySet();
		
		for(Integer aa: s)
		{
			System.out.println("duplicate = "+aa+" times = "+hp.get(aa));
		}
		
	}
}
