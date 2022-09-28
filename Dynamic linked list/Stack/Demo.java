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
		System.out.println("Size of the stack : "+s1.size()); //0
		System.out.println("Stack is empty..: "+s1.isEmpty()); //true
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.printStack(); //[50, 40, 30, 20, 10]
		System.out.println("Size of the stack : "+s1.size()); //5
		System.out.println("Stack is empty..: "+s1.isEmpty()); //false
	}
}
