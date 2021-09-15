package kodlamaOdevi;

public class UserManager {
	public void add(User user){
		System.out.println(user.getFirsname() + " "+user.getLastname() + " eklendi");
	}
	
	public void multiAdd(User[] user){
		 for(User users:user){
			 add(users);
		 }
	}

	
}
