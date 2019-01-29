package com;

import java.util.LinkedList;

public class Graph<T> {
	int vertix;
	
	LinkedList<T> adjacencyList[];
	public Graph(int v)
	{
		vertix = v;
		adjacencyList = new LinkedList[v];
		for(int i =0;i<v;i++)
		{
			adjacencyList[i] = new LinkedList<>();
		}
	}
	public void addEdj(int v , T u)
	{
		adjacencyList[v].add(u);
		
	}
	

}
