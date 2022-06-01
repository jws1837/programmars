package test_202205;

import java.util.Arrays;

//정수 내림차순으로 배치하기 
/***함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
**/
//2022-05-26 12:44 start 2022-05-26 13:47 end 

/**
 * n은 1이상 8000000000 이하인 자연수입니다.
 **/
public class test_20220526_1 {
	public long solution(long n) {
		long answer = 0;
		String temp = Long.toString(n);
		long[] numbers = new long[temp.length()];
		
		for( int i= 0 ; i< temp.length(); i++ ) {
			numbers[i] = temp.charAt(i) - '0';
		}
		String after= "";
		Arrays.sort(numbers);
		for( int i= 0 ; i< temp.length(); i++ ) {
		after +=String.valueOf(numbers[i]);
		}
		StringBuilder sb = new StringBuilder(after);
		after = sb.reverse().toString();
		answer = Long.parseLong(after);
		return answer;
	
	}

	public static void main(String[] args) {
		test_20220526_1 test = new test_20220526_1();
				long a = test.solution(118372l);
		System.out.println(a);

	}
}