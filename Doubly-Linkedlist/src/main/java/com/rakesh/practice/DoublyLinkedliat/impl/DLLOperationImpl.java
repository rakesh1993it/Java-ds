package com.rakesh.practice.DoublyLinkedliat.impl;

import com.rakesh.practice.DoublyLinkedlist.Node;
import com.rakesh.practice.DoublyLinkedlist.interfaces.DLLDeleteOperations;
import com.rakesh.practice.DoublyLinkedlist.interfaces.DLLInsertOperations;

public class DLLOperationImpl<T> implements DLLInsertOperations<T>, DLLDeleteOperations<T> {
	
	private Node<T> head;	
	private Node<T> tail=null;	

    
	@Override
    public Node<T> insertAtBegin(Node<T> node) {
        node.setNext(head);
        node.setPrev(null);
        if (head != null) {
            head.setPrev(node);
        }
        head = node;
        return head;
    }

	@Override
	public Node<T> deleteFromBegin() {
//		System.out.println("jkhddddddddddddf"+head.getData());
		if(head == null) return null;
		head=head.getNext();
		head.setNext(null);		

		return head;
	}
	
	public Node<T> deleteNode(Node del)
    {
 
        // Base case
        if (head == null || del == null) {
            return null;
        }
        System.out.println("del....."+del);
        // If node to be deleted is head node
        if (head == del) {
            head = del.getNext();
        }
 
        // Change next only if node to be deleted
        // is NOT the last node
        if (del.getNext() != null) {
            del.getNext().setPrev(del.getPrev());
        }
 
        // Change prev only if node to be deleted
        // is NOT the first node
        if (del.getPrev() != null) {
            del.getPrev().setNext(del.getNext());
        }
        del=null;
        // Finally, free the memory occupied by del
        return head;
    }

	@Override
    public Node<T> getHead() {
        return head;
    }
	@Override
	public Node<T> deleteFromEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node<T> deleteFromAnyPos(int pos) {
		 /* if list in NULL or
        invalid position is given */
      if (head == null || pos <= 0)
          return null;

      Node<T> current = head;
      int i;

      /*
      * traverse up to the node at
        position 'n' from the beginning
      */
      for (i = 1; current != null && i < pos; i++)
      {
          current = current.getNext();
      }
       
      // if 'n' is greater than the number of nodes
      // in the doubly linked list
      if (current == null)
          return null;

      // delete the node pointed to by 'current'
      deleteNode(current);
      return head;
	}

	@Override
	public Node<T> insertAtEnd(Node<T> node) {
		
		Node<T> last = head;
		if(head == null) {
			head.setNext(node);
			head.setPrev(null);
		}
		while(last.getNext() != null) {
			last=last.getNext();
		}
		last.setNext(node);
		node.setPrev(last);
		node.setNext(null);
		return head;
	}

	@Override
	public Node<T> InsertBefore(Node<T> prevNode, Node<T> newNode) {
        if(prevNode == null)
        {
            System.out.println("The given previous node can not be NULL");
            return null;
            
        }
		newNode.setPrev(prevNode.getPrev());
		prevNode.setPrev(newNode);
		newNode.setNext(prevNode);
		
        //Check if new node is added as head
        if(newNode.getPrev() != null)
        	newNode.getPrev().setNext(newNode);
        else
            head = newNode;

		return head;
	}

	@Override
	public Node<T> InsertAfter(Node<T> afterNode, Node<T> newNode) {
        if(afterNode == null)
        {
            System.out.println("The given next node can not be NULL");
            return null;
            
        }
		newNode.setNext(afterNode.getNext());
		afterNode.setNext(newNode);
		newNode.setPrev(afterNode);
		
        //Check if new node is added as head
        if(newNode.getNext() != null)
        	newNode.getNext().setPrev(newNode);
       
		return head;
	}


}
