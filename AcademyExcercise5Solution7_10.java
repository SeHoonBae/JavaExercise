import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class AcademyExcercise5Solution7_10 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		q7_1(reader);
		q7_2(reader);
		q8(reader);
		q9(reader);
		q10(reader);

	}

	private static void q10(BufferedReader reader) throws Exception { //10번 문제

		System.out.print("근무 년수 : ");
		int year = Integer.parseInt(reader.readLine());

		if(year > 0) { // 근무년수가 음수와 0인 입력값을 방지하기 위한 조건문
			if(year >= 10) { // 근무년수가 10년 이상일 때
				System.out.printf("%d년차 고급 개발자입니다.\n",year);
			}else if(year >= 5) { // 근무년수가 5년이상 10년 미만인 경우, 위에서 10년이상은 걸렀으므로 5년이상만 조건으로 하면됨
				System.out.printf("%d년차 중급 개발자입니다.\n",year);
				System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n",year-4);
				System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n",10-year);
			}else { // 근무년수가 5년 이하일 때
				System.out.printf("%d년차 초급 개발자입니다.\n",year);
				System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n",5-year);
			}
		} else System.out.println("1이상의 값을 입력해주세요.");
	}

	private static void q9(BufferedReader reader) throws Exception { //9번 문제
		System.out.print("년 : ");
		int year = Integer.parseInt(reader.readLine());
		System.out.print("월 : ");
		int month = Integer.parseInt(reader.readLine())-1; // 월은 0~11로 나타내기 때문에 구하고자 하는 달에서 -1 해야됨
		System.out.print("일 : ");
		int day = Integer.parseInt(reader.readLine());

		Calendar calendar = Calendar.getInstance();

		calendar.set(year,month,day); // 년 월 일을 설정

		int weekNumber = calendar.get(Calendar.DAY_OF_WEEK); //토요일 7 일 1 월~금 2~6
		System.out.printf("%tA\n",calendar); // 년 월 일을 출력


		if(weekNumber==7 || weekNumber==6)System.out.println("휴일입니다.");
		else {
			calendar.add(Calendar.DATE, weekNum(weekNumber)); // weekNum는 평일인 경우 날짜를 토요일로 이동하고자 할 때 몇일을 더해줘야 하는지를 반환해주는 메소드
			System.out.printf("입력하신 날짜는 \'평일\'입니다.\n해당 주의 토요일로 이동합니다.\n");
			System.out.printf("이동한 날짜는 \'%tF\'입니다.\n",calendar);
		}

	}

	private static int weekNum(int n) { // 평일을 토요일로 바꿔주기 위해 몇일을 더할지 정해주는 메소드, 9번문제에 이용
		return 7-n;
	}

	private static void q8(BufferedReader reader) throws Exception {

		System.out.print("년도 입력 : ");
		int year = Integer.parseInt(reader.readLine()); // 년도를 입력받기 위함

		if(year % 4 == 0 ) {
			if(year % 100 == 0) {
				if(year % 400 == 0) System.out.printf("%d년은 '윤년'입니다.\n",year);
				else System.out.printf("%d년은 '평년'입니다.\n",year);
			} else System.out.printf("%d년은 '평년'입니다.\n",year);
		} else System.out.printf("%d년은 '평년'입니다.\n",year);

	}

	private static void q7_1(BufferedReader reader) throws Exception { // 7번 문제 - 정수값을 시간으로 받음

		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int enterHour = Integer.parseInt(reader.readLine()); // 들어온 시 입력
		System.out.print("분 : ");
		int enterMinute = Integer.parseInt(reader.readLine()); // 들어온 분 입력

		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int exitHour = Integer.parseInt(reader.readLine()); // 나간 시 입력
		System.out.print("분 : ");
		int exitMinute = Integer.parseInt(reader.readLine()); // 나간 분 입력

		int differenceHour = 0; // 나간시 - 들어온 시 변수
		int differenceMinute = 0; // 나간시간-들어온시간 분으로 계산하여 넣어줄 변수
		int charge = 0; // 요금

		if(exitHour-enterHour>0) {

			differenceHour = exitHour-enterHour; // 나간시 - 들어온 시
			differenceMinute = exitMinute + (differenceHour*60) - enterMinute - 30; // 나간시간 - 들어온시간을 분으로 계산
			charge = differenceMinute/10*2000; // 요금

		} else System.out.println("나간 시간이 들어온 시간보다 빠릅니다. 다시 입력해주세요.");

		System.out.printf("주차 요금은 %,d원입니다.\n",charge);

	}

	private static void q7_2(BufferedReader reader) throws Exception { // 7번 문제 - Calendar값을 시간으로 받음

		Calendar enter = Calendar.getInstance(); // 나간 시간을 구하기 위한 구문

		System.out.println("[들어온 시간]"); // 들어온 시,분을 입력
		System.out.print("시 : ");
		int enterHour = Integer.parseInt(reader.readLine()); // 들어온 시 입력
		System.out.print("분 : ");
		int enterMinute = Integer.parseInt(reader.readLine()); // 들어온 분 입력

		System.out.println("[나간 시간]"); // 나간 시,분을 입력
		System.out.print("시 : ");
		int exitHour = Integer.parseInt(reader.readLine()); // 나간 시 입력
		System.out.print("분 : ");
		int exitMinute = Integer.parseInt(reader.readLine()); // 나간 분 입력

		enter.set(Calendar.HOUR_OF_DAY,enterHour); // 들어온 시간 설정
		enter.set(Calendar.MINUTE,enterMinute); // 들어온 분 설정

		Calendar exit = Calendar.getInstance(); // 나간 시간을 구하기 위한 구문
		exit.set(Calendar.HOUR_OF_DAY,exitHour); // 나간 시간 설정
		exit.set(Calendar.MINUTE,exitMinute); // 나간 분 설정


		long difference = (exit.getTime().getTime() - enter.getTime().getTime())/1000/60; // 틱값을 이용하여 나간 시간과 들어온 시간의 차이를 구함

		if(difference>0) {
			if(difference >= 30) { // 주차시간이 30분이 되지 않았을 경우에는 무료이므로 조건 설정, 30분 이하일 경우 음수값의 요금이 나오지 않기위해 설정함
				int charge = ((int)difference-30) / 10 * 2000; // difference 변수는 나간시간과 들어온 시간의 차이고 30분간은 무료라는 조건이 있었으므로 30을 빼준후에 계산
				System.out.printf("주차 요금은 %,d원입니다.\n",charge);
			}else System.out.println("30분간은 무료입니다.");
		}else System.out.println("나간시간이 들어온 시간보다 앞으로 설정하였습니다. 다시 입력해주세요.");

//		int enterHourInt = enter.get(Calendar.HOUR_OF_DAY);
//		int enterMinuteInt = enter.get(Calendar.MINUTE);
//
//		int outHourInt = exit.get(Calendar.HOUR_OF_DAY);
//		int outMinuteInt = exit.get(Calendar.MINUTE);

//		int differenceInt = (outHourInt-enterHourInt)*60 + outMinuteInt - enterMinuteInt; // 나가시간에서 들어온 시간을 빼고 값을 모두 분값으로 나타냄

//		if(differenceInt>0) {
//			if(differenceInt >= 30) { // 주차시간이 30분이 되지 않았을 경우에는 무료이므로 조건 설정, 30분 이하일 경우 음수값의 요금이 나오지 않기위해 설정함
//				int charge = ((int)differenceInt - 30) / 10 * 2000; // difference 변수는 나간시간과 들어온 시간의 차이고 30분간은 무료라는 조건이 있었으므로 30을 빼준후에 계산
//				System.out.printf("주차 요금은 %,d원입니다.\n",charge);
//			}else System.out.println("30분간은 무료입니다.");
//		}else System.out.println("나간시간이 들어온 시간보다 앞으로 설정하였습니다. 다시 입력해주세요.");


	}

}
