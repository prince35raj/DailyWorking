package demo.com;

public class dollar {
	public static void main(String[] args) {

		String s = "$2000";
		String results = s.substring(1, 5);
		int i = Integer.parseInt(results) + 1;
		char c = s.charAt(0);
		String a = Character.toString(c) + Integer.toString(i);
		System.out.println(a);

	}

}
