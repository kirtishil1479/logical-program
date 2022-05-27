
public class removingwhitespaces {

	public static void main(String[] args) {
		
		String s= "   java    programming      learning in      bhikkad    IT";
		System.out.println("before String :"+s);
		
		s=s.replaceAll("\\s","");
		
		System.out.println("After removing the white spaces:"+s);
				

	}

}
