
public class Ex01_ArrayBasic {
	public static void main(String[] args) {
		int [] score = new int[3];
		System.out.println(score);// �ּҰ�
		
		//�迭�� ������ ���� ������ �ִ�.
		//������ ���� index[÷��] �� ���� ����
		
		//���� 
		System.out.println(score[0]);
		score[1] = 100;
		System.out.println(score[1]);
//		System.out.println(score[3]);
		for(int i=0 ; i<3 ;i++){
			System.out.println("i:"+score[i]);
		}
		for(int i= 0; i<score.length;i++){
			System.out.println("i:"+score[i]);
			
		}
		
		int  []  arr = new int[5];
		int [] arr2 = new int[]{100,200,300,400,500};
		int [] arr3 = {11,12,13,14,15};
		//for���� ���
		
		for(int i = 0 ; i<arr3.length ; i++){
			System.out.println("arr3 :"+arr3[i]);
		}
		
		/////
		int [] arr4 ;
		arr4 = new int[]{1,2,3,4,5};
		/////
		int[] arr5= {7,8,9,10};
		int[] arr6 = arr5;
		
		arr6[0]= 888;
		System.out.println(arr5[0]);
		System.out.println(arr5 == arr6);
		
		//�迭�� 8���� �⺻Ÿ��
		//��ü�� �迭
		char[] ch = new char[10];
		for(int i =0; i<ch.length ; i++){
			System.out.println(">"+ch[i]+"<");
		}
//		int in = 1;
//		int ye =0;
//		System.out.println(in>ye);
		
		
	}

}
