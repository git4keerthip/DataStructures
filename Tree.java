package com;

public class Tree {
///LRN
	public static void postOrder(Node n)
	{
		if(n==null)
			return;
		postOrder(n.left);
		postOrder(n.right);
		if(n.left==null&&n.right==null)
		System.out.println(n.val);
		
	}
	//NLR
	public static void preOrder(Node n)
	{
		if(n==null)
			return;
		System.out.println(n.val);
		preOrder(n.left);
		preOrder(n.right);
	}
	//LNR
	//for binary tree inorder will print nodes in asc sorted data 
	public static void inOrder(Node n)
	{
		if(n==null)
			return;
		inOrder(n.left);
		System.out.println(n.val);
		inOrder(n.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n= new Node(40);
		n.left = new Node(30);
		n.right = new Node(45);
		n.left.left = new Node(25);
		n.left.right= new Node(35);
		n.right.left= new Node(42);
		n.right.right= new Node(70);
		postOrder(n);
	}

}
class Node{
	int val;
	Node right;//greater value then node value
	Node left;//smaller value then node value
	
	public Node(int val)
	{
		this.val= val;
	}
	
}