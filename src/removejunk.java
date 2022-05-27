
public class removejunk {

	public static void main(String[] args) {
	
		   String s="*&^&$*&^$%&^(*&)*_(  (^&^$# kirtishil ^*%&$& 1479968676 mansi)**$^$#%$&%*&%";
		   s=s.replaceAll("[^a-z  A-Z  0-9 ]","");
		   System.out.println(s);

	}

}
