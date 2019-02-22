import java.util.ArrayList;
import java.util.List;

public class dialogue {
	public static void main(String args[]) {
		String inputString = "DIALOGUE";
		String vowelString = "";
		List<Character> character = new ArrayList<Character>();
		character.add('A');
		character.add('E');
		character.add('I');
		character.add('O');
		character.add('U');
		character.add('a');
		character.add('e');
		character.add('i');
		character.add('o');
		character.add('u');
		for (int counter = 0; counter < inputString.length(); counter++) {
			char ch = inputString.charAt(counter);
			if (character.contains(ch)) {
				vowelString = vowelString + ch;
			}
		}
		String outputString = "";
		int lengthofVowlString = vowelString.length();
		int length = 1;
		for (int counter = 0; counter < inputString.length(); counter++) {
			char ch = inputString.charAt(counter);
			if (character.contains(ch)) {
				outputString = outputString
						+ vowelString.charAt(lengthofVowlString - length);
				length++;
			} else
				outputString = outputString + inputString.charAt(counter);
		}
		System.out.println(outputString + " ");
	}
}