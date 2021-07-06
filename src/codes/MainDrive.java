package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		숫자 야구 게임을 만들어보자
		
//		1.임시로 3자리 숫자를 3칸짜리 배열에 나눠서 저장 ex)741
		
		int[] randomNumbers = new int[3];
		
		randomNumbers[0] = 7;
		randomNumbers[1] = 4;
		randomNumbers[2] = 1;
		
//		2. 사용자에게 3자리 숫자를 무한히 입력받게끔 하자
		
		Scanner myScan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자를 맞춰보세요 : ");
			int inputNum = myScan.nextInt();
			
//			3. 입력된 숫자를 쪼개서 저장하자
			
			int[] inputNumbers = new int[3];
			
			inputNumbers[0] = inputNum / 100;
			inputNumbers[1] = inputNum / 10 % 10;
			inputNumbers[2] = inputNum % 10 ;
			

			
			
			
			
			
			
			
		}
		
		
	}

}
