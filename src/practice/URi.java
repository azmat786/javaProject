package practice;

import java.net.URI;
import java.net.URISyntaxException;

public class URi {

	public static void main(String[] args) {
		try {
			URI uri = new URI("http://khan.com");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("i m alive");

	}

}
