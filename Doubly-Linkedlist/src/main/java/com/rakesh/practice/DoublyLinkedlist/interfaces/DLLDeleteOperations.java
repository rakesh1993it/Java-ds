package com.rakesh.practice.DoublyLinkedlist.interfaces;

import com.rakesh.practice.DoublyLinkedlist.Node;

public interface DLLDeleteOperations<T> extends BaseDLLOperations {
    Node<T> deleteFromBegin();
    Node<T> deleteFromEnd();
    Node<T> deleteNode(Node del);
    Node<T> deleteFromAnyPos( int pos);
}
