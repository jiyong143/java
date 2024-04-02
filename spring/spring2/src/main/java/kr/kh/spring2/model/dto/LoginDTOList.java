package kr.kh.spring2.model.dto;

import java.util.ArrayList;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginDTOList {

	private ArrayList<LoginDTO> list;
	
}
