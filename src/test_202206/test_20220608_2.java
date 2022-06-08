package test_202206;
//Lv2
//2022-06-08 12:13 start 2022-06-08 13:48 end
//

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 문제 설명
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 * <p>
 * 구조대 : 119
 * 박준영 : 97 674 223
 * 지영석 : 11 9552 4421
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * 제한 사항
 * phone_book의 길이는 1 이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 ㅡㅏ,이하입니다.
 * 같은 전화번호가 중복해서 들어있지 않습니다.
 **/
public class test_20220608_2 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            answer = check(phone_book[i], phone_book[i + 1]);
            if (!answer) {
                return answer;
            }
        }
        return answer;
    }

    private boolean check(String a, String b) {
        String convert = "";
        if (a.length() > b.length()) {
            convert = a.substring(0, b.length());
            if (convert.equals(b)) {
                return false;
            }
        } else {
            convert = b.substring(0, a.length());
            if (convert.equals(a)) {
                return false;
            }
        }
        return true;

    }

    public boolean recommmendSolution(String[] phoneBook) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phoneBook.length; i++) {
            map.put(phoneBook[i], i);
        }


        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = 0; j < phoneBook[i].length(); j++) {
                if (map.containsKey(phoneBook[i].substring(0, j))) {
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }


}




	

