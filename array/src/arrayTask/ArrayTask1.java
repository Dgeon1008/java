package arrayTask;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
		
//      25분
	      
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
//		int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
//		for(int i =0; i<arr1.length;i++) {
//			if(arr1[i] % 2 == 0) {
//				System.out.println(arr1[i]);
//			}
//		}
		
//      1~10까지 배열에 담고 출력
//		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//		for(int i =0; i<arr2.length;i++) {
//			System.out.println(arr2[i]);
//		}

//      1~100까지 배열에 담은 후 홀수만 출력
//		int[] arr3 = new int[100];
//		for(int i = 0; i <100; i++) {
//			arr3[i] = i+1;
//			if(arr3[i] % 2 != 0) {
//				System.out.println(arr3[i]);
//			}
//		}
		
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//		int[] arr4 = new int[100];
//		int result = 0;
//		for(int i = 0; i <100; i++) {
//			arr4[i] = i+1;
//			if(arr4[i] % 2 == 0) {
//				result += arr4[i];
//			}
//		}
//		System.out.println(result);
		
//      A~F까지 배열에 담고 출력
//		char a = 'A';
//		char[] arr5 = new char[6];
//		for(int i=0;i<arr5.length;i++) {
//			arr5[i] = (char)(i+a);
//			System.out.println(arr5[i]);
//		}
		
//      A~F까지 중 C를 제외하고 배열에 담은 후 출력
//		char a = 'A';
//		char c = 'C';
//		int[] arr6 = new int[6];
//		for(int i=0;i<arr6.length;i++) {
//			arr6[i] = i;
//			if(arr6[i] == 2) continue;
//			char result = (char)(arr6[i]+a);
//			System.out.println(result);
//		}
		
//		char[] arData6 = new char[5];
//		for(int i = 0; i < arData6.length; i++) {
//			arData6[i] = (char)(i > 1 ? 65 + i + 1 : 65 + i);
//			System.out.print(arData6[i]);
//		}
		
//		30분
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최댓값과 최솟값을 출력하기
//		int[] arData7 = new int[5];
//		int min = 0, max = 0;
//		Scanner sc = new Scanner(System.in);
//		String message = "5개의 정수를 입력하세요", exampleMessage = "1 3 5 7 9";
//		
//		System.out.println(message);
//		System.out.println(exampleMessage);
//		
//		for(int i = 0; i < arData7.length; i++) {
//			arData7[i] = sc.nextInt();
//		}
//
//		min = arData7[0];
//		max = arData7[0];
//		
//		for(int i = 1; i < arData7.length; i++) {
//			if(max < arData7[i]) { max = arData7[i]; };
//			if(min > arData7[i]) { min = arData7[i]; };
//		}
//		
//		System.out.println("최솟값 : " + min + "\n최댓값 : " + max);
		
//		다이아
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균값을 구하기
		Scanner sc = new Scanner(System.in);
		int[] arData = null;
		int length = 0, total = 0;
		double average = 0.0;
		String message1 = "정수의 개수: ", message2 = "입력한 모든 정수 :", message3 = "평균 : ";
		
		System.out.println(message1);
		length = sc.nextInt();
		arData = new int[length];
		
		for(int i = 0; i < arData.length; i++) {
			System.out.println(i + 1 + "번째 정수: ");
			arData[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		
		average = (double)total / length;

		System.out.println(message2);
		for(int i = 0; i < arData.length; i++) {
			System.out.println("[" + (i + 1) + "번 째 정수: " + arData[i] + "]" );
		}
		System.out.println(message3 + average);
		
		
		
		
		
	}
}
