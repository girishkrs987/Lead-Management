package Utitlity;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsNG implements IReporter {

		private ExtentReports extent;
		
//		public ExtentReports(String string, boolean b) {
//			// TODO Auto-generated constructor stub
//		}


		public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
			// TODO Auto-generated method stub
			
			{
				extent=new ExtentReports(outputDirectory +File.separator+"Extent.html",true);

				
				for(ISuite suite: suites){

				Map<String, ISuiteResult>  result = suite.getResults();
				
				for(ISuiteResult r:result.values()) {
					ITestContext conext=r.getTestContext();
					
					buildTestNodes(conext.getPassedTests(), LogStatus.PASS);
					buildTestNodes(conext.getFailedTests(), LogStatus.FAIL);
					buildTestNodes(conext.getSkippedTests(), LogStatus.SKIP);
				}
				
				}
				extent.flush();
				extent.close();
			}
				
				

}
	
		public void buildTestNodes(IResultMap tests, LogStatus status) {
			
			ExtentTest test;
			
			if(tests.size()>0) {
				
				for(ITestResult result:tests.getAllResults()) {
					test=extent.startTest(result.getMethod().getMethodName());
					test.setStartedTime(getTime(result.getStartMillis()));
					test.setEndedTime(getTime(result.getEndMillis()));
					
					for(String group:result.getMethod().getGroups()) {
						test.assignCategory(group);
						
						if(result.getThrowable()!=null) {
							
							test.log(status, result.getThrowable());
							
							
						}
						
						else {
							test.log(status, "Tests"+status.toString().toLowerCase()+"ed");
						}
					}
				}
			}
			
		}

		private Date getTime(long millis) {
			
			Calendar calendar=Calendar.getInstance();
					calendar.setTimeInMillis(millis);
			return calendar.getTime();
			
		}
}
