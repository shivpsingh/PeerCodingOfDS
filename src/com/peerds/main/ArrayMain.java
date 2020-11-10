package com.peerds.main;

import java.util.ArrayList;

import com.peerds.array.DSArrayList;

public class ArrayMain {

	public static void main(String[] args) {

		DSArrayList<String> dsarray = new DSArrayList<>();
		ArrayList<String> arr = new ArrayList<>();
		
		dsarray.add("1");
		dsarray.add("2");
		dsarray.add("3");
		arr.add("1");
		arr.add("2");
		arr.add("3");
		
		System.out.println(arr);
		System.out.println(dsarray);
		
		dsarray.remove(1);
		arr.remove(1);
		
		System.out.println(arr.size());
		System.out.println(dsarray.size());
		System.out.println(arr);
		System.out.println(dsarray);
		
	}

}
