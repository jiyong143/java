package DAY19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		
		
		Map<String , String> map = new HashMap<String,String>();
		
		map.put("abc", "def");
		String prev = map.put("abc", "xyz");
		System.out.println(map);
		System.out.println(prev);
		
		/* get(k) : k와 일치하는 v를 리턴
		 * 
		 */
		
		String str = map.get("abc");
		
		System.out.println(str);
		
		/* containsKey(k) : k와 일치하는 key가 있는지 알려줌 */
		
		System.out.println(map.containsKey("abc"));
		
		/*remove(k) : k와 일치하는 요소를 삭제 후 value 값을 리턴 */
		
		str = map.remove("abc");
		System.out.println(str);
		
		map.put("zxc", "123");
		map.put("hello", "hi");
		
		
		/* KeySet() : 멥에 있는 key들을 모아 set에 저장하여 반환 */
		Set<String> keySet = map.KeySet();
		
		
		
		
		
		
		
	}

}
