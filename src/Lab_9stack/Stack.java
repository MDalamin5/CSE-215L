package Lab_9stack;

public class Stack {
	
	int [] stack = new int[5];
	
	int top=0;
	
	public void push(int data)
	{
		if(top==5)
		{
			System.out.println("Stack is full ");
		}
		else
		{
			stack[top]=data;
			top++;
		}
	}
	
	public int pop()
	{
		int data=0;
		if(isEmpty())
		{
			System.out.print("Stack is empty ");
			
		}
		else
		{
			top--;
			
			data=stack[top];
			stack[top]=0;
			
		}
		return data;
	}
	
	public int peek()
	{
		int data;
		data = stack[top-1];
		return data;
	}
	
	public void size()
	{
		System.out.println(top);
	}
	
	public boolean isEmpty()
	{
		if(top<=0)
		{
			return true;
		}
		else
			return false;
	}
	
	public void show()
	{
		for(int x:stack)
		{
			
			System.out.print(x+" ");
		}
	}
	
	
	

	
}
