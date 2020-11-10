package com.peerds.main;

import com.peerds.list.DSLinkedList;

public class ListMain {

	public static void main(String[] args) {
		
		DSLinkedList data = new DSLinkedList();
		
		data.add("Deepak");
		data.add("kd");
		data.add("Shiv");
		data.add("Saify");
		
//		data.remove("kd");
//		System.out.println(data.size());
//		data.clear();
		
		System.out.println(data);
		
	}
	
}
