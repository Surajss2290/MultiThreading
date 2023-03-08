package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread1;

public class ThreadMain {
public static void main(String[] args) {
	MyThread1 myThread1=new MyThread1();
	myThread1.setName("harsh");

	System.out.println(myThread1.getName());
	
//	myThread1.start();
//	MyThread2 mythread2=new MyThread2();
//	Thread thread=new Thread(mythread2);
//	thread.start();;
	
}
}
