package DAY01;

public class variable {
 // 문자형 변수 선언 예제
	public static void main(String[] args) {
		/* 변수 선언 방법
		 * 1. 변수를 선언만 함
		 * 변수 타입 변수명;
		 * 2. 변수를 선언하고 초기화 함
		 * 변수타입 변수명 = 값;
		 */
		//문자형 변수 ch1을 선언
		char ch1;
		//문자형 변수 ch2를 선언하고, 문자 A로 초기화
		char ch2 = 'A';
		
		System.out.println(ch1);
		
		// 변수는 초기화하고 사용해야한다
		
		ch1 = 't'
		System.out.println(ch1);
		System.out.println(ch2);
		
		char ch3 = "A";
	   //""은 그 자체가 문자열을 의미한다.
	    char ch4 = '12';		
	   //'' 안에는 한 글자가 들어가야 한다
	    
	    
	   // '' 안에 기본으로 문자 1개 인데, \ u 가  앞에 있으면 유니코드
	    
	    char ch5 = '\u0065';
	    System.out.println(ch5);
	    
	    char ch6 = 65;
	    System.out.println(ch6); // 아스키코드 65에 해당하는 문자
	    
	    // 역슬래시 가 들어간 문자들이 있음 
	    // 예를 들어, \n 은 엔터, \t 은 탭키만큼의 공백
	    // \\ 은 \ 문자 등등
	    
	    char ch7 = '\n';
	    System.out.println(ch7);
	        								
	}

}
