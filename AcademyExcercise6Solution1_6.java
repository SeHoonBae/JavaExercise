package example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcademyExcercise6Solution1_6 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for_1(reader);
		for_2(reader);
		for_3(reader);
		for_4(reader);
		for_5(reader);
		for_6(reader);

	}

	private static void for_6(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("시작 숫자를 입력하세요 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자를 입력하세요 : ");
		int endNum = Integer.parseInt(reader.readLine());

		int sum=0;
		int i;

		boolean flag= true;

		for(i = startNum; i<endNum; i++) {
			if(flag) {
				System.out.print(i+" - ");
				flag = false;
				sum += i;
			} else {
				sum -= i;
				System.out.print(i+" + ");
				flag = true;
			}
		}

		if(flag) sum += i;
		else sum -= i;

		System.out.println(i+" = "+sum);

	}

	private static void for_5(BufferedReader reader) throws Exception {

		System.out.print("시작 숫자를 입력하세요 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자를 입력하세요 : ");
		int endNum = Integer.parseInt(reader.readLine());

		int i;
		int sum=0;

		for(i = startNum; i<endNum; i++) {
			System.out.print(i+" + ");
			sum += i;
		}
		System.out.print(i+" = ");
		System.out.println(sum+i);


	}

	private static void for_4(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("몇개의 숫자를 입력하시겠습니까?(숫자로 적으세요.)");
		int endNum = Integer.parseInt(reader.readLine());

		int oddSum=0;
		int evenSum=0;

		for(int i=0; i<endNum; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());

			if(num%2 == 0) evenSum += num;
			else oddSum += num;
		}

		System.out.printf("짝수의 합 : %,d\n",evenSum);
		System.out.printf("홀수의 합 : %,d\n",oddSum);

	}

	private static void for_3(BufferedReader reader) throws NumberFormatException, IOException {


		System.out.print("숫자 : ");
		int endNum = Integer.parseInt(reader.readLine());

		int sum = 0;

		for(int i=1; i<=endNum; i++) sum+=i;
		System.out.printf("1~%d = %d\n",endNum,sum);

	}

	private static void for_2(BufferedReader reader) throws NumberFormatException, IOException {


		System.out.print("시작 숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		int endNum = Integer.parseInt(reader.readLine());

		for(int i = startNum ; i<=endNum; i++)System.out.println(i);

	}

	private static void for_1(BufferedReader reader) throws IOException {


		System.out.print("이름 : ");
		String name = reader.readLine();
		System.out.print("횟수 : ");
		int cnt = Integer.parseInt(reader.readLine());

		for(int i=0; i<cnt; i++) System.out.printf("%s님 안녕하세요~\n",name);

	}
}
