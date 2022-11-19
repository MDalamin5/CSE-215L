package Stack;

public class Stack {
	
	int [] stack= new int[5];
	
	int top=0;
	
	public void push(int data)
	{
		stack[top]=data;
		
		top++;
	}
	
	public int pop()
	{
		top--;
		int data=0;
		data=stack[top];
		stack[top]=0;
		return data;
		
	}
	
	public int peek()
	{
		int data;
		data=stack[top-1];
		return data;
	}
	
	public int sizeStack()
	{
		int data;
		data=top;
		return data;
	}
	
	public void show()
	{
		for(int x:stack)
		{
			System.out.print(x+" ");
		}
	}
	
}
