package com._520it.day01.generictype;

public class PointDemo {
	public static void main(String[] args) {
		//情况一：使用String类型
		Point<String> p1=new Point<String>();
		String x1=p1.getX();
		//情况二：使用Integer类型
		Point<Integer> p2=new Point<Integer>();
		Integer x2=p2.getX();
		//情况三：使用Double类型
		Point<Double> p3=new Point<Double>();
		Double x3=p3.getX();
		
		
	}
	
	
	public static <T>  T doWork(T val){
		return val;
	}
}
