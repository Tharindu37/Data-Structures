class Queue{
	private Node front;
	
	
	public void enQueue(int data){
		Node n1=new Node(data);
		if(front==null){
			front=n1;
		}else{
			Node lastNode=front;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=n1;
		}
	}
	
	public void printQueue(){
		Node temp=front;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(front==null?"empty]":"\b\b]");
	}
	//-----"Node" inner class-------
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
		Queue q1=new Queue();
		q1.enQueue(10);
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
		q1.printQueue(); //[10, 20, 30, 40, 50]
	}
}
