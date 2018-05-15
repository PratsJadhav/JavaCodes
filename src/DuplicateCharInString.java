import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class DuplicateCharInString {
	
   public static void main(String args[])
   {
	   String str  = "Pratiaksha";
	   char array[] = str.toCharArray();
	   
	   HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
	   
	   for(Character c: array)
	   {
		   if(hp.containsKey(c))
			   hp.put(c, hp.get(c)+1);
		   else
			   hp.put(c, 1);
	   }
	   
	   
	   Set<Character> s = hp.keySet();
	   
	   for(Character d: s)
	   {
		  // if(hp.get(d)>1)
			   System.out.println("Char "+d+" = "+hp.get(d));
	   }
   
   }

   
   
   
}
