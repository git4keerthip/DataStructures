package com;

public class StackArray<T> {
	int size;
	T[] ary;
	public StackArray(int size)
	{
		ary =(T[])new Object[size];
		this.size=size;
		pointer =-1;
	}
	private int pointer;
	boolean isEmpty()
	{
		return pointer<0;
	}
	boolean isFull()
	{
		return (pointer==(size-1));
		
	}
	public T peak()
	{
		if(!isEmpty())
			return ary[pointer];
		else
			return null;
		
	}
	public void push(T dat) throws Exception
	{
		if(isFull())
		{
			throw new Exception();
		}
		else
		{
			pointer++;
			ary[pointer]=dat;
		}
		
	}
	public T pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception();
		}
		else
		{
			pointer--;
			System.out.println( ary[pointer+1]);
			return ary[pointer+1];
		}
	}

}
