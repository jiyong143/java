package DAY10;

public class SingletonEx1 {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s.getStr());
		s.setStr("abc");
		System.out.println(s.getStr());
		
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s2.getStr());
		s2.setStr("def");
		
		System.out.println(s.getStr());
		
	}

}

class Singleton{
	
	private static Singleton singleton=new Singleton();
	private String str;
	
	private Singleton() {
		str = "Hi";
	}
	
		
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
}
