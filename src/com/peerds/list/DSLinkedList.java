package com.peerds.list;

public class DSLinkedList {

	private Node head;
	private int count;

	public DSLinkedList() {
		this.head = null;
		this.count = 0;
	}
	
	public int size() {
		return this.count;
	}
	
	public void clear() {
		this.head = null;
		this.count = 0;
	}
	
	public void add(String data) {
		
		Node node = new Node(data);
		
		if(this.head == null) {
			this.head = node;
		} else {
			Node tempHead = this.head;
			
			while(tempHead.hasNext()) {
				tempHead = tempHead.getNext();
			}
			
			tempHead.setNext(node);
		}
		
		this.count++;
	}
	
	public Boolean remove(String data) {
		return false;
	}

	@Override
	public String toString() {
		String returnVal = "[";
		
		Node tempHead = this.head;
		
		while(tempHead != null) {
			returnVal += (tempHead.getData() + ",");
			tempHead = tempHead.getNext();
		}
		
		return returnVal + "]";
	}
	
	
}
