package kodlamaOdevi;

public class Main {

	public static void main(String[] args) {
	
		Student student = new Student();
		student.setId(1);
		student.setFirsname("Refika");
		student.setLastname("Arslan");
		student.setStudentCourse("JAVA-REACT");
		
		Instructor ınstructor = new Instructor();
		ınstructor.setId(2);
		ınstructor.setFirsname("Engin");
		ınstructor.setLastname("Demiroğ");
		
		
		
		User[] users= {student, ınstructor};
		
		UserManager userManager = new UserManager();
		userManager.multiAdd(users);
		
	
		
		
	}

}
