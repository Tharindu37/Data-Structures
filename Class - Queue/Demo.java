class Queue{
	private int[] array;
	private int nextIndex;
	
	Queue(int size){
		array=new int[size];
		nextIndex=0;
	}
}

class Demo{
	public static void main(String args[]){
		Queue q1=new Queue(10);
	}
}
