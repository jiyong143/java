package word;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

// 영어 단어의 뜻을 의미하는 클래스, 품사와 뜻을 멤버로 가짐

@Data
@AllArgsConstructor
public class Mean implements Serializable{

	// 직렬할 때 serialVersionUID가 일치
	
	
	private static final long serialVersionUID = -733749414075414215L;

	private String partOfSpeech; // 품사
	
	private String mean; // 뜻

	// [명사] 사과 형태로 출력하기 위해 재정의
	@Override
	public String toString() {
		return "[" + partOfSpeech + "]"+mean;
	}

	public Mean(String mean) {	
		this.mean = mean;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mean other = (Mean) obj;
		return Objects.equals(mean, other.mean);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mean);
	}


}
