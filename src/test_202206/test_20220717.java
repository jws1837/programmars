package test_202206;
//2016년
//2022-07-17 01:43 start 2022-07-17 02:45 end

import java.util.HashMap;

/**
 * 문제 설명 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수,
 * solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
 * <p>
 * 입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 * <p>
 * 제한 조건 2016년은 윤년입니다. 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 **/
enum DayOfWeek {
  SUN, MON, TUE, WED, THU, FRI, SAT
}

public class test_20220717 {
  public String solution(int a, int b) {
    String answer = "";
    HashMap<Integer, Integer> map = new HashMap();
    map.put(1, 0);
    map.put(2, 31);
    map.put(3, 60);
    map.put(4, 91);
    map.put(5, 121);
    map.put(6, 152);
    map.put(7, 182);
    map.put(8, 213);
    map.put(9, 244);
    map.put(10, 274);
    map.put(11, 305);
    map.put(12, 335);
    int monthNumber = map.get(a);
    int resultNumber = monthNumber + b;
    int i = resultNumber % 7;
    switch (i) {
      case 1:
        answer = DayOfWeek.FRI.name();
        break;
      case 2:
        answer = DayOfWeek.SAT.name();
        break;
      case 3:
        answer = DayOfWeek.SUN.name();
        break;
      case 4:
        answer = DayOfWeek.MON.name();
        break;
      case 5:
        answer = DayOfWeek.TUE.name();
        break;
      case 6:
        answer = DayOfWeek.WED.name();
        break;
      case 0:
        answer = DayOfWeek.THU.name();
        break;
    }

    return answer;
  }

}

