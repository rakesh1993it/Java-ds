package com.rakesh.practice.stack.impl;

import java.util.ArrayList;
import java.util.Arrays;

import com.rakesh.practice.stack.Stack;
import com.rakesh.practice.stack.interfaces.BaseStackOperations;

public class GenericArrayStackImpl<T> implements BaseStackOperations<T> {
	private static final int DEFAULT_CAPACITY = 10;
    private T[] store;
    private int size = 0;
    private int capacity;
    
    public GenericArrayStackImpl() {
        this.capacity = defaultSize;
        store = (T[]) new Object[defaultSize];
    }


    @Override
    public boolean push(T value) {
        if (this.size >= store.length) {
            int newSize = size + (size >> 1);
            store = Arrays.copyOf(store, newSize);
        }
        store[size++] = value;
        return true;
    }

    @Override
    public T pop() {
        if (size <= 0) {
            return null;
        }

        // again first we are reducing size and then getting value
        // from Stack, because size is always 1 more array index
        // because index starts at 0. So if you have just one
        // element in Stack, then valid index is zero but size
        // would be one.
        T value = store[--size];

        // make sure you dereference element at top of the stack
        // to prevent memory leak in Java
        store[size] = null;

        // shrinking array if its too big
        int reducedSize = size;
        if (size >= capacity && size < (reducedSize + (reducedSize << 1))) {
            System.arraycopy(store, 0, store, 0, size);
        }
        return value;
    }

    @Override
    public boolean contains(T value) {
        // check for an element in array using
        // sequential search algorithm
        boolean found = false;
        for (int i = 0; i < size; i++) {
            T element = store[i];
            if (element.equals(value)) {
                found = true;
            }
        }

        return found;
    }
    
    public T peek() {
        if (size <= 0) return null;
        T t = store[size-1];
        return t;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            store[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = size - 1; i >= 0; i--) {
            sb.append(this.pop());

            if (i > 0) {
                sb.append(",");
            }
        }
        sb.append("]");

        return sb.toString();
    }

}
