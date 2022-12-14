import java.util.*;
class Stack{
	private Node top;
	
	public void push(int data){
		Node n1 = new Node(data);
		n1.next=top;
		top=n1;
	}
	
	public void printStack(){
		Node temp = top;
		System.out.print("[");
		while(temp != null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(top==null?"empty]":"\b\b]");
	}
	
	public boolean isEmpty(){
		return top==null;
	}
	
	public int size(){
		int count=0;
		Node temp=top;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public void pop(){
		if(!isEmpty()){
			top=top.next;
		}else{
			System.out.println("Stack is empty!");
		}
	}
	
	public int[] toArray(){
		int[] ar=new int[size()]; 
		int count=0;
		Node temp = top;
		while(temp!=null){
			ar[count++]=temp.data;
			temp=temp.next;
		}
		return ar;
	}
	
	public void clear(){
		top=null;
	}
	
	//------"Node" Inner class--------
	class Node{
		private int data;
		private Node next;
		
		private Node(int data){
			this.data=data;
		}
	}
}

class Demo{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.printStack(); //[empty]
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.printStack(); //[50, 40, 30, 20, 10]
		int[] ar=s1.toArray();
		System.out.println(Arrays.toString(ar));
		s1.clear();
		s1.printStack(); //[empty]
	}
}
