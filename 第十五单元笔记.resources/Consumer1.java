package com._520it_day02._01_producer_consumer;

public class Consumer1 implements Runnable {
	ShareResource1 resource=null;
	public Consumer1(ShareResource1 resource){
		this.resource=resource;
	}
	public void run() {
		for(int i=0;i<50;i++){
			resource.popup1();
		}
	}
}
