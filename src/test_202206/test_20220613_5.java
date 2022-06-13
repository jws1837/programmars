package test_202206;
//Lv2.N개의 최소공배수
//2022-06-13 16:33 start 2022-06-13 17:12 end

import java.util.Arrays;

/**
 * 문제 설명
 * 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
 * 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
 * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
 * <p>
 * 제한 사항
 * arr은 길이 1이상, 15이하인 배열입니다.
 * arr의 원소는 100 이하인 자연수입니다.
 **/
public class test_20220613_5 {

    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = 0;

        for (int j = 1; j < 1000000000; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[arr.length - 1] * j % arr[i] != 0) {
                    break;
                } else {
                    count++;
                }
                if (count == arr.length) {
                    answer = arr[arr.length - 1] * j;
                    return answer;
                }
            }
        }

        return answer;
    }

}

