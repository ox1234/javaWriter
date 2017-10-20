package com._520it.day02.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//集合元素的迭代和遍历操作
public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		//方式1:for循环
		for (int index = 0; index < list.size(); index++) {
			Object ele=list.get(index);//取出指定索引位置的元素
			System.out.println(ele);
		}
		System.out.println("-----------------");
		//方式2:for-each增强for循环
		for(Object ele:list){
			System.out.println(ele);
		}
		System.out.println("-----------------");
		//方式3:使用while循环操作迭代器iterator
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("------------------");
		//方式4:使用for循环操作iterator
		for(Iterator it2=list.iterator();it2.hasNext();){
			System.out.println(it2.next());
		}
	}
}
