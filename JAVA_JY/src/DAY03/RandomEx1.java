package DAY03;

public class RandomEx1 {

	public static void main(String[] args) {
		//min ~max 사시의 랜덤한 수를 생성하는 예제
		
		System.out.println(Math.random());// 0이상 1 미만의 랜덤한 실수를 만들어 줌
		
		int min = 1, max = 10;
		int r = (int)(Math.random( )*(max-min+1)+min); // 1과 10 사이의 임의의 수
		System.out.println("1과 10 사이의 임의의 수 : " + " " + r);
		}
		}


