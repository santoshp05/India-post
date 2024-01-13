package UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ListnerAndExtentReport extends BaseClass implements ITestListener  {
	
		ExtentReports extent;
		ExtentSparkReporter spark;
		ExtentTest extenttest;

		@Override
		public void onStart(ITestContext context) {
			String suit=context.getSuite().getName();
			System.out.println("suit staterd name is"  +suit);
			extent = new ExtentReports();
			SimpleDateFormat simple= new SimpleDateFormat("ddMMyyyy_HHmmss");
			String date=simple.format(new Date());
			
			
			 spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\ExtentsHTMLReporter\\"+suit+date+".html");
			 extent.attachReporter(spark);
		}
		
		@Override
		public void onTestStart(ITestResult result) {
			extenttest=extent.createTest(result.getMethod().getMethodName());
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			extenttest.log(Status.PASS, result.getMethod().getMethodName());
			
			String methodName=result.getMethod().getMethodName();
			System.out.println("Method is success   "+methodName);
			
			TakesScreenshot ts= (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			String date= new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
			String path=System.getProperty("user.dir")+"\\passScreenshot\\"+methodName+date+".png";
			File dest= new File(path);
			try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			extenttest.addScreenCaptureFromPath(path);
		}

		@Override
		public void onTestFailure(ITestResult result) {
			extenttest.log(Status.FAIL, result.getMethod().getMethodName());
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			extenttest.log(Status.SKIP, result.getMethod().getMethodName());
		}


		@Override
		public void onFinish(ITestContext context) {
			extent.flush();
		}
		
		
		

	}



