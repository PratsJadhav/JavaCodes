
public class PrimeNumber {

	public static void main(String args[])
	{
		int num=11;
		boolean flag;
		for(int i=2;i<50;i++)
		{
			flag = false;
			
			for(int j = 2; j <= (i/2) ; j++)
			{
				if(i%j==0)
				{
					flag = true;
					System.out.println(i+" number is not prime");
				    break;
				}
			}
			if(flag==false)
				System.out.println(i+ " is prime ");
		}
	}
}
