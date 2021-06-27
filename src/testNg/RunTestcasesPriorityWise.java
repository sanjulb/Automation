package testNg;

import org.testng.annotations.Test;

public class RunTestcasesPriorityWise {
	 @Test(priority=1 )
	  public void openApp() {
		  System.out.println("openApp");
	  }
	  @Test(priority=2)
	  public void verifyTitle() {
		  System.out.println("verifyTitle");
	  }
	  @Test(priority=3)
	  public void closeApp() {
		  System.out.println("closeApp");
	  }

}
