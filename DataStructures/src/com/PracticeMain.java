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
		ndt.addAtFront(4);
		ndt.addAtFront(5);
		System.out.println("Linked List elements ");
		loopLinkedList(ndt);
		
		System.out.println("top element data from front: " + ndt.topFront());
		ndt.addToBack(0);
		System.out.println("top element data from front after 0 element add2back: " + ndt.topFront());
		System.out.println("Linked List elements ");
		loopLinkedList(ndt);
		
		try {
			System.out.println("top element data from back: " +ndt.topBack());
			ndt.removeBack();
			System.out.println("top element data from back after removeback: " +ndt.topBack());
			System.out.println("Linked List elements ");
			loopLinkedList(ndt);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Null pointer exception");
		}
		/*****
		 * Stacks
		 */
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

}
