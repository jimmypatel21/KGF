package testNG;

import org.testng.annotations.Test;

public class ThreadPoolSize {
	@Test(invocationCount = 3, threadPoolSize = 03)
public void testThreadPools() {

	//System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
	System.out.println("Threads of Java allows a program to operate more efficiently by doing multiple things at the same time");	
  }
	@Test(invocationCount = 03)
	public void testWithOutThreadPool() {
		System.out.println("Check my execution time in the HTML report"); 
	}
}