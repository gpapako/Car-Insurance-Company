

public class User {
	String role;
	String name;
	String surname;
	String username;
	String password;
        
	
        
	public User(String role, String name, String surname, String username, String password){
		this.role = role;
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
	}
        
        
        public User(){
            
        }
	
	public String getrole(){
		return this.role;
	}
        
        public String getname(){
		return this.name;
	}
        
        public String getsurname(){
		return this.surname;
	}
	
	public String getusername(){
		return this.username;
	}

	public String getpassword(){
		return this.password;
	}
        
        public boolean login(String username, String password) {
            boolean val= (this.username.equals(username)) && (this.password.equals(password));
            if (val)
                System.out.println("Login successful!");
            else
                System.out.println("Login failed!");
            return val;
        }

}
