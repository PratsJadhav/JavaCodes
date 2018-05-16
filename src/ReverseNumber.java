
public class ReverseNumber {

	public static void main(String args[])
	{
		int num1 = 12;
		int num2 = 0;
		
		while(num1!=0)
		{
			num2 = num2 *10;
			num2 = num2 + num1%10;
			
			num1 = num1/10;
		}
		
		System.out.println("Reverse Number = "+num2);
	}
}
