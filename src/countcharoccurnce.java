
public class countcharoccurnce {

	public static void main(String[] args) {
	       
		String s= "java  programming java oops";
		
		int totalcount=s.length();
		int totacount_afterRemove=s.replace("j", "").length();
		
		int count =totalcount-totacount_afterRemove;
		System.out.println("Number occurance of a is :"+count);
		

	}
}
