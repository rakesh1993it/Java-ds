package com.rakesh.practice.stack.impl;

import java.util.NoSuchElementException;

import com.rakesh.practice.stack.interfaces.BaseStackOperations;

public class GenericLinkedStackImpl<T> implements BaseStackOperations<T> {
	
    private Node<T> top = null;

    /**
    * Helper Class for GenericLinkedStack.
    */
    private static class Node<T> {
        private T data;
        private Node<T> next = null;

        Node(T element) {
            data = element;
        }
    }

	@Override
	public boolean push(T value) {
        Node<T> newItem = new Node<T>(value);

        if (top == null) {
            top = newItem;
        } else {
            // New Top
            newItem.next = top;
            top = newItem;
        }

        return true;
	}

	@Override
	public T pop() {
        if (top == null) {
            throw new NoSuchElementException("The stack is empty.");
        }

        T output = top.data;
        top = top.next;

        return output;
	}

	@Override
	public T peek() {
        if (top == null) {
            throw new NoSuchElementException("The stack is empty.");
        }
        return top.data;
	}

	@Override
	public boolean contains(T value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		 return top == null;
	}
	
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(top != null) {
            T output = top.data;           
        	 sb.append(output);
        	 top = top.next;
        	 sb.append(",");
        }

        sb.append("]");

        return sb.toString();
    }


}
