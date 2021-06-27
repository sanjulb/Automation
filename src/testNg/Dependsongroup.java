package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsongroup {
	@Test(groups="smoke")
	public void smokeTestcase1()
	{
		System.out.println("smokeTestcase1");
		Assert.assertTrue(false);
	}
	@Test(groups="smoke")
	public void smokeTestcase2()
	{
		System.out.println("smokeTestcase2");
	}
	@Test(groups="functional")
	public void functionalTestcase1()
	{
		System.out.println("functionalTestcase1");
	}
	@Test(groups="functional")
	public void functionalTestcase2()
	{
		System.out.println("functionalTestcase2");
	}
	@Test(groups="regression")
	public void regressionTestcase1()
	{
		System.out.println("regressionTestcase1");
	}
	@Test(groups="regression")
	public void regressionTestcase2()
	{
		System.out.println("regressionTestcase2");
	}
	@Test(groups="performance")
	public void performanceTestcase1()
	{
		System.out.println("performanceTestcase1");
	}
	@Test(groups="performance")
	public void performanceTestcase2()
	{
		System.out.println("performanceTestcase2");
	}
	
	
	


}
