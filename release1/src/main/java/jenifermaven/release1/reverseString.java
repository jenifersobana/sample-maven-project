import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		String originalStr =userInput.nextLine();
		    String reversedStr = "";
		    System.out.println("Original string: " + originalStr);
		        
		    for (int i = 0; i < originalStr.length(); i++) {
		    	reversedStr= originalStr.charAt(i)+reversedStr;
		    }
		    
		    System.out.println("Reversed string: "+ reversedStr);
	}

}

