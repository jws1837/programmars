package test_202208;
//약수의 개수와 덧셈
//2022-08-03 02:42 start 2022-08-03 03:22 end

/**
 * 문제풀이 아쉬운 점
 * Math.sqrt활용하면 더좋았을듯 ( 정수론 약수개념 또 등장. 이전에 풀었었는데, 망각했던 것 같음.)
 **/
public class test_20220803 {

  public int solution(int left, int right) {
    int answer = 0;
    for (int i = left; i <= right; i++) {
      int j = divisionCount(i);
      if (j % 2 == 1) { //홀수면 빼기
        answer -= i;
      } else {//짝수면 더하기
        answer += i;
      }
      System.out.println("j = " + j);
    }
    return answer;
  }

  private int divisionCount(int number) {
    int count = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        count++;
      }
    }
    return count+1;//1은 무조건 포함이니깐.
  }
}

