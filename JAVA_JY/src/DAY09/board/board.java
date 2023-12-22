package DAY09.board;

public class board {
	
	// 정보(멤버 변수) : 게시일, 제목, 내용, 작성자, 조회수, 게시물 번호
	
	
	private static int count =0;
	private int num;
	private String title;
	private String contents;
	private String date;
	private String writer;
	private int views;

	
	
	
	
	
	// 기능 
	
	
	
	// 게시글 정보 출력(목록 조회) 메서드, 게시글 정보 출력(상쇄 조회) 메서드 , getter와 setter, 게시글 수정 메서드

	
	
	
	// 게시글 정보 출력(목록 조회) 메서드
	
	
	/** 게시글 몰록에서 게시글 정보를 출력하는 메서드
	 * 번호, 제목, 작성일, 작성자, 조회수 순으로 출력
	 */
	
	public void printInfo() {
		System.out.println(num+". ");
		System.out.println(title + " ");
		System.out.println(date + " ");
		System.out.println(writer + " ");
		System.out.println(views + "\n ");
		
		
		
	}
	
	/** 게시글 상세에서 게시글 정보를 자세히 출력하는 메서드
	 * 번호 : num
	 * 제목 : title
	 * 내용 : contents
	 * 일자 : date
	 * 작성자 : writer
	 * 조회수 : views
	 * 순으로 출력
	 */
	
	public void printInfoDetail() {
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + title );
		System.out.println("내용 : " + contents);
		System.out.println("일자 : " + date);
		System.out.println("작성자 : " + writer);
		System.out.println("조회수 : " + views);
		
	}
	
	
	/** 수정할 제목과 내용이 주어지면 게시글의 제목과 내용을 수정하는 메서드
	 * @param title 수정할 제목
	 * @param contents1 수정할 내용
	 */
	
	public void update(String title1, String contents1) {
		
		title = title1;
		contents = contents1;
		
		
		
	}
	
	
	// getter 와 setter 만들기(알아서 만들어줌)
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public int getViews() {
		return views;
	}


	public void setViews(int views) {
		this.views = views;
	}


	public void printList() {
		
	}
	
	
	
	// 생성자 : 게시글 번호, 제목, 내용, 작성자, 게시일이 주어진 생성자
	
	// 생성자도 source 로 만들어줌
	
	public board(String title, String contents, String date, String writer) {
		super();
		this.num = ++count;
		this.title = title;
		this.contents = contents;
		this.date = date;
		this.writer = writer;
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	



