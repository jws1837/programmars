package test_202204;

//최대공약수와 최소공배수
//2022-04-04 13:41 start!; 14:36 end 
public class test_20220404_3 {
	/**
	 * @param n random값 1
	 * @param m random값 2
	 * @return answer[] - 각각 n과 m의 최대공약수 ,최소공배수 로 구성된 길이가 2인 int배열
	 */
	public int[] solution(int n, int m) {

		int[] answer = new int[2];
		// 최대공약수
		greatestCommonFactor(n, m, answer);

		// 최소공배수
		leastCommonMultiple(n, m, answer);

		return answer;
	}

	private void leastCommonMultiple(int n, int m, int[] answer) {
		for (int j = 1; j < 1000; j++) {
			if (n > m) {
				if (n % m == 0) {
					answer[1] = n;
					break;
				} else if ((n * j) % m == 0) {
					answer[1] = n * j;
					break;

				}

			} else if (n < m) {
				if (m % n == 0) {
					answer[1] = m;
					break;
				} else if ((m * j) % n == 0) {
					answer[1] = m * j;
					break;

				}

			} else { 
				answer[1] = n;
				break;
			}
		}
	}
	private void greatestCommonFactor(int n, int m, int[] answer) {
		for (int i = n > m ? n : m; i > 0; i--) {
			if (n % i == 0) {
				if (m % i == 0) {
					answer[0] = i;
					break;
				}

			}
		}
	}

	public static void main(String[] args) {
		test_20220404_3 as = new test_20220404_3();
		int[] ab = as.solution(6, 10);
//		30이 나와야 하는데..
		for (int a : ab) {
			System.out.println(a);
		}

	}

}