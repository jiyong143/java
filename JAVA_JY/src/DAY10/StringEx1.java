package DAY10;

public class StringEx1 {

	public static void main(String[] args) {
		// 문자열 비교 예제
		String str1 = "abc";
		
		String str2 = "abc";
		
		String str3 = new String("abc");// 생선된 문자열 인스턴스의 주소를 str3에 저장
		
		
		// 참조변수 에서 ==는 주소를 비교
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		
		// 문자열은 equals 라는 메서드를 통해 비교
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));

	}

}
