package test;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(dependsOnMethods = {"test2","test3"}, priority = 1) //using depends on methods with priority
	public void test1() {
		System.out.println("I am inside Test1");
	}
	@Test(dependsOnGroups = {"sanity.*"}) //using regular expression with depends on groups
	public void test2() {
		System.out.println("I am inside Test2");	
	}
	@Test(groups= {"sanity1"})
	public void test3() {
		System.out.println("I am inside Test3");
	}
	@Test(groups= {"sanity2"})
	public void test4() {
		System.out.println("I am inside Test4");
	}

}
