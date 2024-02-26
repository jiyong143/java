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
	
		
				                 
				                  
	private void selectPostDetail(String me_id, int bd_num) {
		System.out.println("상세 조회할 게시글의 번호를 위에서 찾아 입력하세요.");
		System.out.print("게시글 번호 입력 : ");
		int selectpo_num = scan.nextInt();
		if(fanCafeService.checkPoNumPostInBoard(bd_num, selectpo_num)) {
			if(fanCafeService.getMemberLevel(me_id).equals("정회원")) {
			int po_num = fanCafeService.getPoNum(bd_num,selectpo_num);
			// 게시글 번호 입력시 출력 메서드 
			Post post = fanCafeService.getPost(po_num);
			System.out.println("해당 게시글의 상세 조회는 다음과 같습니다.");
			System.out.println("-------------------------------------------------------------------------------");
			post.printPostDetail();
			System.out.println("-------------------------------------------------------------------------------");
			fanCafeService.viwePlus(post.getPo_view()+1, post.getPo_num());
			}else {
				System.out.println("회원님은 미승인 회원입니다. 관리자의 승인을 대기해주세요.");
			}
		}else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			scan.nextInt();
		}
	}
	
	private void deleteUser(String me_id) {
		System.out.println("------회원탈퇴------");
		System.out.println("정말로 회원을 탈퇴하시겟습니까?");
		System.out.print("회원탈퇴를 정말로 원하신다면, '회원탈퇴'를 입력해주세요.");
		String deleteMent = scan.next();
		if(deleteMent.equals("회원탈퇴")) {
			if(!fanCafeService.getMemberLevel(me_id).equals("관리자")) {
				fanCafeService.deleteUser(me_id);
				// 탈퇴한 회원의 게시글들 삭제 
				fanCafeService.deletePostOutMember(me_id);
				System.out.println("회원탈퇴에 성공했습니다.");
			}else {
				System.out.println("관리자는 회원 탈퇴할 수 없습니다.");
			}
		}else {
			System.out.println("회원 탈퇴를 보류하셨습니다.");
		}
	}
	
	public void deletePostOutMember(String me_id) {
		fanCafeDao.deletePostOutMember(me_id);
	}
	
	<delete id="deletePostOutMember">
	  delete from post where po_me_id = #{me_id}
	</delete>
			
						
		
			
		
		
		
	
	
	
	
}