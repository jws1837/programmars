package test_202207;
//가운데글자 가져오기
//2022-07-06 11:51 start 2022-07-06 12:07 end

/**
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 **/
public class test_20220706 {

  public String solution(String s) {
    String answer = "";
    if (s.length() % 2 == 0) {
      answer =
          s.charAt((s.length() / 2) - 1) + String.valueOf(s.charAt((s.length() / 2)));
    } else {
      answer = String.valueOf(s.charAt(s.length() / 2));
    }

    return answer;
  }

}

