package test_202205;

//자릿수 더하기 
/**
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
**/
//2022-05-27 10:07 start 2022-05-27 10:15 end

/**
 *N의 범위 : 100,000,000 이하의 자연수 
 **/
public class test_20220527_2 {
	  public static  int solution(int n) {
	        int answer = 0;
	        String temp = (new StringBuilder().append(n)).toString();
	        String[] stArr = temp.split("");
	        int[] arr = new int[stArr.length];
	        for(int i = 0 ; i<stArr.length; i++) {
	        arr[i] = Integer.parseInt(stArr[i]);
	        }
	        for(int i: arr) {
	        	answer +=i;
	        }
	        
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("Hello Java");

	        return answer;
	    }
	}
	  

	

