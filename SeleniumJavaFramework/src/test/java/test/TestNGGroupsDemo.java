package test;

import org.testng.annotations.Test;
@Test(groups = {"AllClassTests"})
public class TestNGGroupsDemo {
	
	@Test(groups = {"sanity"})
	public void test1(){
		System.out.println("This is Test 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2(){
		System.out.println("This is Test 2");
	}
	
	@Test(groups = {"sanity","regression"})
	public void test3(){
		System.out.println("This is Test 3");
	}
	
	@Test
	public void test4(){
		System.out.println("This is Test 4");
	}
	@Test(groups = {"windows.sanity"})
	public void test5(){
		System.out.println("This is Test 5");
	}
	@Test(groups = {"windows.smoke"})
	public void test6(){
		System.out.println("This is Test 6");
	}
	@Test(groups = {"linux.sanity"})
	public void test7(){
		System.out.println("This is Test 7");
	}
}
