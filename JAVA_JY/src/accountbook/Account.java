package accountbook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import lombok.Data;



@Data
public class Account implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	
	private int month; // 월
	
	private int day; // 일
	
	private List<MoneyIn> moneyInList; // 수입금액과 내역 리스트
	
	private List<MoneyOut> moneyOutList; // 지출 금액과 내역 리스트

	// 생성자 1 : 날짜 생성자
	
	public Account(int month,int day) {
		this.month=month;
		this.day=day;
	}
	
	// 생성자 2 : 날짜, 수입금액, 내역 생성자
	
	public Account(int month, int day , MoneyIn moneyIn) {
		
		this.month=month;
		this.day=day;
		moneyInList= new ArrayList<MoneyIn>();
		moneyInList.add(moneyIn);
	}
	
	
	
	
	// 생성자 4 : 날짜 지출금액, 내역 생성자
	
	
	
     public Account(int month, int day , MoneyOut moneyOut) {
		
		this.month=month;
		this.day=day;
		moneyOutList= new ArrayList<MoneyOut>();
		moneyOutList.add(moneyOut);
	}
     
     
     
     
     // 생성자 6 : 날짜,  수입지출 생성자(m:m)
     
     
     public Account(int month, int day, List<MoneyIn> moneyInList, List<MoneyOut>moneyOutList) {
    	 
    	 this.month=month;
    	 this.day=day;
    	 this.moneyInList=
 				moneyInList != null ? moneyInList : new ArrayList<MoneyIn>();		
    	 this.moneyOutList=
  				moneyOutList != null ? moneyOutList : new ArrayList<MoneyOut>();		
    	  	 
     }
     
       
     // 생성자 7: 날짜, 수입지출 생성자(1:1)
     
     public Account(int month, int day, MoneyIn moneyIn, MoneyOut moneyOut) {
    	 
    	 this.month=month;
    	 this.day=day;
    	 moneyInList= new ArrayList<MoneyIn>();
 		 moneyInList.add(moneyIn);
 		 moneyOutList= new ArrayList<MoneyOut>();
		 moneyOutList.add(moneyOut);   	 
     }
     
     
     
     // 생성자 8: 날짜, 수입지출 생성자(1:m)
     
     public Account(int month, int day, MoneyIn moneyIn, List<MoneyOut> moneyOutList ) {
    	 
    	 this.month=month;
    	 this.day=day;
    	 moneyInList= new ArrayList<MoneyIn>();
 		 moneyInList.add(moneyIn);
 		 this.moneyOutList=
  				moneyOutList != null ? moneyOutList : new ArrayList<MoneyOut>();
 		 
     }
     
     
     // 생성자 9 : 날짜, 수입지출 생성자(m:1)
     
     public Account(int month, int day,List<MoneyIn> moneyInList, MoneyOut moneyOut ) {
    	 
    	 this.month=month;
    	 this.day=day;
    	 this.moneyInList=
  				moneyInList != null ? moneyInList : new ArrayList<MoneyIn>();
    	 moneyOutList= new ArrayList<MoneyOut>();
		 moneyOutList.add(moneyOut); 
    	 
     }
     
     // 생성자 : 날짜, 여러 수입 혹은 지출
     
     public Account(int month, int day, List<MoneyIn> moneyList ) {
    	 
    	 this.month=month;
    	 this.day=day;
    	 
    	 
    	 
     }
	
	
	
	
	// 날짜가 같으면 같은 내역으로 판별하기 위해 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return month == other.month && day == other.day;
	}

	@Override
	public int hashCode() {
		return Objects.hash(month, day);
	}
	
	// 날짜와 수입 지출 리스트를 출력하는 메서드
	
	public void printAccount() {
		System.out.println("날짜 : " + month + "월" + day + "일");
		if(moneyInList==null||moneyInList.size()==0){
			System.out.println("등록된 수입 내역이 없습니다.");
			return;
		}
		for(int i =0; i<moneyInList.size();i++) {
			System.out.println(i+1+"."+moneyInList.get(i));
		}
		
		System.out.println("--------------");
		
		if(moneyOutList==null||moneyOutList.size()==0) {
			System.out.println("등록된 지출 내역이 없습니다.");
		}
		
		for(int i=0; i<moneyOutList.size();i++) {
			System.out.println(i+1+"."+moneyOutList.get(i));
		}
		
	}
	
	
	// 새로운 수입 내역을 추가하는 메서드
	
	public boolean addInAccount(int moneyIn, String memo) {
		
		if(moneyInList==null) {
			return false;
		}
		
		if(moneyInList.contains(new MoneyIn(memo))) {
			return false;			
		}
		
		moneyInList.add(new MoneyIn(moneyIn,memo));
		return true;				
	}
	
	
	// 새로운 수입 내역을 여러개 추가하는 메서드
	
	public void addInAccounts(List<MoneyIn>newMoneyInList) {
		
		if(moneyInList==null) {
			moneyInList=newMoneyInList;
			return;
		}
		
		moneyInList.addAll(newMoneyInList);
		
	}
	
	
	
	// 새로운 지출 내역을 여러개 추가하는 메서드
	
	public void addOutAccounts(List<MoneyOut>newMoneyOutList) {
		if(moneyOutList==null) {
			moneyOutList=newMoneyOutList;
			return;
		}
		moneyOutList.addAll(newMoneyOutList);
	}
	
	
	
	// 새로운 지출 내역을 추가하는 메서드
	
	public boolean addOutAccount(int moneyOut,String memo) {
		
		if(moneyOutList==null) {
			return false;
		}
		
		if(moneyOutList.contains(new MoneyOut(memo))) {
			
			return false;
			
		}
		moneyOutList.add(new MoneyOut(moneyOut,memo));
		return true;
		
	}
	
	//  수입내역을 수정하고 금액을 수정하는 메서드
	
	public boolean setInAccount(int pos, int moneyIn, String memo) {
		
		if(moneyInList==null) {
			return false;
		}
		
		if(pos<0||pos>moneyInList.size()) {
			
			return false;
		}
		
		if(moneyInList.contains(new MoneyIn(memo))) {
			return false;
		}
		
		moneyInList.set(pos,new MoneyIn(moneyIn,memo));
		return true;
		
	}
	
	// 지출내역을 수정하고 금액을 수정하는 메서드
	
	public boolean setOutMoney(int pos, int moneyOut, String memo) {
		
		if(moneyOutList==null) {
			return false;
		}
		if(pos<0||pos>moneyOutList.size()) {
			return false;
		}
		moneyOutList.set(pos,new MoneyOut(moneyOut,memo));
		return true;
	}
	
	
	// 수입 내역을 삭제하는 메서드
	
	public boolean removeInAccount(int pos) {
		
		if(moneyInList==null) {
			return false;			
		}
		
		if(pos<0||pos>moneyInList.size()) {
			return false;
		}
		moneyInList.remove(pos);
		return true;
	}
	
	// 지출 내역을 삭제하는 메서드
	
	public boolean removeOutAccount(int pos) {
		
		if(moneyOutList==null) {
			return false;
		}
		if(pos<0||pos>moneyOutList.size()) {
			return false;
		}
		moneyOutList.remove(pos);
		return true;
	}

	
	
	
}
