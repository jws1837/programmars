package test_202204;

//정수 제곱근 판별:
/***임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.**/
//2022-04-10 19:35 start 2022-04-10 20:xx end 

/**
 * 제한 조건 n은 1이상, 50000000000000 이하인 양의 정수입니다.
 **/
public class test_20220410_1 {
	public long solution(long n) {
		double tempResult = Math.sqrt(n);
		long jungsuResult =(long)tempResult;
		long answer = 0 ; 
		if (tempResult % jungsuResult== 0) {
			tempResult += 1;
			answer = (long) ((long) tempResult * tempResult);
		} else {
			answer = -1;
		}
		return answer;
	}

	public static void main(String[] args) {
		test_20220410_1 test = new test_20220410_1();
		System.out.println(test.solution(3));
	}
}