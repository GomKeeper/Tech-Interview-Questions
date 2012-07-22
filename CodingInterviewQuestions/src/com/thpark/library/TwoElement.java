package com.thpark.library;

public class TwoElement {
	private Object first;
	private Object second;
	
	public TwoElement(Object f, Object s) {
		this.first = f;
		this.second = s;
	}
	
	public void setBothElement(Object f, Object s) {
		this.first = f;
		this.second = s;
	}
	
	public Object getFirst() {
		return this.first;
	}
	
	public Object getSecond() {
		return this.second;
	}
}