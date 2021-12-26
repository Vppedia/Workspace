package com.topic.linkedList;

class Node
{
  int data;
  
  Node next;
  
  Node(int data)
  {
	  this.data=data;
  }

}


public class InsertIntoBeginSinglyLinkedList {
	
	
	public static void main(String[] args)
	{
        Node head=null;
        
        head= insertAtBegin(head,1);
        head= insertAtBegin(head,2);
        head= insertAtBegin(head,3);
        head= insertAtBegin(head,4);
		
		print(head);
		
	}

	private static Node insertAtBegin(Node head, int i) {
	  
		Node temp=new Node(i);
		
		
		if(head==null)
			return temp;
		
		
		Node curr=head;
		while(curr.next!=null)
			curr=curr.next;
		
		curr.next=temp;
		
		return head;
		
		
	
	}

	private static void print(Node head) {

                
		Node curr=head;
		
		while(curr!=null)
		{
			System.out.println(curr.data+" ");
			
			curr=curr.next;
		}
		
	}
	
	

	

	

}
