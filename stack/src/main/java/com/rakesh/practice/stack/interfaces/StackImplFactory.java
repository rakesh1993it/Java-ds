package com.rakesh.practice.stack.interfaces;

import com.rakesh.practice.stack.impl.GenericArrayStackImpl;
import com.rakesh.practice.stack.impl.GenericLinkedStackImpl;

public class StackImplFactory<T> {

	public BaseStackOperations<T> getImplByType(String enums) {

		if (enums.equals(StackEnums.ARRAY.toString())) {

			return new GenericArrayStackImpl<T>();
		} else {
			return new GenericLinkedStackImpl<T>();
		}
	}

}
