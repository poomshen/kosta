import java.util.Arrays;

//deep copy(깊은복사)
//shellow copy(앝은 복사)
public class Ex06_Array_Copy {
	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5 };
		int[] data2 = { 5, 6, 7, 8, 9 };
		int[] scopy = null;
		int[] dcopy = null;

		System.out.println("적용");
		scopy = shallowcopy(data);
		// data 라는 배열의 주소값하고 == scopy 라는 배열 주소값하고 같다.
		System.out.println(Arrays.toString(scopy));
		System.out.println(Arrays.toString(data));

		// 증명
		scopy[1] = 5555;
		System.out.println(Arrays.toString(scopy));
		System.out.println(Arrays.toString(data));

		System.out.println(scopy == data);
		///////////////////////////////////////////////////////

		dcopy = deepCopy(data2);
		System.out.println(dcopy == data2);
		System.out.println(Arrays.toString(dcopy));
		System.out.println(Arrays.toString(data2));
		
		//증명 
		dcopy[1] = 999;
		System.out.println(Arrays.toString(dcopy));
		System.out.println(Arrays.toString(data2));
	}

	static int[] shallowcopy(int[] arr) {
		return arr;
		// 배열의 주소값을 parameter 받아서
		// 그 주소값 을 다시 return
	}

	static int[] deepCopy(int[] arr) {
		int[] resultArray = new int[arr.length];
		System.arraycopy(arr, 0, resultArray, 0, arr.length);
		// 값을 복사 해서 넣겠다.
		// for(int i = 0 ;i<arr.length ; i++){
		// resultArray[i] = arr[i];
		// }
		return resultArray;
	}
}
