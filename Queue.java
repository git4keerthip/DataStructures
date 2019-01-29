package com;
/**
 * QUEUE implementation using Linked List
 * 		FIFO/LILO
 * 	insert from top
 * |		|
 * |----f---| <---rear
 * |----e---|
 * |----d---|
 * |----c---|
 * |----b---|
 * |----a---| <---front
 * remove from below
 */
public class Queue {
	int rear =-1;//points to recent elements in queue
	int size =-1;
	int front =-1;//points to first element in queue
	int max ;
	LinkedList ll;
		Queue(int maxsize)
		{
			this.max=maxsize;
			 ll = new LinkedList();
		}
		//insert element from front
		public void enqueue(int a)
		{
			if(size >= max)
			{
				System.out.println("Queue Overflowed");
			}
			else
			{
				size++;
				ll.addAtFront(a);
				rear = ll.topFront(); 
				front=ll.topBack();
			}
		}
		public int getSize() 
		{
			return size+1;
		}
		///remove element from back or opposite side
		public Integer dequeue()
		{
			int data ;
			if(size == -1)
			{
				System.out.println("queue underflowed");
				return null;
			}
			
			else
			{
				size--;
				data=ll.removeBack();
				rear = ll.topFront(); 
				front=ll.topBack();
				return data;
			}
		}
	//get element at given index
	public Integer get(int index)
	{
		return ll.get(index);
		
		
	}
	
	
	
	
	
	
	

}
