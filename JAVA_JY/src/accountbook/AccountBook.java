package accountbook;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

//가계부
@Getter
@ToString
public class AccountBook {

	private List<Account>list; //가계부 리스트
	
	// 가계부 생성자
	
	public AccountBook(List<Account>newList) {
		if(list==null) {
			list=new ArrayList<Account>();
		}
		list=newList;
	}
	
	// 수입 내역 추가 기능
	
	public boolean addInAccount(int month, int day, List<MoneyIn>newMoneyInList) {
		
		if(list==null) {
			return false;
		}
		int index=list.indexOf(new Account(month,day));
		
		if(index<0) {
			
			list.add(new Account(month,day,newMoneyInList));
			return true;
		}
		
		Account selectedAccount = list.get(index);
		
		List<MoneyIn> selectedMoneyInList = selectedAccount.getMoneyInList();
		
		int count= (int) newMoneyInList
				                  .stream()
				                  .filter(m->!selectedMoneyInList.contains(m))
				                  .count();
		
		if(count==0) {
			return false;
		}
		
		newMoneyInList
		           .stream()
		           .filter(m->!selectedMoneyInList.contains(m))
		           .forEach(m->selectedMoneyInList.add(m));
		return true;
	}
	
	// 지출 내역 추가 기능
	
	
	
    /*public boolean addOutAccount(int month, int day, List<MoneyOut>newMoneyOutList) {
		
		if(list==null) {
			return false;
		}
		int index=list.indexOf(new Account(month,day));
		
		if(index<0) {
			
			list.add(new Account(month,newMoneyOutList,day));
			return true;
		}
		
		Account selectedAccount = list.get(index);
		
		List<MoneyOut> selectedMoneyOutList = selectedAccount.getMoneyOutList();
		
		int count= (int) newMoneyOutList
				                  .stream()
				                  .filter(m->!selectedMoneyOutList.contains(m))
				                  .count();
		
		if(count==0) {
			return false;
		}
		
		newMoneyOutList
		           .stream()
		           .filter(m->!selectedMoneyOutList.contains(m))
		           .forEach(m->selectedMoneyOutList.add(m));
		return true;
    }*/
	
	
	
	// 날짜 수정 기능
	
	public boolean setDate(int oldMonth, int oldDay, int newMonth, int newDay) {
		
		if(list==null) {
			return false;
		}
		
		if(list.contains(new Account(newMonth,newDay))) {
			return false;
		}
		
		int index = list.indexOf(new Account(oldMonth,oldDay));
		
		if(index<0) {
			return false;		
		}
		list.get(index).setMonth(newMonth);
		list.get(index).setDay(newDay);
		return true;		
	}
	
	// 날짜에 해당하는 내역 모두 삭제 기능
	
	public boolean removeAccount(int month, int day) {
		
		if(list==null) {
			return false;
		}
		
		return list.remove(new Account(month,day));		
	}
	
	// 날짜에 수입 내역 추가 기능
	
	public boolean addInMoney(int month, int day, int moneyIn, String memo) {
		
		if(list==null) {
			return false;
		}
		int index= list.indexOf(new Account(month,day));
		
		if(index<0) {
			return false;
		}
		Account selectedAccount = list.get(index);
		return selectedAccount.addInAccount(moneyIn, memo);
	}
	
	// 날짜에 지출 내역 추가 기능
	
	public boolean addOutMoney(int month, int day, int moneyOut, String memo) {
		
		if(list==null) {
			return false;
		}
		int index=list.indexOf(new Account(month, day));
		
		if(index<0) {
			return false;
		}
		Account selectedAccount = list.get(index);
		return selectedAccount.addOutAccount(moneyOut, memo);
	} 
	
	
	// 날짜 입력시 내역 출력 기능
	
	public Account getAccount(int month, int day) {
		int index= list.indexOf(new Account(month,day));
		
		return index<0 ? null : list.get(index);
	}
	
		
				                 
				                  
		
				                       
		
			
		
		
		
	
	
	
	
}