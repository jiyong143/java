package DAY10.word;

import java.util.Scanner;

// word 클래스 만들기
public class Word {
	
	// 멤버 변수
	
	private static int count =0; // 현재 단어장 단어 개수
	private int num;// 단어 번호
	private String kind; //품사
	private String word; // 영어 단어
	private String mean; // 단어 의미(한국어)
	private String ex; // 단어가 쓰인 문장 예시
	
	// 메서드
	
	
	
	// 단어장 목록 출력 메서드(번호, 단어, 의미 만 출력)
	
	public void printWord() {
		System.out.println("---------");
		System.out.println(num + " . ");
		System.out.println(word + " ");
		System.out.println(mean + " ");
		System.out.println("---------");		
	}
	
	
	// 단어장 세부 출력 메서드(전부 다 출력)
	
	public void printWordDetail() {
		System.out.println("---------");
		System.out.println(num + " . ");
		System.out.println(kind + " ");
		System.out.println(word + " ");
		System.out.println(mean + " ");
		System.out.println(ex + " ");
		System.out.println("---------");
		
	}
	
	// 단어장 수정 메서드 (단어와 의미만 수정)
	
    public void update(String word, String mean) {
		
		this.word=word;
		this.mean =mean;
				
	}


    // getter, setter 메서드
    
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public String getMean() {
		return mean;
	}


	public void setMean(String mean) {
		this.mean = mean;
	}


	public String getEx() {
		return ex;
	}


	public void setEx(String ex) {
		this.ex = ex;
	}

	
	
	// 생성자 만들기

	public Word(String kind, String word, String mean, String ex) {
		super();
		this.num = count++;
		this.kind = kind;
		this.word = word;
		this.mean = mean;
		this.ex = ex;
	}
    
	
	

}

