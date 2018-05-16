
class CustomException1 extends Exception{

	public CustomException1()
	{
		System.out.println("do nothing");
	}
}

public class CustomException
{
	public static void main(String args[]) throws CustomException1
	{
		System.out.println("before exception");
		throw new CustomException1();
	//	System.out.println("after exception");
	}
	}
