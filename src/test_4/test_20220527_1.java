package test_4;

//자연수 뒤집어 배열로 만들기 
/**
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * *
**/
//2022-05-27 09:53 start 2022-05-27 10:01 end
//어제와 비슷한 문제라 빨리 품. 

/**
 * n은 10,000,000,000이하인 자연수입니다.
 **/
public class test_20220527_1 {
	public static int[] solution(long n) {
		String temp = Long.toString(n);
		int answer[] = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			answer[i] = (temp.charAt(temp.length() - 1 - i)) - '0';

		}
		return answer;
	}

	public static void main(String[] args) {
		String temp = Long.toString(3543);
		int[] df = solution(50873);
		for (int a : df) {
			System.out.println(a);
		}
	}

}