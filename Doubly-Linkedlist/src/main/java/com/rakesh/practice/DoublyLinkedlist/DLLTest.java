package com.rakesh.practice.DoublyLinkedlist;

//import com.rahul.practice.linkedlist.entity.Employee;
//import com.rahul.practice.linkedlist.interfaces.LLDeleteOperations;
import com.rakesh.practice.DoublyLinkedliat.impl.DLLOperationImpl;
import com.rakesh.practice.DoublyLinkedlist.interfaces.DLLInsertOperations;
import com.rakesh.practice.DoublyLinkedlist.interfaces.DLLDeleteOperations;
import com.rakesh.practice.DoublyLinkedlist.util.DLinkedListUtil;

public class DLLTest {

	public static void main(String[] args) {
		DLLInsertOperations<Integer> dllimp = new DLLOperationImpl<Integer>();
//		DLLDeleteOperations<Integer> dlldeleteimp = new DLLOperationImpl<Integer>();

		DLLDeleteOperations<Integer> obj = (DLLDeleteOperations<Integer>) dllimp;

		Node<Integer> intNode = new Node<>(20);
		Node<Integer> intNode1 = new Node<>(10);
		Node<Integer> intNode2 = new Node<>(30);
		Node<Integer> intNode3 = new Node<>(40);
		Node<Integer> intNode4 = new Node<>(50);
		Node<Integer> intNode5 = new Node<>(60);

		dllimp.insertAtBegin(intNode);
		dllimp.insertAtBegin(intNode1);
		dllimp.insertAtBegin(intNode2);
		dllimp.insertAtEnd(intNode3);
		dllimp.InsertBefore(intNode3, intNode4);
		dllimp.InsertAfter(intNode4, intNode5);

		DLinkedListUtil<Integer> plObj = new DLinkedListUtil<Integer>();
		plObj.printlist(intNode2);
		System.out.println();
		System.out.println("get previous noe of the given node:");
		System.out.println(intNode4.getNext().getData());

//		obj.deleteFromBegin();
		obj.deleteNode(intNode4);
		System.out.println("After deletefromBegin operation DLL will be:");
		plObj.printlist(intNode2);

	}

}
