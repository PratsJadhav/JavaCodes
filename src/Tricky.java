
public class Tricky {
	
	public static void main(String args[])
	{
		Tricky t = new Tricky();
		
		//static method can access only static members, they can access non static members using object reference
		System.out.println(t.test());
		System.out.println(testing());
		
	}
	
	public int test()
	{
		return 20;
	}
	
	public static int testing()
	{
		return 10;
	}

}
