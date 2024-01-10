package accountbook;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

//지출 금액과 내역을 관리하는 클래스

@Data
@AllArgsConstructor

public class MoneyOut {
	
	
	
	private int moneyOut; // 수입 금액
	
	
	private String memo; // 내역


	@Override
	public String toString() {
		return "[" + moneyOut + "]" + "" + "[" + memo + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoneyOut other = (MoneyOut) obj;
		return Objects.equals(memo, other.memo);
	}


	@Override
	public int hashCode() {
		return Objects.hash(memo);
	}
	
	
	
	
	
	
	

	

}
