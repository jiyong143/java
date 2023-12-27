package DAY13;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "abcde";
		
		System.out.println("1-----------");
		System.out.println(str.charAt(0));
		
		
		System.out.println("2-----------");		
		System.out.println(str.equals("abc"));
		
		
		System.out.println("3-----------");		
		System.out.println(str.equals("abcde"));
		
		
		System.out.println("4-----------");		
		System.out.println(str.indexOf("cd"));
		
		
		System.out.println("5-----------");		
		System.out.println(str.contains("cd"));
		
		
		System.out.println("6-----------");				
		System.out.println(str.length());
		
		
		System.out.println("7-----------");		
		String str2 = str.replace("cd", "aa");
		System.out.println(str);
		System.out.println(str2);
		
		
		System.out.println("8-----------");		
		String str3 = str.substring(1,3);
		System.out.println(str);
		System.out.println(str3);
		
		
		System.out.println("9-----------");		
		String str4 = str.toUpperCase();
		System.out.println(str);
		System.out.println(str4);
		
		
		System.out.println("10-----------");
		String str5 = str.toLowerCase();
		System.out.println(str);
		System.out.println(str5);
		
		
		System.out.println("11------------");		
		String str6 = "\n\nabc\tdef\t\t";
		System.out.println(str6);
		String str7 = str6.trim();
		System.out.println(str7);
		
		
		System.out.println("12------------");
		String fruits ="사과, 배, 오렌지";
		String [] fruitArray = fruits.split(" , ");
		System.out.println(fruits);
		for(String tmp : fruitArray) {
			System.out.println(tmp);
		}		
		
	}

}
