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
		System.out.printf("���� : %tF\n",birth);

		birth = Calendar.getInstance();
		birth.add(Calendar.YEAR,1);
		System.out.printf("ù�� : %tF\n",birth);
	}

	public static void ex2 () throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�¾ �⵵ : ");
		int birth = Integer.parseInt(reader.readLine());

		Calendar current = Calendar.getInstance();
		System.out.printf("���� : %d�� \n",current.get(Calendar.YEAR)-birth+1);

	}

	public static void ex3 () throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� �̸� : ");
		String manName=reader.readLine();
		System.out.print("���� �̸� : ");
		String womanName=reader.readLine();
		System.out.print("������(��) : ");
		int meetYear = Integer.parseInt(reader.readLine());
		System.out.print("������(��) : ");
		int meetMonth = Integer.parseInt(reader.readLine());
		System.out.print("������(��) : ");
		int meetDay = Integer.parseInt(reader.readLine());


		Calendar meet = Calendar.getInstance();

		System.out.printf("\'%s\'��(��) \'%s\'�� �����\n",manName,womanName);
		meet.add(Calendar.DATE,100);
		System.out.printf("100�� : %tF \n",meet);
		meet.add(Calendar.DATE,100);
		System.out.printf("200�� : %tF \n",meet);
		meet.add(Calendar.DATE,100);
		System.out.printf("300�� : %tF \n",meet);
		meet.add(Calendar.DATE,200);
		System.out.printf("500�� : %tF \n",meet);
		meet.add(Calendar.DATE,500);
		System.out.printf("1000�� : %tF \n",meet);

	}

	public static void ex4 () throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ƺ� ����(��) : ");
		int fatherBirthYear = Integer.parseInt(reader.readLine());
		System.out.print("�ƺ� ����(��) : ");
		int fatherBirthMonth = Integer.parseInt(reader.readLine());
		System.out.print("�ƺ� ����(��) : ");
		int fatherBirthDay = Integer.parseInt(reader.readLine());
		System.out.print("�� ����(��) : ");
		int daughterBirthYear = Integer.parseInt(reader.readLine());
		System.out.print("�� ����(��) : ");
		int daughterBirthMonth = Integer.parseInt(reader.readLine());
		System.out.print("�� ����(��) : ");
		int daughterBirthDay = Integer.parseInt(reader.readLine());

		Calendar father = Calendar.getInstance();
		father.set(fatherBirthYear,fatherBirthMonth,fatherBirthDay);
		Calendar daughter = Calendar.getInstance();
		daughter.set(daughterBirthYear,daughterBirthMonth,daughterBirthDay);

		long fatherMillis = father.getTime().getTime()/1000/60/60/24;
		long daughterMillis = daughter.getTime().getTime()/1000/60/60/24;
		long fatherDaughterDifference = daughterMillis-fatherMillis;

		System.out.printf("�ƺ��� ������ �� %,d���� �� ��ҽ��ϴ�.\n",fatherDaughterDifference);

	}

	public static void ex5() throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������ �ޱ� ���ϴ� �ð�");
		System.out.print("�� : ");
		int receiveHour = Integer.parseInt(reader.readLine());
		System.out.print("�� : ");
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

		System.out.printf("¥��� : %d�� %d�� \n",jajangmyeonHour,jajangmyeonMinute);
		System.out.printf("ġŲ : %d�� %d��\n",chickenHour,chickenMinute);
		System.out.printf("���� : %d�� %d��\n",pizzaHour,pizzaMinute);

	}

	public static void line() {
		System.out.println("============================");
	}
}
