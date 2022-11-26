package Lab_9_stack;

public class DelimiterMatching {
	
	
	public boolean isDelimiterMactching(String inputExpr)
	{
		
		NewStack obj = new NewStack(inputExpr.length());
		
		char ch,stackPop;
		
		
		for(int i=0;i<inputExpr.length();i++)
		{
			ch=inputExpr.charAt(i);
			
			switch(ch)
			{
			case '(':
			case '{':
			case '[':
				obj.push(ch);
				break;
				
			case ')':
			case '}':
			case ']':
				if(!obj.isStackEmpty())
				{
					stackPop=obj.pop();
					if((ch==')' && stackPop != '(') ||
							(ch=='}' && stackPop != '{') ||
							(ch==']' && stackPop != '['))
					{
						System.out.println(inputExpr);
						System.out.println("Mismatch Found: "+ch+" at "+i);
						return false;
					}
				}
				else
				{
					System.out.println("Is not BALANCE");
					return false;
				}
				
				
			}
			
			
			
		}
		
		if(!obj.isStackEmpty())
		{
			System.out.println("Bracker is Missing");
			return false;
		}
		
		
		return true;
	}
}
