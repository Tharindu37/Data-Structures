class Stack{
	private Node top;
	
	public void push(int data){
		Node n1 = new Node(data);
		n1.next=top;
		top=n1;
	}
}
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(); //Step 1
		s1.push(10); //Step 2
		s1.push(20); //Step 3
		s1.push(30); //Step 4
		s1.push(40); //Step 5
	}
}
