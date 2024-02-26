package codingtest;

import java.util.List;

public class Main {

	public static void main(String[] args) {
			Solution sol = new Solution();
			System.out.println(sol.solution(3,2));
			System.out.println(sol.solution(10,5));
	}

}


class Solution{
	public int solution(int num1, int num2) {
		int answer = -1;
		answer = num1%num2;
		return answer;
	}
}


