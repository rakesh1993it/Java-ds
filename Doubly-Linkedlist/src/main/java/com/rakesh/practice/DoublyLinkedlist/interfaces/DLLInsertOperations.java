package com.rakesh.practice.DoublyLinkedlist.interfaces;

import com.rakesh.practice.DoublyLinkedlist.Node;

public interface DLLInsertOperations<T> extends BaseDLLOperations {
	
    Node<T> insertAtBegin(Node<T> node);
    Node<T> InsertBefore(Node<T> prevNode,Node<T> newNode);
    Node<T> InsertAfter(Node<T> afterNode,Node<T> newNode);
    Node<T> insertAtEnd(Node<T> node);
	Node<T> getHead();
    Node<T> deleteFromBegin();
//    Node<T> insertAtAnyPos(Node<T> node, int pos);

}
