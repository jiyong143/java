package DAY11.product;

public class Product {
	
	// 멤버 변수
	
	private String name;// 제품명
	private String where;// 제품 구매한 곳
	private int num;// 제품 번호
	private int cost; // 제품 가격
	private int number; // 제품 수량
	private static int count =0; // 현재 제품 목록의 개수
	
	// 메서드
	
	
	//  제품 정보 출력 메서드
	public void printInfo() {
		System.out.println((num+1) + " . ");// 제품 번호
		System.out.println("제품 이름 : " + name + " ");
		System.out.println("제품 가격 : " + cost + " ");
		System.out.println("제품 수량 : " + number + " ");		
		System.out.println("제품 출처 : " + where + " ");
	}

	
	// setter, getter 메서드
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	// update 메서드 (가격 수정) 이것은 setCost() 와 같다
	
	public void update(int updatecost) {
		this.cost= updatecost;
	}
	
	

	// 생성자 : 제품 이름, 가격, 수량 , 출처 초기화 하는 생성자

	public Product(String name, int cost, int number, String where) {
		super();
		
		this.num = count++;
		this.name = name;
		this.where = where;
		this.cost = cost;
		this.number = number;
	}
	

}
