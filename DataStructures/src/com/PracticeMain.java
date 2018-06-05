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
		LinkedList ndt = new LinkedList();
		Node newnd =  ndt.new Node(123);
		ndt.addAtFront(1);
		ndt.addAtFront(2);
		System.out.println("size after add :"+ndt.getSize());
		ndt.removeAtFront();
		System.out.println("size after remove :"+ndt.getSize());
		ndt.addAtFront(3);
		ndt.addAtFront(4);
		ndt.addAtFront(5);
		System.out.println("top element data from front: " + ndt.topFront());
		ndt.addToBack(0);
		System.out.println("top element data from front after add2back: " + ndt.topFront());
		try {
			System.out.println("top element data from back: " +ndt.topBack());
			ndt.removeBack();
			System.out.println("top element data from back after removeback: " +ndt.topBack());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Null pointer exception");
		}
		
		
	}

}
