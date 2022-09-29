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
	}
}
