class Stack{
	private int array[];
	private int nextIndex = 0;
	
	Stack(int size){
		array=new int[size];
	}
	
	public void push(int a){
		array[nextIndex++]=a;
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(10);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
	}
}
