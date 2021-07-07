package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		숫자 야구 게임을 만들어보자
		
//		문제로 출제될 숫자 3개를 저장할 배열		
		int[] randomNumbers = new int[3];
		
//		3칸의 배열에 숫자를 저장할 for문
		for(int i = 0 ; i < randomNumbers.length ; i++) {
			
//			1. 1~9의 숫자만 사용할꺼다 => 1에서 9 중 하나를 랜덤으로 생성(안배운 부분 활용)
			
//			2. 중복된 숫자는 막아야함!! => 뽑힌 랜덤 숫자를 사용해도 되는지 검사하자
		
//			3. 검사를 통과하면, 배열에 집어넣어주고 아니면 다시 뽑게 로직을 돌리자 = 올바른 숫자가 나올때까지 해당 자리를 다시 뽑자!!
//			 -> while문을 이용한 무한 반복을 사용해야겠지

			while(true) {
				
//				0 < 랜덤값 < 1
				int randomNum = (int)(Math.random()*9+1);   // 캐스팅
				
				boolean isDuplOk = true;
				
				for(int num : randomNumbers) {
//					중복된 숫자를 발견했다 => 더이상 중복 검사 통과가 아닌거지
					if(randomNum == num) {
						isDuplOk = false;
					}			
				}
				
//				만약 중복검사 결과가 true로 유지되어있다면 하나도 중복 안됐다!! = 사용해도 좋은 랜덤값이니
//				자리에 넣어주자!!
				if(isDuplOk) {
					randomNumbers[i] = randomNum;
					break;
				}			
			}
			
		}

		
//		2. 사용자에게 3자리 숫자를 무한히 입력받게끔 하자
		
		Scanner myScan = new Scanner(System.in);
		
//		8. S 와 B 갯수를 변수에 저장하자
//		 => 여기에 저장하면 안되는 이유 
//		 => while문 밖에 작성하면 S/B의 갯수가 계속해서 누적된다.
//		 => 숫자를 입력할때마다 S/B의 갯수가 카운팅되야하므로 while문 안에 작성해야함!!
//		int strikeCount = 0;
//		int ballCount = 0;
		
//		10. 몇번만에 맞췄는지 변수 저장
		int tryCount = 0;
		
		while(true) {
			
			System.out.print("숫자를 맞춰보세요 : ");
			int inputNum = myScan.nextInt();
			
			tryCount++;
			
//			3. 입력된 숫자를 쪼개서 저장하자
			
			int[] inputNumbers = new int[3];
			
			inputNumbers[0] = inputNum / 100;
			inputNumbers[1] = inputNum / 10 % 10;
			inputNumbers[2] = inputNum % 10 ;
			
//			8. S 와 B 갯수를 변수에 저장하고 카운팅해주기
			int strikeCount = 0;
			int ballCount = 0;		
			
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
			
//			9. 3S면 게임 종료 / 아니면 몇S몇B인지 카운팅해주고 계속 반복
			if(strikeCount == 3) {
				System.out.println("축하합니다 정답을 맞추셨습니다.");
//				10. 몇번만에 맞췄는지 알려주자
				System.out.println(tryCount + "번만에 맞추셨습니다.");
				break;
			}
			else {
				System.out.println(strikeCount + "S" + ballCount + "B입니다.");
			}
			

		}
		
		
		
		
		
		
	}

}
