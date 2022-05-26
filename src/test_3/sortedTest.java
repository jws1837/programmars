package test_3;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class sortedTest {
	public static void main(String[] args) {
		String password ="djfkj3";
		String encrypted = BCrypt.hashpw(password, BCrypt.gensalt());
		System.out.println(BCrypt.checkpw(password, encrypted)); // true
		System.out.println(BCrypt.checkpw(password+1, encrypted)); // true
		quickSortTest();
		}
	private static void quickSortTest() {
		int[] b=  {1,5,3,7,5,3,10,11};
//		quickSort();
	}
	public static void quickSort(int[] arr, int left, int right) {
	    int i, j, pivot, tmp;
	    if (left < right) {
	        i = left;   j = right;
	        pivot = arr[(left+right)/2];
	        //분할 과정
	        while (i < j) {
	            while (arr[j] > pivot) j--;
	            // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함.
	            while (i < j && arr[i] < pivot) i++;

	            tmp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = tmp;
	        }
	        //정렬 과정
	        quickSort(arr, left, i - 1);
	        quickSort(arr, i + 1, right);
	    }
	}
}
