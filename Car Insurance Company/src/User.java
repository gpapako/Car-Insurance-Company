
import static java.lang.System.out;
import java.util.Scanner;



public class User {
	String role;
	String name;
	String surname;
	String username;
	String password;
        boolean val;
	
        
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
            val= (this.username.equals(username)) && (this.password.equals(password));
            if (val)
                System.out.println("Login successful!");
            else
                System.out.println("Login failed!");
            return val;
        }
        
        public void register(){
        
        Scanner input = new Scanner(System.in);
        
	//User Papakwstas = new User();
        out.println("Give role");
        this.role = input.next();
        out.println("Give name");
        this.name = input.next();
        out.println("Give surname");
        this.surname = input.next();
        out.println("Give username");
        this.username = input.next();
        out.println("Give password");
        this.password = input.next();
        
        input.close();
}
}
