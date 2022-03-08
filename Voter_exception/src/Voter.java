
public class Voter {
	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public Voter(String name, int age)throws Voter_exception {
		super();
		this.name = name;
		this.age = age;
		if(age<18)
		{
			throw new Voter_exception("Age is "+age+", and your not eligible for voting");
		}
	

	}
}
