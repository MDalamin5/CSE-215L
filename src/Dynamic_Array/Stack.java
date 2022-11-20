package Dynamic_Array;

public class Stack {
	
	int capa=2;
int [] stack= new int[capa];
	
	int top=0;
	
	public void push(int data)
	{
		if(size()==capa)
			expand();
		
			stack[top]=data;
			
			top++;
		
	}
	
	private void expand() {
		 int length = size();
		 int [] newStack = new int [capa*2];
		 System.arraycopy(stack, 0, newStack, 0, length);
		 stack=newStack;
		 capa *=2;
		 
		
	}

	public int pop()
	{
		int data=0;
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			top--;
			
			data=stack[top];
			stack[top]=0;
			return data;
		}
		return data;
		
	}
	
	public int peek()
	{
		int data;
		data=stack[top-1];
		return data;
	}
	
	public int size()
	{
		int data;
		data=top;
		return data;
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
		for(int i=0;i<top;i++)
		{
			System.out.print(stack[i]+" ");
		}
	}

}
