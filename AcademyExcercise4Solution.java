import java.io.*;
import java.util.*;

class Ex22_ex {
	public static void main(String[] args) throws Exception{
		ex1();
		line();
		ex2();
		line();
		ex3();
		line();
		ex4();
		line();
		ex5();

	}

	public static void ex1 () {
		Calendar birth = Calendar.getInstance();
		birth.add(Calendar.DATE,100);
		System.out.printf("백일 : %tF\n",birth);

		birth = Calendar.getInstance();
		birth.add(Calendar.YEAR,1);
		System.out.printf("첫돌 : %tF\n",birth);
	}

	public static void ex2 () throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("태어난 년도 : ");
		int birth = Integer.parseInt(reader.readLine());

		Calendar current = Calendar.getInstance();
		System.out.printf("나이 : %d세 \n",current.get(Calendar.YEAR)-birth+1);

	}

	public static void ex3 () throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("남자 이름 : ");
		String manName=reader.readLine();
		System.out.print("여자 이름 : ");
		String womanName=reader.readLine();
		System.out.print("만난날(년) : ");
		int meetYear = Integer.parseInt(reader.readLine());
		System.out.print("만난날(월) : ");
		int meetMonth = Integer.parseInt(reader.readLine());
		System.out.print("만난날(일) : ");
		int meetDay = Integer.parseInt(reader.readLine());


		Calendar meet = Calendar.getInstance();

		System.out.printf("\'%s\'과(와) \'%s\'의 기념일\n",manName,womanName);
		meet.add(Calendar.DATE,100);
		System.out.printf("100일 : %tF \n",meet);
		meet.add(Calendar.DATE,100);
		System.out.printf("200일 : %tF \n",meet);
		meet.add(Calendar.DATE,100);
		System.out.printf("300일 : %tF \n",meet);
		meet.add(Calendar.DATE,200);
		System.out.printf("500일 : %tF \n",meet);
		meet.add(Calendar.DATE,500);
		System.out.printf("1000일 : %tF \n",meet);

	}

	public static void ex4 () throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("아빠 생일(년) : ");
		int fatherBirthYear = Integer.parseInt(reader.readLine());
		System.out.print("아빠 생일(월) : ");
		int fatherBirthMonth = Integer.parseInt(reader.readLine());
		System.out.print("아빠 생일(일) : ");
		int fatherBirthDay = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(년) : ");
		int daughterBirthYear = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(월) : ");
		int daughterBirthMonth = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(일) : ");
		int daughterBirthDay = Integer.parseInt(reader.readLine());

		Calendar father = Calendar.getInstance();
		father.set(fatherBirthYear,fatherBirthMonth,fatherBirthDay);
		Calendar daughter = Calendar.getInstance();
		daughter.set(daughterBirthYear,daughterBirthMonth,daughterBirthDay);

		long fatherMillis = father.getTime().getTime()/1000/60/60/24;
		long daughterMillis = daughter.getTime().getTime()/1000/60/60/24;
		long fatherDaughterDifference = daughterMillis-fatherMillis;

		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n",fatherDaughterDifference);

	}

	public static void ex5() throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		int receiveHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int receiveMinute = Integer.parseInt(reader.readLine());

		int jajangmyeon = 10;
		int chicken = 18;
		int pizza = 25;

		int jajangmyeonHour = receiveMinute-jajangmyeon>0 ? receiveHour : receiveHour-1;
		int jajangmyeonMinute = receiveMinute-jajangmyeon>0 ? receiveMinute-jajangmyeon : receiveMinute+60-jajangmyeon;

		int chickenHour	= receiveMinute-chicken>0 ? receiveHour : receiveHour-1;
		int chickenMinute = receiveMinute-chicken>0 ? receiveMinute-chicken : receiveMinute+60-chicken;

		int pizzaHour = receiveMinute-pizza>0 ? receiveHour : receiveHour-1;
		int pizzaMinute = receiveMinute-pizza>0 ? receiveMinute-pizza : receiveMinute+60-pizza;

		System.out.printf("짜장면 : %d시 %d분 \n",jajangmyeonHour,jajangmyeonMinute);
		System.out.printf("치킨 : %d시 %d분\n",chickenHour,chickenMinute);
		System.out.printf("피자 : %d시 %d분\n",pizzaHour,pizzaMinute);

	}

	public static void line() {
		System.out.println("============================");
	}
}
