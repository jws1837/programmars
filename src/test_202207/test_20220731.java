package test_202207;
//예산
//2022-07-31 23:06 start 2022-07-31 23:23 end

import java.util.Arrays;

/**
 *
 **/
public class test_20220731 {

  public int solution(int[] d, int budget) {
    Arrays.sort(d);
    int sum = 0;
    int answer = 0;

    for (int i = 0; i < d.length; i++) {
      sum += d[i];
      if (sum > budget) {
        break;
      }
      answer = i + 1;
    }
    return answer;
  }


}

