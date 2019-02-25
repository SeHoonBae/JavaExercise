package example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcademyExcercise6Solution7_10 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for_7();
		for_8(reader);
		for_9(); //2018.12.31 - 1.1.1 2018*365+ 윤년 갯수
		for_10(reader);


	}



	private static void for_10(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("최대 숫자 : ");
		int maxNum = Integer.parseInt(reader.readLine());


//		for (int cnt = 3300; cnt <= maxNum; cnt++) {
//		    String num = cnt+""; // 문자열 변환
//		    boolean check = true; // 3 6 9 해당여부 저장
//		    for (int i = 0; i < num.length(); i++) {
//		        char numDigit = num.charAt(i);  // 해당 수의 앞에서부터 i번째 숫자부터 검사
//		        if (numDigit == '3' || numDigit == '6' || numDigit == '9') { // 3 6 9 해당되면 짝 출력
//		            System.out.print('짝');
//		            check = false;
//		        }
//		    }
//		    if (check) {
//		        System.out.print(cnt+" "); // 3 6 9 해당 되지 않았다면 수 표시
//		    } else {
//		        System.out.print(' '); //사이에 한칸 띄우기
//		    }
//		}

		int clap;

		for(int cnt = 280; cnt <= maxNum; cnt++) { // 10의자리 이상일때 1의자리 수부터 3 6 9인지 비교 ex) 340일 때 0 4 3 순서, /10을 한후 몫에 %10을 하여 계산
			clap=0;
			if(cnt>10) {
				for(int j= cnt; j>0; j/=10)
					if(j%10 == 3 || j%10 == 6 || j%10 == 9 ) clap++;

				if(clap==0) System.out.print(cnt);

			}else {
				if(cnt%10 == 3 || cnt%10 == 6 || cnt%10 == 9 ) clap++;
				else System.out.print(cnt);
			}
			for(int i =0; i<clap; i++)
				System.out.print("짝");
			System.out.print(" ");
		}



	}
	private static void for_9() {


		int year = 2019;
		int month = 2;
		int day = 12;

		int cnt=0; //윤년 수
		int thisYearDay = 0;

		for(int i=1; i<=2018; i++) {
			if(i%4==0 || i%100 == 0 || i%400 ==0) cnt++;
		}

		for(int i=1; i<month; i++) {
			if(year%4==0 || year%100 == 0 || year%400 ==0) {
				switch(i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: thisYearDay+=31;
						break;
				case 2: thisYearDay+=29;
						break;
				default : thisYearDay+=30;
						break;
				}
			}else {
					switch(i) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12: thisYearDay+=31;
							break;
					case 2:
						thisYearDay+=(year%4==0 || year%100 == 0 || year%400 ==0)?29:28;
							break;
					default : thisYearDay+=30;
							break;
					}
			}
		}

		int addDay = (year-1)*365+cnt+thisYearDay+day;

		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날입니다.\n",year,month,day,addDay);

		int weekNum	 = addDay%7;
		String week="";

		switch(weekNum) {
		case 1:
			week="일요일";
			break;
		case 2:
			week="월요일";
			break;
		case 3:
			week="화요일";
			break;
		case 4:
			week="수요일";
			break;
		case 5:
			week="목요일";
			break;
		case 6:
			week="금요일";
			break;
		case 7:
			week="토요일";
			break;
		}

		System.out.printf("오늘이 무슨 요일인가요? %s",week);

	}

	private static void for_8(BufferedReader reader) throws NumberFormatException, IOException {

		int sum = 0;
		int num;
		String numPrint = "";

		System.out.print("종료할 누적값을 입력하세요(숫자) : ");
		int endNum = Integer.parseInt(reader.readLine());

		for(int i=0; ; i++) {
			System.out.print("숫자 : ");
			num = Integer.parseInt(reader.readLine());

			if(i==0) numPrint += num;
			else {
				if(num % 2 == 0) {
					sum += num;
					numPrint += " + " + num;
				}else {
					sum -= num;
					numPrint += " - " + num;
				}
			}

			if(sum > endNum)break;

		}
		System.out.println();
		System.out.printf("%s = %d\n",numPrint,sum);

	}

	private static void for_7() {

		int sum=0;

		System.out.print("1");
		for(int i=2; ; i++) {
			System.out.print(" + "+i);
			sum += i;

			if(sum > 1000 )break;
		}
		System.out.println(" = "+sum);

	}
}
