package Lab_8drop_add;

public class Course {
	
	private String courseName;
	private String student;
	private int numberOfStudent;
	
	int top=0;
	String[] stu = new String[4];
	
	Course(String courseName)
	{
		this.courseName=courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
	
	public void addStudent(String student)
	{
		stu[top]=student;
		top++;
	}
	
	public void dropStudent(String student)
	{
		
	}
	
	public void clear()
	{
		
	}
	
	public void displayStu()
	{
		for(int i=0;i<top;i++)
		{
			System.out.print(stu[i]+" ");
		}
	}

}
