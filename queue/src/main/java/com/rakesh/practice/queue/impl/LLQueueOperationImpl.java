package com.rakesh.practice.queue.impl;

import com.rakesh.practice.queue.interfaces.BaseQueueOperations;

public class LLQueueOperationImpl<T> implements BaseQueueOperations<T> {
	
	 private class Node<T> {
		    T value;
		    Node<T> next;

		    Node(T value, Node<T> next) {
		      this.value = value;
		      this.next = next;
		    }
		  }
		 
		  private int count;
		  private Node<T> front;
		  private Node<T> rear;

		  public LLQueueOperationImpl() {
		     front = rear = null;
		     count = 0;
		  }

		@Override
		public void enqueue(T value) {
	        if (rear != null) {
	            rear.next = new Node(value, null);
	            rear = rear.next;
	        } else {
	            rear = new Node(value, null);
	            front = rear;
	        }
	        count++;
			
		}

		@Override
		public T dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Cannot dequeue - Queue is empty");
	        }

	        T value = front.value;
	        front = front.next;
	        count--;

	        if (front == null) {
	            rear = null;
	        }

	        return value;
		}

		@Override
		public boolean isFull() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isEmpty() {
			return front == null;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return count;
		}

		@Override
		public T front() {
			return front.value;
		}

		
//		https://oldsite.castcertificatewb.gov.in/jsp/application_module/upload_sc_st.jsp
}
