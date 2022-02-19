package com.rakesh.practice.queue.impl;

import com.rakesh.practice.queue.interfaces.BaseQueueOperations;

public class ArrayQueueOperationImpl<T> implements BaseQueueOperations<T> {

	protected T[] data; // Array based Queue.
	protected int head = 0; // Index location of the "front" element.
	// In this tutorial, head starts at index 0. There are alternative
	// implementation method.
	protected int tail; // Index of the "rear" pointer of queue.
	protected int numberOfElements = 0; // This keeps track of the number of elements in the queue.

	public ArrayQueueOperationImpl() {
		data = (T[]) new Object[10]; // if no size given, default is 10
		tail = data.length - 1; // 9 is the last index
	}

	@Override
	public void enqueue(T element) {
		if (!isFull()) {
			tail = (tail + 1) % data.length;
			// Note: we are dividing integers, and we want the remainder value not the
			// quotient.
			data[tail] = element;
			numberOfElements++; // It is incremented to count the number elements added to the queue.
		} else { // else is an optional choice because it is a void method
			throw new IndexOutOfBoundsException("Queue is full.");
		}

	}

	@Override
	public T dequeue() {
		if (!isEmpty()) {
			T dequeuedValue = data[head];// save the value before deleting it.
			data[head] = null; // Java's garbage collection will empty memory, if it is set to null
			head = (head + 1) % data.length; // determining the index value before deletion
			numberOfElements--; // Since array's size doesn't change, we keep track of the elements inside the
								// queue.
			return dequeuedValue; // returning the removed value.
		} else {
			throw new IndexOutOfBoundsException("Queue is empty.");
			// alternatively:
			// return null; //Since, we are dealling with objects, you can return a null
			// value if it is empty.
		}
	}

	@Override
	public boolean isFull() {
		return (numberOfElements == data.length);
	}

	@Override
	public boolean isEmpty() {
		return (numberOfElements == 0);

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numberOfElements;
	}

    public T front() {
        if (!isEmpty()) {
            return data[head];
        } else {
            return null;
        }
    }
	
	public String toString()
	{
		return null;
		
	}
}
