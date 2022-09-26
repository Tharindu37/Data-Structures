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
		s1.push(70);
		s1.push(80);
		s1.push(90);
		s1.push(100);
		s1.printStack(); //[100, 90, 80, 70, 60, 50, 40, 30, 20, 10]
		System.out.println("Size of the stack :"+s1.size());//10
		s1.push(111); //Prints "Stack is full....."
		
		s1.clear();
		s1.printStack();//[empty]
		s1.pop(); //Prints "Stack is empty..."
	}
}
