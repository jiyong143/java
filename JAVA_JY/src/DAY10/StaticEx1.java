package DAY10;

public class StaticEx1 {

	public static void main(String[] args) {
		kiaCar c1 = new kiaCar("모닝");
		kiaCar c2 = new kiaCar("레이");
		kiaCar c3 = new kiaCar("k3");
		
		c1.brand = "기아";
		c2.brand = "기아";
		c3.brand = "기아";		
		c1.print();
		c2.print();
		c3.print();
		
		System.out.println("---------");
		
		
		kiaCar2 c4 = new kiaCar2("모닝");
		kiaCar2 c5 = new kiaCar2("레이");
		kiaCar2 c6 = new kiaCar2("k3");
		
		
		
		kiaCar2.brand = "기아"; //  클래스 이름으로 접근
		
		c4.print();
		c5.print();		
		c6.print();
		
		
				
	}
	
}



class kiaCar{
	public String brand = "KIA";
	public String name; // 차명
	
	public kiaCar(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(brand);
		System.out.println("차명 :" + name);
	}
	
	
}


class kiaCar2{
	public static String brand = "KIA";
	public String name; // 차명
	
	public kiaCar2(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(brand);
		System.out.println("차명 :" + name);
	}
	
}











