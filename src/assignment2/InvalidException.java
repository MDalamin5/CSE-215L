package assignment2;

public class InvalidException {
	
	int marks;
	
	public InvalidException(int a) {
		marks = a ;
		
	}

	@Override
	public String toString() {
		return "InvalidException [marks=" + marks + "]";
	}

}
