package Lab_8drop_add;

public class Test {
		public static void main(String[] args) {
			Course ob = new Course("BAN");
			ob.addStudent("ALamin");
			ob.addStudent("toki");
			ob.dropStudent("ALamin");
			ob.displayStu();
		}
}
