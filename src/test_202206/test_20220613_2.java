package test_202206;
//문자열 다루기 기본
//2022-06-13 01:45 start 2022-06-13 01:51 end

/**
 * 문제 설명
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 * <p>
 * 제한 사항
 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 **/
public class test_20220613_2 {

    public boolean solution(String s) {
        boolean answer = false;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

}

