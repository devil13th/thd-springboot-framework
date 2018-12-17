package com.thd.framework.threadpooltest;

public class MyThread implements Runnable{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println(this.name + " start ...");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(this.name + " finish ...");
	}
}
