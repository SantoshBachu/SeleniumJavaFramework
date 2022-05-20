package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
		System.out.println("************* Test Started:"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		System.out.println("************* Test is Success:"+result.getName());

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		System.out.println("************* Test Failed:"+result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
		System.out.println("************* Test Skipped:"+result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
		System.out.println("************* Test Completed:"+context.getName());

	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		//ISuiteListener.super.onStart(suite);
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		//ISuiteListener.super.onFinish(suite);
	}
	

}
