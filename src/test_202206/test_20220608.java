package test_202206;

//수박수박수박수박수박수?
//2022-06-08 11:22 start 2022-06-08 11:28 end

/**
 * 문제 설명
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 * <p>
 * 제한 조건
 * n은 길이 10,000이하인 자연수입니다.
 **/
public class test_20220608 {
    public String solution(int n) {
        char[] source = {'수', '박'};
        String answer = "";

        for (int i = 0; i < n; i++) {
            int k = 0;
            k = (i % 2 == 0) ? 0 : 1;
            answer += source[k];
        }
        return answer;
    }
}




	

