package testNg;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunnerForFailedTestcases {

	public static void main(String[] args) {
		
		
      TestNG	runner=new TestNG();
       List<String> list=new ArrayList<String>();
       list.add("C:\\Users\\HP\\Desktop\\Testing\\work\\Automation\\test-output\\testng-failed.xml");
       runner.setTestSuites(list);
       runner.run();

	}

}
