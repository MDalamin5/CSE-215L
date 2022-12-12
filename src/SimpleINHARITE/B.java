package SimpleINHARITE;

public class B extends A{
	
	int k;
	int total;
	B(int a,int b,int c, int k)
	{
		super(a,b,c);
		this.k=k;
	}
	
	void sum()
	{
		total=super.x+super.y+super.z+k;
		System.out.println(total);
	}
	

}
