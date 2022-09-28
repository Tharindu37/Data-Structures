class Queue{
	private Node front;
	
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
	}
}
