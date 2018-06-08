/**
 * 
 */
package com;

/**
 *Single Linked List
 *inert and remove from either ends
 * ----- ----------  ----------  -----------
 *|	head|    1		|	2		|	3		|
 *| 	|			|			|			|
 *|	->1	|next->2	|next->3	|	null	|
 * ----- ----------- ----------- -----------
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
	//get first element from front
	public int topFront()
	{
		return head.data;
	}
	public Integer removeAtFront()
	{
		int data ;
		if(null != head)
		{
		Node toRemove=head;
		head=toRemove.next;
		data = toRemove.data;
		toRemove = null;
		return data;
		}
		return null;
		
	}
	public int getSize()
	{
		int size = 0;
		if(head != null)
		{
			Node temp = head;
			size=1;
			while(temp.next != null)
			{
				
				temp = temp.next;
				size++;
			}
		}
		return size;
			
	}
	//get first element from last
	@SuppressWarnings("unused")
	public Integer topBack() 
	{
		int data = 0;
		Node h = head;
		while(h.next !=null)
		{
			h = h.next;
		}
		data = h.data;
		return data;
		
	}
	public void addToBack(int a) 
	{
		Node new_node = new Node(a);
			Node h = this.head;
			while(h.next !=null)
			{
				h = h.next;
			}
			h.next = new_node;
	}
	public Integer removeBack() 
	{
		if(null != head)
		{
			Node h = head;
			int retVal = h.data;
			while(null != h.next )
			{
				if(h.next.next == null)
				{
					retVal = h.next.data;
					break;
				}
				else
				{
					h = h.next;
					retVal = h.data;
					
				}
				
			}
			h.next = null;
			return retVal;
		}
		return null;
	}
	//return element at given index
	public int get(int index)
	{
		int data;
		Node h = head;
		if(index == 0)
		{
			return head.data;
		}
		else
		{
			for(int i =1 ;i<=index ;i++)
			{
				h = h.next;
			}
			return h.data;
		}
	}
	
	//search given element and return index where element present
	public void search(int data)
	{
		boolean found = false;
		String at = "" ;
		Node h = head;
		int index=-1;
		while(null != h)
		{
			index++;
			if(data == h.data)
			{
				found = true;
				at = at + "    " +index;
			}
				h = h.next;
		}
		if(found)
			{
				System.out.println("element found at index(s) "+ at);
			}
			else
				System.out.println("element not there");
	}
}
