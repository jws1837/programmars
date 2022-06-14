package test_202206;
//문자열 내 마음대로 정렬하기
//2022-06-14 12:23 start 2022-06-14 13:42 end
//조건(ㄱ) 제대로 이해못해서 오래 걸림.

/**
 * 문제 설명
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
 * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 * <p>
 * 제한 조건
 * strings는 길이 1 이상, 50이하인 배열입니다.
 * strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
 * strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
 * 모든 strings의 원소의 길이는 n보다 큽니다.
 * ㄱ.인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 **/
public class test_20220614 {

    public String[] solution(String[] strings, int n) {
        boolean bool = false;
        for (int j = 1; j < strings.length; j++) {
            for (int i = 0; i < strings.length - j; i++) {
                String a = "";
                bool = compare(strings[i], strings[i + 1], n);
                if (bool == true) {
                    String temp = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = temp;
                }

            }
        }
        return strings;
    }

    private boolean compare(String former, String latter, int n) {
        if (former.charAt(n) > latter.charAt(n)) {
            return true;
        } else if (former.charAt(n) < latter.charAt(n)) {
            return false;
        } else {
            if (former.compareTo(latter) < 0) {
                return false;
            } else {
                return true;
            }
        }

    }

}

