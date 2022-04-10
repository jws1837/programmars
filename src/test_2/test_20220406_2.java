package test_2;

//제일 작은 수 제거하기  
/**
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 * **/
//2022-04-06 17:40 start!; 2022-04-10 19:45  end
//너무 푸는데 오래 걸렸고,  해법도 불만족스러움. 특히 이런 문제는 되게 많이 나올 것 같은니 숙달 필요할 듯. 

/**
 * 
 **/
public class test_20220406_2 {
	
	// 가장작은 수를 빼는 법은
	// 1 .스트림이 있고 ,
	// 2. 각각의 요소를 비교해서 가장작은 걸를 선택하는 방식. 보통의 나라면 2번째 방법을 많이 씀.
	// 3. 버블정렬 이용해서 작은순서대로 배열을 정렬시키고 첫번째 요소를 제거한 배열을 복사하는 방식.
	// 4. 리스트를 만들어서 , list.toArray()를 쓰는 것.

	public int[] solution(int[] arr) {
		if (arr.length <= 1) {
			int[] answer = { -1 };
			return answer;
		} else {
			int[] answer = new int[arr.length - 1];
			int temp = 0; // 가장 작은수
			int tempIndex = 0; // 우회 인덱스
			boolean isTempIndex = false;
			// 살짝 우회하는 방법.

			temp = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (temp > arr[i]) {
					tempIndex = i;
					temp = arr[i];
				}
			}
//			logInfo(answer, 1); // 불필요 메서드
//			System.out.println("tempIndex:" + tempIndex);
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[tempIndex]) {
					isTempIndex = true;
				}
				if (isTempIndex) {
					answer[i] = arr[i + 1];
				} else {
					answer[i] = arr[i];
				}
			}
			return answer;

		}

	}

	private void logInfo(int[] answer, int count) {
		System.out.println("생성자" + count + "시작");
		for (int a : answer) {
			System.out.println("================="+a);
		}
		System.out.println("생성자" + count + "끝");
	}

	public static void main(String[] args) {
		test_20220406_2 test = new test_20220406_2();
		int[] arr = { 3,2, 4, 5 };
		int[] result = test.solution(arr);
		for (int a : result) {
			System.out.println(a);
		}
		System.out.println("배열의 길이:" + result.length);
		// 왜 첫번째 요소가 3이 아니라 0이 나오는 거지?continue 되었음. 

	}

}