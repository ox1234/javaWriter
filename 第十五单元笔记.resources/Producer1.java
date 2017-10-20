package com._520it_day02._01_producer_consumer;

public class Producer1 implements Runnable{
	private ShareResource1 resource=null;
	
	public  Producer1(ShareResource1 resource){
		this.resource=resource;
	}
	
	public void run(){
		for(int i=0;i<50;i++){
			if(i%2==0){
				resource.put1("凤姐","女");
			}else{
				resource.put1("春哥","男");
			}
		}
	}
}
