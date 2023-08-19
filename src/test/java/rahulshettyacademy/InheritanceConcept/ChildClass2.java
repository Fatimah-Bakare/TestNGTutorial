package rahulshettyacademy.InheritanceConcept;

import org.testng.annotations.Test;

public class ChildClass2 extends ChildClass3{
	
	int a;
	public ChildClass2(int a) {
		
		super(a); //Invokes parent class constructor
		this.a=a;
	}

	@Test
	public int increment() 
	{
		a = a + 1;
		return a;
	}
	
	@Test
	public int decrement() 
	{
		a = a - 1;
		return a;
	}

}
