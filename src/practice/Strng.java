package practice;

public class Strng {
	/**
	 * This is main method
	 * @author khan
	 * @param args
	 */
	
	/**
	 * This is String buffer
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "welcome";//immutable object
		StringBuilder sb = new StringBuilder(s);//mutable object
		sb.append("  Home");
		System.out.println(sb);
		String s1 = "welcome";
		StringBuffer sbf = new StringBuffer(s1);//used when multiple thread synchronize
		sbf.append(" Back");
		System.out.println(sbf);
		String s2 =  new String("welcome");
		String s3 =  new String("welcome");
		if(s2.equals(s3)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
