class Stack{
	private int array[];
	private int nextIndex = 0;
	
	Stack(int size){
		array=new int[size];
	}
	
	public void push(int a){
		array[nextIndex++]=a;
	}
	
	public void printStack(){
		System.out.print("[");
		for(int i=nextIndex-1;i>=0;i--){
			System.out.print(array[i]+", ");
		}
		System.out.println(nextIndex==0?"empty]":"\b\b]");
	}
	
	public void pop(){
		array[--nextIndex]=0;
	}
	
	public int size(){
		return nextIndex;
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(10);
		System.out.println("Size of the stack :"+s1.size());//0
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.printStack();//[50, 40, 30, 20, 10]
		
		s1.pop();
		s1.printStack();//[40, 30, 20, 10]
		System.out.println("Size of the stack :"+s1.size());//4
	}
}
