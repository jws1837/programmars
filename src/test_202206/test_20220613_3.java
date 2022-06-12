package test_202206;
//문자열 내림차순으로 배치하기
//2022-06-13 01:54 start 2022-06-13 01:58 end

import java.util.Arrays;
import java.util.Collections;

/**
 * 문제 설명
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * <p>
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 **/
public class test_20220613_3 {
    public String solution(String s) {
        String[] splitedString = s.split("");
        Arrays.sort(splitedString, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splitedString.length; i++) {
            sb.append(splitedString[i]);
        }
        String answer = sb.toString();
        return answer;
    }

}

