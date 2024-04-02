package kr.kh.spring.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardVO {

	private int bo_num;
	private int bo_ca_num;
	private String bo_title;
	private CategoryVO category;
	
	
}
