package com._520it_day02._01_producer_consumer;

public class App1 {
	public static void main(String[] args) {
		ShareResource1 resource=new ShareResource1();
		//创建生产者
		new Thread(new Producer1(resource)).start();
		//创建消费者
		new Thread(new Consumer1(resource)).start();
	}
}
