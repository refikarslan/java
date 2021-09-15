package kodlamaOdevi;

public class Main {

	public static void main(String[] args) {
	
		Student student = new Student();
		student.setId(1);
		student.setFirsname("Refika");
		student.setLastname("Arslan");
		student.setStudentCourse("JAVA-REACT");
		
		Instructor ýnstructor = new Instructor();
		ýnstructor.setId(2);
		ýnstructor.setFirsname("Engin");
		ýnstructor.setLastname("Demiroð");
		
		
		
		User[] users= {student, ýnstructor};
		
		UserManager userManager = new UserManager();
		userManager.multiAdd(users);
		
	
		
		
	}

}
