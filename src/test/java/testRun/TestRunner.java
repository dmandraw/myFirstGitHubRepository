package testRun;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;






@CucumberOptions(
					//features=".\\IBM_Feature\\Login1.feature",
					//features=".\\IBM_Feature\\Customers1.feature",
//					  features=".\\IBM_Feature\\",
					  features = ".\\IBM_Feature\\Customers2.feature", 
					  glue = "stepDefinitions", 
					  monochrome = true, 
					  dryRun = false,
					//	tags= "@sanity",
//					  	tags = "@regression", 
					  	plugin = { "pretty", 
								
					  			
								"html:target/ibm_CucumberReport.html",
								"json:target/ibm_CucumberReport.json",
								"junit:target/ibm_CucumberReport.xml"
				
				
							})




public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		
		return super.scenarios();
	}
	

}
