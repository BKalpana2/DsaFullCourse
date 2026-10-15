 package com.linkedlist;
 public class DoubleListNode{
	 int val;
	 DoubleListNode prev;
	 DoubleListNode next;
	 public  DoubleListNode(int val) {
		 this.val=val;
		 prev=null;
		 next=null;
	 }
	 public static void main(String[]args) {
		 DoubleListNode l1=new DoubleListNode(7);
		 DoubleListNode l2=new DoubleListNode(5);
		 DoubleListNode l3=new DoubleListNode(6);
		 DoubleListNode l4=new DoubleListNode(8);
		 l1.next=l2;
		 l2.prev=l1;
		 
		 l2.next=l3;
		 l3.prev=l2;
		 
		 l3.next=l4;
		 l4.prev=l3;
		 
		 DoubleListNode temp=l1;
		 while(temp!=null) {
			 System.out.println(temp.val+"->");
			 temp=temp.next;
		 }
		 DoubleListNode ptr=l4;
		 while(ptr!=null) {
			 System.out.println(ptr.val+"->");
			 ptr=ptr.prev;
			 
		 }
		 
	 }
 }