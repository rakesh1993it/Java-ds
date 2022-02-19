package com.rakesh.practice.DoublyLinkedlist.util;

import com.rakesh.practice.DoublyLinkedlist.Node;

public class DLinkedListUtil<T> {
	
    public void printlist(Node node)
    {
        Node<T> last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.getData() + " ");
            last = node;
            node = node.getNext();
        }
    }

}
