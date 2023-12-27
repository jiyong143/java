package DAY13;

import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {
		
		/* ^[abc]$
		 * 
		 */
		String str ="";
		String regex = "^[a-zA-Z]{3}$";
		
		if(Pattern.matches(regex,str)) {
			System.out.println("영문자이고 3자입니다.");
		}else {
			System.out.println("영문자가 아니거나 3자가 아닙니다.");
		}

	}

}
