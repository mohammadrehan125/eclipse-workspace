package Inheritance28;

public class parentChildClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent p = new parent();
		child c = new child();
		
		System.out.println("*******case 1 ********");

		parent obj1 = new parent();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
	//  System.out.println(obj1.d2);
		obj1.fun();
		obj1.fun1();
	//	obj1.fun2();
		
		System.out.println("*******case 2 ********");

		parent obj2 = new child();
		System.out.println(obj2.d); // parent
		System.out.println(obj2.d1);// parent
	//  System.out.println(obj1.d2);
		System.out.println(((child)obj2).d2);
		obj2.fun(); //child class
		obj2.fun1(); // parent class
	//	obj2.fun2();
		((child)obj2).fun2();
		
// ye chlega hi nii	
//		System.out.println("*******case 3 ********");
//
//		child obj3 = new parent();
//		System.out.println(obj2.d); // parent
//		System.out.println(obj2.d1);// parent
//	//  System.out.println(obj1.d2);
//		System.out.println(((child)obj2).d2);
//		obj2.fun(); //child class
//		obj2.fun1(); // parent class
//	//	obj2.fun2();
//		((child)obj2).fun2();
		
		System.out.println("*******case 4 ********");

		child obj4 = new child();
		System.out.println(((parent)obj4).d); // parent  child
		System.out.println(obj4.d1);// parent
	    System.out.println(obj4.d2);// child
		obj4.fun(); //child class
		obj4.fun1(); // parent class
		obj4.fun2(); // child
		
		
	}

}
