/**
 * 
 */
package com;

/**
 * @author Kee
 *
 */
public class LinkedList {
	Node head;
	
	public class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data = d;
			next = null;
		}
	}
	public void addAtFront(int a)
	{
		Node new_node = new Node(a);
		//new_node.next = head;
		if(head == null)
		head = new_node;
		else
		{
			 new_node.next=head;
			 head = new_node;
		}
	}
	public int topFront()
	{
		return head.data;
	}
	public void removeAtFront()
	{
		if(null != head)
		{
		Node toRemove=head;
		head=toRemove.next;
		toRemove = null;
		}
		
	}
	public int getSize()
	{
		int size = 0;
		if(this !=null && this.head != null)
		{
			Node temp = this.head;
			size=1;
			while(temp.next != null)
			{
				
				temp = temp.next;
				size++;
			}
		}
		return size;
			
	}
	
	@SuppressWarnings("unused")
	public int topBack() throws  Exception
	{
		int data = 0;
		if(null != this)
		{
			Node h = this.head;
			while(h.next !=null)
			{
				h = h.next;
			}
			data = h.data;
		}
		else
			throw new Exception();
		
		return data;
	}
	public void addToBack(int a) 
	{
		if(null != this)
		{
			Node new_node = new Node(a);
			Node h = this.head;
			while(h.next !=null)
			{
				h = h.next;
			}
			h.next = new_node;
		}
	}
	public void removeBack() 
	{
		if(null != this)
		{
			Node h = this.head;
			while(h.next !=null)
			{
				if(h.next.next == null)
					break;
				else
					h = h.next;
				
			}
			h.next = null;
		}
	}
}
