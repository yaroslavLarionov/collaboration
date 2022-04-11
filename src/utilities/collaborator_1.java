
public class collaborator_1 {
	public static void main(String[] args) {
		
		String str = "JAVA";
		String revStr = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		System.out.println("Original string is: " + str);
		System.out.println("Reversed string is: " + revStr);
	}

}
