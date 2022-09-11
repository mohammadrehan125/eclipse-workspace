package lecture15;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(3));
		
		// Add
		sb.append(" bye");
		System.out.println(sb);
		
		sb.insert(1, 12);
		System.out.println(sb);
		
		sb.setCharAt(2, 'R');
		System.out.println(sb);
		
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		sb.delete(1,4);
		System.out.println(sb);
		
		//substring function agr stringbuilder me use hoga to ans ek string dega
		String s1 = sb.substring(1,5);
		System.out.println(s1);
		
		//StringBuilder se String me convert
		
		String s2 = sb.toString();
		System.out.println(s2);
		
		
		
	}

}
