
public class ReplaceLetter {
	
	public static void main(String args[])
	{
		String str = "Pratiksha";
		
		char c = 'a';
		
		String str_aft_replace = str.replace(c, '@');
		System.out.println(""+str_aft_replace);
		
		
		StringBuilder strbldr = new StringBuilder(str);
		strbldr.replace(0, 1, "bbb");
		System.out.println(""+strbldr);
		strbldr.append(str_aft_replace);
	}

}
