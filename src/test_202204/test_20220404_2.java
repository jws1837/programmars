package test_202204;

//문제 콜라츠 추측
//2022-04-04 13:15 start!; 13:36 end 
public class test_20220404_2 {
//private int count  = 0;
	public int solution(int num) {
		int answer = 0;

		for (int i = 0; i < 501; i++) {
			if (i == 500) {
				return -1;
			}
			if (num == 1) {
				break;
			}
			if (num % 2 == 0) {
				num = num / 2;
				answer++;
			} else if (num % 2 == 1) {
				num = (num * 3) + 1;
				answer++;
			}else {
				
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		test_20220404_2 as = new test_20220404_2();
		int d = as.solution(626331);
		System.out.println(d);
	}

}