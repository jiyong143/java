package kr.kh.spring.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostVO {
	
	private int po_num;
	private String po_title;
	private String po_content;
	private Date po_date;
	private int po_views;
	private int po_bo_num;
	private String  po_me_id;
	private String po_me_name;
	private String po_bo_name;
	
	// 게시글의 날짜를 이쁘게 반환하는 메서드
	public String changeDate() {	
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return  format.format(this.po_date);	
	}


}


