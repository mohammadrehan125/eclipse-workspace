package lecture14;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s4 = "hellollollll";

		String s = "abc";
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		s3 = s3+'d';
		
		System.out.println(s3==s);
		System.out.println(s == s1);
		
		System.out.println(s3);
		
		System.out.println(s3.length());
		System.out.println(s3.charAt(1));
		System.out.println((int)s3.charAt(1));
		// character return krega 
		
		System.out.println(s3.substring(0,3));
		//String return krega
		
		System.out.println(s4.substring(1));
		// 1st index se last tk print krr dega
		
		
		System.out.println(s4.indexOf('l'));
		System.out.println(s4.indexOf("ll"));
		System.out.println(s4.indexOf('a'));
		

		System.out.println(s4.lastIndexOf('l'));
		System.out.println(s4.lastIndexOf("ll"));
		System.out.println(s4.lastIndexOf('a'));
		
		System.out.println(s4.startsWith("heo"));
		
		System.out.println(s4.startsWith("el",1));
		//1st index se "el" se start h ki nii
		
		System.out.println(s4.endsWith("llo"));
		
		//concatination
		
		
		
		//comparision
		String a = "xyz";
		String b = "xyz";
		String c = a;
		String d = new String("xyz");
		
		String s5 = a+ false;
		System.out.println(s5);
		
		//equals=== String comparing,,,  == address comparing
		System.out.println((a==d)+" "+(a.equals(d)));
		
		//REPLACE
		System.out.println(a.replace('x', 'r'));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
