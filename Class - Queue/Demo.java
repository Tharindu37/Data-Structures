class Queue{
	private int[] array;
	private int nextIndex;
	
	Queue(int size){
		array=new int[size];
		nextIndex=0;
	}
	
	public boolean isEmpty(){
		return nextIndex==0;
	}
	
	public void enQueue(int data){
		array[nextIndex++]=data;
	}
	
	public void printQueue(){
		System.out.print("[");
		for(int i=0;i<nextIndex;i++){
			System.out.print(array[i]+", ");
		}
		System.out.println(isEmpty()?"empty]":"\b\b]");
	}
	
	public void deQueue(){
		for(int i=0;i<nextIndex-1;i++){
			array[i]=array[i+1];
		}
		nextIndex--;
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
		q1.printQueue(); //[10, 20, 30, 40, 50]
		
		q1.deQueue();
		q1.printQueue(); //[20, 30, 40, 50, 60]
		q1.deQueue();
		q1.printQueue(); //[30, 40, 50, 60]
	}
}
