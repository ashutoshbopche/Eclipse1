import java.util.Scanner;

public class Voter_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Voter v1 = new Voter("ashu", 12);
		System.out.println("Your age is "+v1.getAge()+" your allowed to vote");
		}
		catch(Voter_exception v) {
			v.printStackTrace();
		}
		//v1.check_age(a);
		
		
		
	}

}
