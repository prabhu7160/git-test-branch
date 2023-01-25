package com.acts;

public class SinglyLinkedList 
{
  private Node head=null;

  public void addAtStart(int data) {
	  
	  if (head==null)
	  {
		  Node newNode = new Node();
		  newNode.data=data;
		  newNode.next=null;
		  head=newNode;
	  }
	  else
	  {
		  Node newNode=new Node();
		  newNode.data=data;
		  newNode.next=head;
		  head=newNode;
	  }
  }
  
  public void deleteAtStart() {
	  Node traverse;
	  if(head == null) {
		  System.out.println("List Is Empty");
	  } else {
		  traverse = head;
		  head = traverse.next;
		  System.out.println("Element Deleted SuccessFully");
	  }
  }
  
  public void addAtEnd(int data)
  {
	  Node traverse;
	  traverse=head;
	  if (head==null)
	  {
		  addAtStart(data);
	  }
	  else
	  {
		  while (traverse.next!=null)
		  {
			  traverse=traverse.next;
		  }
		   Node newNode=new Node();
		   traverse.next=newNode;
		   newNode.data=data;
		   newNode.next=null;
	  }
  }
  
  public void traverse() {
	  Node traverse=head;
	  while (traverse!=null)
	  {
		  System.out.println(traverse.data);
		  traverse=traverse.next;
	  }
  }
  
  public int search(int num)
  {
	  Node traverse=head;
	  int i=0;
	  while (traverse!=null)
	  {
		  if (traverse.data==num)
		  {
			  return i;
		  }
		  i++;
		  traverse=traverse.next;
	  }
	  return -1;
  }
}
