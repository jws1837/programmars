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
//Todo 1-1. 소수 구하는 함수.(api가 Math패키지에 있을 듯. 이건 추후 검색)
//Todo 1-2 . 소수 구하는 함수. 나머지가 0인거 1과 자기자신 제외 1개면(count를 두고)  배열에 넣고, 2개이상이면 그냥 건너뛰기 .
//>>대신 이건 시간복잡도는 n제곱으로 최악일 듯.
//Todo 2. n은 2이상 100만이하 자연수
//Todo 3.

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
        int flag = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                flag++;
            }

        }
        return flag == 1 ? true : false;
    }

    public static void main(String[] args) {
        test_20220612 test = new test_20220612();
        int solution = test.solution(5);
        System.out.println(solution);

    }
}

