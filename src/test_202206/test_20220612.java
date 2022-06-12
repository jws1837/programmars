package test_202206;
//소수 찾기
//2022-06-12 17:42 start 2022-06-12 18:00 end

import java.util.ArrayList;

/**
 * 문제 설명
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 * <p>
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 * (1은 소수가 아닙니다.)
 * <p>
 * 제한 조건
 * n은 2이상 1000000이하의 자연수입니다.
 **/

public class test_20220612 {
    //Todo 1. 소수의 개수를 반환하라.
//Todo 1-1. 소수 구하는 함수.(api가 Math패키지에 있을 듯. 이건 추후 검색)
//Todo 1-2. 2의배수,3의배수로 나눌필요는 없는데,짝수는 다 제외 가능.
//Todo 1-2. contains를 포함해야 하나?
//>>대신 이건 시간복잡도는 n제곱으로 최악일 듯.


    public int solution(int n) {
        int flag = 0;
        ArrayList list = new ArrayList();

        for (int i = 2; i <= n; i++) {
            boolean isSosu = getSosu(i);
            if (isSosu) {
                list.add(i);
            }
        }
        return list.size();
    }

    private boolean getSosu(int n) {
        if (n % 2 == 0) {
            if (n == 2) {
                return true;
            }
            return false;
        }
        int flag = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                flag++;
                if (flag == 2) {
                    return false;
                }
            }
        }
        return flag == 1 ? true : false;
    }

    public static void main(String[] args) {
        test_20220612 test = new test_20220612();
        boolean sosu = test.getSosu(1000000);
        int solution = test.solution(1000000);
        System.out.println(solution);

    }
}

