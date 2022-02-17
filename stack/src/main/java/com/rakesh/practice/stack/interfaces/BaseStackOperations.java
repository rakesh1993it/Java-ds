package com.rakesh.practice.stack.interfaces;

import com.rakesh.practice.stack.Stack;

public interface BaseStackOperations<T> {
	
	public boolean push(T value);

    public T pop();
    
    public T peek();

    public boolean contains(T value);

    public int size();

    public void clear();

    public boolean isEmpty();	
    
    public String toString();
    
    int defaultSize =10;

}
