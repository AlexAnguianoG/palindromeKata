package mx.tec.kata;

public class PalindromeValidator {
	public boolean validate (String str) {
		for( int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;

	}
}
