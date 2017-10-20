package com._520it_day02._01_producer_consumer;

public class ShareResource1 {
	private String name;
	private String gender;
	private boolean isEmpty=true;

	synchronized public void put1(String name, String gender) {
		if(!isEmpty){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.gender = gender;
		//设置isEmpty为false
		isEmpty=false;
		this.notify();//唤醒一个消费者
	}

	synchronized public void popup1() {
		if(isEmpty){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "-" + gender);
		this.isEmpty=true;
		this.notify();
	}
}
