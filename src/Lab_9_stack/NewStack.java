package Lab_9_stack;

public class NewStack {
	
	private int stackSize;
	private char[] ch;
	private int top;
	
	
	
	NewStack(int size)
	{
		stackSize=size;
		ch= new char[stackSize];
		top=0;
	}
	
	public void push(char item)
	{
		ch[top]=item;
		top++;
	}
	
	public char pop()
	{
		
		//char item='0';
		char item=ch[--top];
		ch[top]='\0';
		return item;
		
	}
	
	public char peek()
	{
		char item;
		item=ch[top-1];
		return item;
	}
	
	
	public boolean isStackEmpty()
	{
		if(top<=0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFullStack()
	{
		if(top==stackSize)
		{
			return true;
		}
		else 
			return false;
	}
	
	
	
}
