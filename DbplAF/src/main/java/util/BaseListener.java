//package util;
//
//import com.poc.atf.config.BrowserDriver;
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class BaseListener extends TestListenerAdapter {
//
//	public static ExtentReports extent;
//	public static ExtentSparkReporter spark;
//	public static ExtentTest logger;
//
//	@BeforeSuite
//	public void startReport() {
//		extent = new ExtentReports();
//		spark = new ExtentSparkReporter("Reports//DBPL.html");
//		extent.attachReporter(spark);
//		extent.setSystemInfo("Host Name", "Enmovil");
//		extent.setSystemInfo("Environment", "QA");
//		extent.setSystemInfo("User Name", "Nagendra");
//		spark.config().setDocumentTitle("DBPL");
//		spark.config().setReportName("Regression Result");
//		spark.config().setTheme(Theme.DARK);
//	}
//
//	@AfterMethod
//	public void getResult(ITestResult result) throws Exception {
//		if (result.getStatus() == ITestResult.FAILURE) {
//			logger.log(Status.FAIL,
//					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
//			logger.log(Status.FAIL,
//					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
//			// logger.fail("Test Case Failed Snapshot is below " +
//			// logger.addScreenCaptureFromPath("D:\\web-automation\\atf-web-ui\\Reports"));
//			// logger.fail("Test Case Failed Snapshot is below " +
//			// logger.addScreenCaptureFromPath("D:\\web-automation\\atf-web-ui\\ScreenShots"));
//			BrowserDriver.takeScreenShot();
//		} else if (result.getStatus() == ITestResult.SKIP) {
//			logger.log(Status.SKIP,
//					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
//		} else if (result.getStatus() == ITestResult.SUCCESS) {
//			logger.log(Status.PASS,
//					MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
//		}
//	}
//
//	@AfterSuite
//	public void endReport() {
//		extent.flush();
//	} 
//}
//
///*
// * @Override public void onTestStart(ITestResult itr) {
// * log("Test Started.........."); }
// * 
// * @Override public void onTestSuccess(ITestResult itr) { log("Test "
// * +itr.getName() + " Passed"); log(itr.getTestClass());
// * log("Priority of the method is " +itr.getMethod().getPriority());
// * 
// * }
// * 
// * @Override public void onTestFailure(ITestResult itr) {
// * BrowserDriver.takeScreenShot(); log("Test " +itr.getName() + " Failed");
// * log(itr.getTestClass()); log("Priority of the method is "
// * +itr.getMethod().getPriority());
// * 
// * }
// * 
// * private void log(String methodName) { System.out.println(methodName); }
// * 
// * private void log(IClass testClass) { System.out.println(testClass); }
// */


package util;

import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.poc.atf.config.BrowserDriver;

public class BaseListener extends TestListenerAdapter {

    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    public static ExtentTest logger;

    @BeforeSuite
    public void startReport() {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("Reports//DBPL.html");
        extent.attachReporter(spark);
        extent.setSystemInfo("Host Name", "Enmovil");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Nagendra");
        spark.config().setDocumentTitle("DBPL");
        spark.config().setReportName("Regression Result");
        spark.config().setTheme(Theme.DARK);
    }
    
    @AfterMethod
	public void getResult(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			// logger.fail("Test Case Failed Snapshot is below " +
			// logger.addScreenCaptureFromPath("D:\\web-automation\\atf-web-ui\\Reports"));
			// logger.fail("Test Case Failed Snapshot is below " +
			// logger.addScreenCaptureFromPath("D:\\web-automation\\atf-web-ui\\ScreenShots"));
			BrowserDriver.takeScreenShot();
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		}
	}
 
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
}
 
/*
* @Override public void onTestStart(ITestResult itr) {
* log("Test Started.........."); }
* 
* @Override public void onTestSuccess(ITestResult itr) { log("Test "
* +itr.getName() + " Passed"); log(itr.getTestClass());
* log("Priority of the method is " +itr.getMethod().getPriority());
* 
* }
* 
* @Override public void onTestFailure(ITestResult itr) {
* BrowserDriver.takeScreenShot(); log("Test " +itr.getName() + " Failed");
* log(itr.getTestClass()); log("Priority of the method is "
* +itr.getMethod().getPriority());
* 
* }
* 
* private void log(String methodName) { System.out.println(methodName); }
* 
* private void log(IClass testClass) { System.out.println(testClass); }
*/

//    @Override
//    public void onTestStart(ITestResult result) {
//        // Initialize logger for each test method
//        logger = extent.createTest(result.getMethod().getMethodName());
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
//        logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
//        
//        Throwable throwable = result.getThrowable();
//        if (throwable != null) {
//            String assertionMessage = throwable.getMessage();
//            if (assertionMessage != null) {
//                logger.log(Status.FAIL, MarkupHelper.createLabel("Assertion failed in method: " + result.getMethod().getMethodName(), ExtentColor.RED));
//                logger.log(Status.FAIL, MarkupHelper.createLabel("Assertion message: " + assertionMessage, ExtentColor.RED));
//            }
//        }
//        // Add screenshot if needed
//        // BrowserDriver.takeScreenShot();
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
//    }
//
//    @AfterSuite
//    public void endReport() {
//        extent.flush();
//    }

