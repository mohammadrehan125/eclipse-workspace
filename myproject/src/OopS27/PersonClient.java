package OopS27;

public class PersonClient {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		System.out.println("start");
		
		System.out.println(Person.i);
		
		Person p = new Person();
		
		Person p2 = new Person();
		
		Person p3 = new Person();
		
		System.out.println("Hello");
		
		//
		p.setAge( 10);
		p.setName("Ram");
		

		System.out.println(p.getName()+"  "+p.getAge());
		
		//Person p1 = new Person("Sid",-15);
		//Person p1 = new Person("Sid",-15);
		System.out.println("Bye");
	}

}
