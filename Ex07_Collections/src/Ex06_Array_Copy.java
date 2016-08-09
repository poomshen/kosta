import java.util.Arrays;

//deep copy(��������)
//shellow copy(���� ����)
public class Ex06_Array_Copy {
	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5 };
		int[] data2 = { 5, 6, 7, 8, 9 };
		int[] scopy = null;
		int[] dcopy = null;

		System.out.println("����");
		scopy = shallowcopy(data);
		// data ��� �迭�� �ּҰ��ϰ� == scopy ��� �迭 �ּҰ��ϰ� ����.
		System.out.println(Arrays.toString(scopy));
		System.out.println(Arrays.toString(data));

		// ����
		scopy[1] = 5555;
		System.out.println(Arrays.toString(scopy));
		System.out.println(Arrays.toString(data));

		System.out.println(scopy == data);
		///////////////////////////////////////////////////////

		dcopy = deepCopy(data2);
		System.out.println(dcopy == data2);
		System.out.println(Arrays.toString(dcopy));
		System.out.println(Arrays.toString(data2));
		
		//���� 
		dcopy[1] = 999;
		System.out.println(Arrays.toString(dcopy));
		System.out.println(Arrays.toString(data2));
	}

	static int[] shallowcopy(int[] arr) {
		return arr;
		// �迭�� �ּҰ��� parameter �޾Ƽ�
		// �� �ּҰ� �� �ٽ� return
	}

	static int[] deepCopy(int[] arr) {
		int[] resultArray = new int[arr.length];
		System.arraycopy(arr, 0, resultArray, 0, arr.length);
		// ���� ���� �ؼ� �ְڴ�.
		// for(int i = 0 ;i<arr.length ; i++){
		// resultArray[i] = arr[i];
		// }
		return resultArray;
	}
}
