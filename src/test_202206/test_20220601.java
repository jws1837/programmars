package test_202206;

//문자열을 정수로 바꾸기
//2022-06-01 21:01 start 2022-06-01 21:16 end

/**
 * #문제 설명
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 * <p>
 * #제한 조건
 * s의 길이는 1 이상 5이하입니다.
 * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
 * s는 부호와 숫자로만 이루어져있습니다.
 * s는 "0"으로 시작하지 않습니다.
 * <p>
 * #입출력 예
 * 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
 * str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
 **/

public class test_20220601 {
    public int solution(String s) {
        int answer = 0;
        if (s.contains("+")) {
            String[] strArray = s.split("");
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                sb.append(strArray[i]);
            }
            answer = Integer.parseInt(sb.toString());
        } else if (s.contains("-")) {
            String[] strArray = s.split("");
            StringBuilder sb = new StringBuilder("-");
            for (int i = 1; i < s.length(); i++) {
                sb.append(strArray[i]);
            }
            answer = Integer.parseInt(sb.toString());
        } else {
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}




	

