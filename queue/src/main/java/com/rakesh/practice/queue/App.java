package com.rakesh.practice.queue;

import com.rakesh.practice.queue.impl.ArrayQueueOperationImpl;
import com.rakesh.practice.queue.impl.LLQueueOperationImpl;
import com.rakesh.practice.queue.interfaces.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BaseQueueOperations<Integer> queue = new ArrayQueueOperationImpl<Integer>();
        System.out.println(queue.front());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);//This is just for test purpose.
        System.out.println(queue.size());
        System.out.println(queue.front());
        
        System.out.println();
        queue.dequeue();
        System.out.println(queue.size());
        System.out.println(queue.front());
        
    	BaseQueueOperations<Integer> llqueue = new LLQueueOperationImpl<Integer>();
        System.out.println(llqueue.front());
        llqueue.enqueue(10);
        llqueue.enqueue(20);
        llqueue.enqueue(30);
        llqueue.enqueue(60);//This is just for test purpose.
        System.out.println(llqueue.size());
        System.out.println(llqueue.front());
    }
}
