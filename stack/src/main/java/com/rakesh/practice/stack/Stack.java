package com.rakesh.practice.stack;

import java.util.ArrayList;

public class Stack<T> {
	
	ArrayList<T> A;
	int top=-1;
	int size;
	public Stack(int size) {
		this.size = size;
		this.A = new ArrayList<T>(size);

	}
	
	

}
