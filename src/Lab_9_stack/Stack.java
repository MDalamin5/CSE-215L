package Lab_9_stack;

public class Stack {
	
	String str;
	char[] ch= new char[5];
	int top=0;
	
	Stack()
	{
		
	}
	Stack(String str)
	{
		this.str=str;
	}
	
	
	
	public void push(String str)
	{
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='(' )
			{
				ch[top]=str.charAt(i);
				top++;
			}
			
			if(str.charAt(i)==')' )
			{
				
			}
			
			
			
		}
	}
	
	
	
	public char pop()
	{
		char c;
		top--;
		c=ch[top];
		ch[top]='\0';
		
		return c;
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
	
}




