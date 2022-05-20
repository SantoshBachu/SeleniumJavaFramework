package test;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test
	public void test1(){
		System.out.println("I am inside Test1");
	}
	@Test(priority = 3)
	public void test2(){
		System.out.println("I am inside Test2");
	}
	@Test(priority = 2)
	public void test3(){
		System.out.println("I am inside Test3");
	}
}
