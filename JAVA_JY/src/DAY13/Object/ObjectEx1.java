package DAY13.Object;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

public class ObjectEx1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		A a = new A();
		System.out.println(a.toString());
		
		Student std1= new Student(1,1,1,"홍길동");
		Student std2 = new Student(1,1,1,"임꺽정");
		if(std1.equals(std2)) {
			System.out.println("학년,반,번호가 같습니다");
		}else {
			System.out.println("학년,반,번호가 다릅니다");
		}
		
		A a1 = new A();
		a1.num1=20;
		
		System.out.println(a1);
		
		A a2 = a1;
		
		a2.num1 = 30;
		
		System.out.println(a1);
		
		A a3 = a1.clone();
		
		a3.num2 = 40;
		
		System.out.println(a1);

	}

}

@AllArgsConstructor

class Student{
	int grade,classNum,num;
	String name;
	
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	@Override
	// 같은 인스턴스를 공유하는지 확인(주소를 확인)
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		// 비교 대상이 있는지 없는지 확인
		if (obj == null)
			return false;
		// 다른 클래스의 인스턴스인 경우
		if (getClass() != obj.getClass())
			return false;
		// 다운캐스팅 => 클래스 형변환
		Student other = (Student) obj;
		// 학년, 반 ,번호 가 모두 일치하는지 확인
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	
	
}

@EqualsAndHashCode


class A implements Cloneable{
	
	int num1 =10;
	int num2 =3;
	String name = "테스트";
	@Override
	public String toString() {
		return "A [num1=" + num1 + ", num2=" + num2 + ", name=" + name + "]";
	}
	@Override
	public A clone() throws CloneNotSupportedException{
		return (A) super.clone();
	}
	
}
