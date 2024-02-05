package university;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

// 최지용
@Data
@AllArgsConstructor
public class Professor {
	private int classOf; // 교번
	private String name; //이름
	private String selection; //과
	
	// 생성자
	
	// 교번 초기화 생성자
	
	public Professor(int classOf) {
		this.classOf=classOf;
	}
	
	// 이름 초기화 생성자
	
	public Professor(String name) {
		this.name=name;
	}
	
	// 교번,이름 초기화 생성자
	
	public Professor(int classOf,String name) {
		this.classOf=classOf;
		this.name=name;
	}
	
	
	// 메서드
	
	
	// 교수는 교번이 같아야 같다.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return classOf == other.classOf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(classOf);
	}
	
	
	
	
	
	
	
	
}
