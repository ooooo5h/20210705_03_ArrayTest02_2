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
		
//		8. S 와 B 갯수를 변수에 저장하자
		int strikeCount = 0;
		int ballCount = 0;
		
		while(true) {
			
			System.out.print("숫자를 맞춰보세요 : ");
			int inputNum = myScan.nextInt();
			
//			3. 입력된 숫자를 쪼개서 저장하자
			
			int[] inputNumbers = new int[3];
			
			inputNumbers[0] = inputNum / 100;
			inputNumbers[1] = inputNum / 10 % 10;
			inputNumbers[2] = inputNum % 10 ;
			
			
//			4. 내가 입력한 숫자가 랜덤 숫자와 같은 지 반복문 돌리기
//			[i1, i2, i3 ] 이랑 [r1, r2, r3]
//			i1 == r1? 
//			i1 == r2?
//			i1 == r3?,,,  => 바쁜 반복 (j)
//			
//			i1 -> i2 -> i3 -> i1 덜 바쁜 반복 (i)
			for(int i = 0; i < inputNumbers.length ; i++ ) {
				for(int j = 0; j < randomNumbers.length ; j++) {
					
//					5. 내가 입력한 숫자와 랜덤숫자가 같은가 검사
					if(inputNumbers[i] == randomNumbers[j]) {
						if(i == j) {
//							6. i == j 이면 숫자도 같고 위치도 같음 => S
							strikeCount++;										
						}
						else {
//							7. i != j 이면 숫자는 같은데 위치는 다름 => B
							ballCount++;							
						}
					}		
				}				
			}			
			System.out.println(strikeCount + "S" + ballCount + "B입니다.");

		}
		
		
		
		
	}

}
