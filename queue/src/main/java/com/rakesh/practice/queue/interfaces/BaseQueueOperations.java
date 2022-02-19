package com.rakesh.practice.queue.interfaces;

public interface BaseQueueOperations<T> {
	
	public void enqueue(T element);
	public T dequeue();
	public boolean isFull();
	public boolean isEmpty();
	public int size();
	public String toString();
	public T front();

}
