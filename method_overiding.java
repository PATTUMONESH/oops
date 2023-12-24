package oops_concepts;

class M1
{
	public void home()
	{
		System.out.println("hello");
	}
	public void home(int a)
	{
		System.out.println("a="+a);
	}
	
	public void home(int a,double b)
	{
		System.out.println("a="+a+"     b="+b);
	}
	
}

class M2 extends M1
{
	public void home()
	{
		super.home();
		System.out.println("hello 2");
	}
	
	public void home(int a)
	{
		System.out.println("a="+a);
	}
	
	public void home(int a,double b)
	{
		System.out.println("a="+a+"     b="+b);
	}
}

public class method_overiding {

	public static void main(String[] args) {
		M2 obj= new M2();
		obj.home();
		obj.home(10);
		obj.home(10,2.33);
		obj.home(20);
		obj.home(222,2.5);
  
	}

}
