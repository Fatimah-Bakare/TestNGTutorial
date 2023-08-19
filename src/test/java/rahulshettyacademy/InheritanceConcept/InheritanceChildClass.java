package rahulshettyacademy.InheritanceConcept;

import org.testng.annotations.Test;

public class InheritanceChildClass extends InheritanceParentClass{
	
//	@BeforeMethod
//	public void beforeRun() 
//	{
//		System.out.println("Run me first");
//	}
	
	@Test
	public void testRun() 
	{
		ChildClass2 cc2 = new ChildClass2(3); //Constructor
		int a = 3;
		doThis();
		System.out.println(cc2.increment());
		System.out.println(cc2.decrement());
		
//		ChildClass3 cc3 = new ChildClass3(a);
//		System.out.println(cc3.multiplyTwo());
		System.out.println(cc2.multiplyThree());
	}
	
//	@AfterMethod
//	public void afterRun() 
//	{
//		System.out.println("Run me last");
//	}

}
