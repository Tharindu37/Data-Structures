class Queue{
	private int[] array;
	private int nextIndex;
	
	Queue(int size){
		array=new int[size];
		nextIndex=0;
	}
	
	public void enQueue(int data){
		array[nextIndex++]=data;
	}
}

class Demo{
	public static void main(String args[]){
		Queue q1=new Queue(10);
		q1.enQueue(10); //s1.push(10)
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
	}
}
