package com.rakesh.practice.stack;

import com.rakesh.practice.stack.impl.GenericArrayStackImpl;
import com.rakesh.practice.stack.impl.GenericLinkedStackImpl;
import com.rakesh.practice.stack.interfaces.BaseStackOperations;
import com.rakesh.practice.stack.interfaces.StackEnums;
import com.rakesh.practice.stack.interfaces.StackImplFactory;

public class StackTest {
	public static void main(String[] args) {
//		Stack<Integer> stk = new Stack<Integer>(4);
		/*
		 * BaseStackOperations<Integer> stkOp = new GenericArrayStackImpl<Integer>();
		 * 
		 * stkOp.push(3); stkOp.push(4); stkOp.push(5);
		 * System.out.println("peek element: "+stkOp.peek());
		 * System.out.println("stack data"+stkOp.toString());
		 * 
		 * System.out.println(); BaseStackOperations<String> stkString = new
		 * GenericArrayStackImpl<String>(); stkString.push("rakesh");
		 * stkString.push("rahul"); stkString.push("prosen");
		 * System.out.println("peek element: "+stkString.peek());
		 * System.out.println("stack data"+stkString.toString());
		 * 
		 * 
		 * System.out.println(); BaseStackOperations<String> stkllString = new
		 * GenericLinkedStackImpl<String>(); stkllString.push("rakesh_1");
		 * stkllString.push("rahul_1"); stkllString.push("ramn");
		 * System.out.println("peek element: "+stkllString.peek());
		 * System.out.println("stack data"+stkllString.toString());
		 */
		StackImplFactory<Integer> f = new StackImplFactory<>();
		BaseStackOperations<Integer> stkOp1 = f.getImplByType(StackEnums.ARRAY.toString());
		
		stkOp1.push(3);
		stkOp1.push(4);
		stkOp1.push(5);
		System.out.println("peek element: "+stkOp1.peek());
		System.out.println("stack data"+stkOp1.toString());
	}

}
