package test_202205;

//약수의 합
/**
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 **/
//2022-05-30 22:13 start 2022-05-30 22:34 end

import java.util.ArrayList;
import java.util.List;

/**
 * n은 0 이상 3000이하인 정수입니다.
 **/
public class test_20220530 {
    public int solution(int n) {
        List<Integer> divisorArray = getDivisor(n);

        int answer = 0;
        for (Object temp : divisorArray) {
            answer += (int) temp;
        }
        return answer;
    }

    private static List<Integer> getDivisor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

}



	

