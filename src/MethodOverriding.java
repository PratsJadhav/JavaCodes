
public class MethodOverriding {

	public static void main(String args[])
	{
		A obj = new A();
		obj.m1();
		//A class method
		B obj3 = new B();
		obj3.m1();
		//B class method
		
		A obj1 = new B();  //A obj1 = (A)new B();
		obj1.m1();
		//B class method
		B obj5 = (B) obj1;
		obj5.m1();
		//B class method		
		
		B obj4 = (B) new A();
		//gives error as A can not be cast to B
		obj4.m1();
		
	}
}

class A
{
	public void m1()
	{
		System.out.println("A class method");
	}

}

class B extends A
{
	public void m1()
	{
		System.out.println("B class method");
	}
}
