class Stack{
	private int array[];
	private int nextIndex = 0;
	
	Stack(int size){
		array=new int[size];
	}
	
	private boolean isEmpty(){
		return nextIndex==0;
	}
	
	private boolean isFull(){
		return nextIndex>=array.length;
	}
	
	public void push(int a){
		if(!isFull()){
			array[nextIndex++]=a;
		}else{
			System.out.println("Stack is full...");
		}
	}
	
	public void printStack(){
		System.out.print("[");
		for(int i=nextIndex-1;i>=0;i--){
			System.out.print(array[i]+", ");
		}
		System.out.println(nextIndex==0?"empty]":"\b\b]");
	}
	
	public void pop(){
		if(!isEmpty()){
			array[--nextIndex]=0;
		}else{
			System.out.println("Stack is empty...");
		}
	}
	
	public int size(){
		return nextIndex;
	}
	
	public void clear(){
		nextIndex=0;
	}
	
	public int peek(){
		return isEmpty()? -1 : array[nextIndex-1];
	}
	
	public int poll(){
		return isEmpty()? -1 : array[--nextIndex];
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(10);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		s1.printStack(); //[60, 50, 40, 30, 20, 10]
		
		int topElement=s1.peek();//return the top element (last inserted) of the stack
		System.out.println("Top element : "+topElement);//60
		System.out.println("After calling peek()...");
		s1.printStack(); //[60, 50, 40, 30, 20, 10]
		
		topElement=s1.poll(); //returns and remove the top element of the stack
		System.out.println("Top element : "+topElement); //60
		System.out.println("After calling poll()....");
		s1.printStack(); //[50, 40, 30, 20, 10]
	}
}
