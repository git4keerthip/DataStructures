/**
 * 
 */
package com;

import com.LinkedList.Node;

/**
 * @author Kee
 *
 */
public class PracticeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Single Linked List
		 */
		LinkedList ndt = new LinkedList();
		Node newnd =  ndt.new Node(123);
		ndt.addAtFront(1);
		ndt.addAtFront(2);
		System.out.println("Linked List size :"+ndt.getSize()+"with elements");
		loopLinkedList(ndt);
		ndt.removeAtFront();
		System.out.println("size after remove :"+ndt.getSize());
		ndt.addAtFront(3);
		ndt.addAtFront(1);
		ndt.addAtFront(5);
		System.out.println("Linked List elements ");
		loopLinkedList(ndt);
		
		System.out.println("top element data from front: " + ndt.topFront());
		ndt.addToBack(0);
		System.out.println("top element data from front after 0 element add2back: " + ndt.topFront());
		System.out.println("Linked List elements ");
		loopLinkedList(ndt);
		System.out.println("top element data from back: " +ndt.topBack());
			ndt.removeBack();
			System.out.println("top element data from back after removeback: " +ndt.topBack());
			System.out.println("Linked List elements ");
			loopLinkedList(ndt);
			ndt.search(1);
		/*****
		 * Stacks
		 */
		System.out.println("*********Stack**********");
		Stack st = new Stack();
		st.push(0);
		st.push(1);
		st.push(2);
		System.out.println("elements in stack");
		loopStack(st);
		System.out.println("stack size :"+ st.getSize());
		st.pop();
		System.out.println("elements after pop:");
		loopStack(st);
		st.push(3);
		System.out.println("element 3 is pushed " );
		System.out.println("elements in stack");
		loopStack(st);
		/****
		 * QUEUE
		 */
		System.out.println("*********Queue**********");
		Queue que = new Queue(100);
		que.enqueue(0);
		que.enqueue(1);
		que.enqueue(2);
		loopQueue(que);
		System.out.println("queue size : "+ que.getSize());
		System.out.println("queue rear : "+ que.rear);
		System.out.println("queue front : "+ que.front);
		System.out.println("FILO -- element removed from queue is " +que.dequeue());
		loopQueue(que);
		System.out.println("queue rear : "+ que.rear);
		System.out.println("queue front : "+ que.front);
		que.enqueue(3);
		System.out.println("element added");
		loopQueue(que);
		System.out.println("queue rear : "+ que.rear);
		System.out.println("queue front : "+ que.front);
		que.dequeue();que.dequeue();
		System.out.println("two elements removed");
		loopQueue(que);
		System.out.println("queue rear : "+ que.rear);
		System.out.println("queue front : "+ que.front);

		
		
	}
	public static void loopStack(Stack stk)
	{
		for (int i =0 ; i<stk.getSize() ; i++)
		{
			System.out.println(" -- "+stk.get(i)+ " --");
			
		}
		
	}
	public static void loopLinkedList(LinkedList ldl)
	{
		for (int i =0 ; i<ldl.getSize() ; i++)
		{
			System.out.println("|_"+ldl.get(i)+ "_|");
			
		}
		
	}
	public static void loopQueue(Queue ldl)
	{
		for (int i =0 ; i<ldl.getSize() ; i++)
		{
			System.out.println("|<_"+ldl.get(i)+ "_>|");
			
		}
		
	}
}
