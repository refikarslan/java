package kodlamaOdevi;

public class Main {

	public static void main(String[] args) {
	
		Student student = new Student();
		student.setId(1);
		student.setFirsname("Refika");
		student.setLastname("Arslan");
		student.setStudentCourse("JAVA-REACT");
		
		Instructor �nstructor = new Instructor();
		�nstructor.setId(2);
		�nstructor.setFirsname("Engin");
		�nstructor.setLastname("Demiro�");
		
		
		
		User[] users= {student, �nstructor};
		
		UserManager userManager = new UserManager();
		userManager.multiAdd(users);
		
	
		
		
	}

}
