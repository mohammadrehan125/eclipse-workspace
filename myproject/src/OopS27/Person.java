package OopS27;

public class Person {
	
	private String name;
	private int age;
	static int i ;
	
	// init block
	{
		System.out.println("In init block ");
	}
	
	
	static
	{
		
		System.out.println("In static block ");
		i = 10;
	}

	
	public  Person()
	{
		System.out.println("In Default Constructor");
	}
	
//	public  Person(String name,int age)
//	{
//		this. name = name;
//		this.age = age;
//		
//		
//	}
//	public  Person(String name,int age)throws Exception
//	{
//		setName(name);
//		setAge(age);
//		System.out.println("In parameterized ");
//		
//		
//	}

//	public  Person(String name,int age)
//	{
//		try
//		{
//			setName(name);
//			setAge(age);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		System.out.println("In parameterized");
//		
//	}
	// hamesha chlega chahe exception aaye ya na aaye
	public  Person(String name,int age)
	{
		try
		{
			setName(name);
			setAge(age);
			return ;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("In finally ");
		}
		System.out.println("In parameterized");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// 1
//	public void setAge(int age) {
//		if(age < 0|| age>100)
//		{
//			System.out.println("Invalid age. Settingage to 0");
//			age = 0;
//		}
//		this.age = age;
//	}

	// 2
//	public void setAge(int age)throws Exception {
//		if(age < 0|| age>100)
//		{
//			throw new Exception("Invalid age.");
//		}
//		this.age = age;
//	}
// try catch
//	public void setAge(int age)throws Exception
//	{
//		try {
//		
//				if(age < 0|| age>100)
//				{
//					throw new Exception("Invalid age.");
//				}
//				this.age = age;
//			}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("Done with Age.");
//			
//	}
	
	// without try catch
	public void setAge(int age)throws Exception
	{
		
				if(age < 0|| age>100)
				{
					throw new Exception("Invalid age.");
				}
				this.age = age;
		
			
	}
	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Person.i = i;
	}
	
}
