package OopS26;

public class Constructor {
	String name = "Hello";
	int age = 1;
	
	static int num = 0;
	
	// default orr non parameterized constructor
	public Constructor()
	{
		//constructor chaining
//		name = " ";
//		age = 10;
		// ek constructor ke andr dusre constructor krna
		//constructor chaining
		this("_",10);
		
	}
	
	//Parameterised constructor
	public Constructor(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//copy constructor
	public Constructor(Constructor s)
	{
		this.name = s.name;
		this.age = s.age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor s = new Constructor("Ramesh",21);
		System.out.println(s.name + " " + s.age);
		s.name = "Rehan";
		s.age = 22;
		System.out.println(s.name + " " + s.age);

		Constructor s1 = new Constructor(s);
		System.out.println(s.name + " " + s.age);
		
		Constructor s2 = new Constructor();
		System.out.println(s2.name + " " + s2.age);
	}

}
