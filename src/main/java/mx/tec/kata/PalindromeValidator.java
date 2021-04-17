package mx.tec.kata;

public class PalindromeValidator {
	
	public boolean validate (String str) {
		if(str.length() == 1) {
			return true;
		} else if (str.length() == 2 && str.charAt(0) == str.charAt(1)){
			return true;
		} else {
			return false;
		}
	}
}
