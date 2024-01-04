package TeamHw1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class DataClass {

	private String word,wdClass; // 단어, 품사
	
	private String def; // 뜻
	
	private int num; // 뜻이 여러개인 경우를 대비해 숨기기 위한 번호
	
	
	// 단어 객체의 word와 입력한 word의 동일 여부 판단 메서드
	private boolean equals(String word) {
		return this.word.equals(word);
	}
}
