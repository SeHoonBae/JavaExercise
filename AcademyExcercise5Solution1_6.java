import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AcademyExcercise5Solution1_6 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		q1(reader);
		q2(reader);
		q3(reader);
		q4(reader);
		q5(reader);
		q6(reader);

	}

	private static void transferString(int n) {
		if (n == 1)
			System.out.printf("%d -> 하나", n);
		else if (n == 2)
			System.out.printf("%d -> 둘", n);
		else if (n == 3)
			System.out.printf("%d -> 셋", n);
		else if (n == 4)
			System.out.printf("%d -> 넷", n);
		else if (n == 5)
			System.out.printf("%d -> 다섯", n);
		else if (n == 6)
			System.out.printf("%d -> 여섯", n);
		else if (n == 7)
			System.out.printf("%d -> 일곱", n);
		else if (n == 8)
			System.out.printf("%d -> 여덟", n);
		else if (n == 9)
			System.out.printf("%d -> 아홉", n);
		else
			System.out.printf("%d -> 열", n);
		System.out.println();
	}

	private static void q6(BufferedReader reader) throws Exception {

		int even = 0;
		int odd = 0;

		System.out.print("숫자 입력 : ");
		int one = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int two = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int three = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int four = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력 : ");
		int five = Integer.parseInt(reader.readLine());

		if (one >= 1 && one <= 10 && two >= 1 && two <= 10 && three >= 1 && three <= 10 && four >= 1 && four <= 10
				&& five >= 1 && five <= 10) {
			if (one % 2 == 0) even++;
			else	odd++;

			if (two % 2 == 0) even++;
			else	odd++;

			if (three % 2 == 0) even++;
			else	odd++;

			if (four % 2 == 0) even++;
			else	odd++;

			if (five % 2 == 0) even++;
			else	odd++;

			transferString(one);
			transferString(two);
			transferString(three);
			transferString(four);
			transferString(five);

			if (even > odd) {

				System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n짝수가 홀수보다 %d개 더 많습니다", even, odd, even - odd);
			} else if (odd > even) {
				System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n홀수가 짝수보다 %d개 더 많습니다", even, odd, odd - even);
			}
		} else
			System.out.println("입력창에 1~10사이의 수를 입력하세요");
	}

	private static void q5(BufferedReader reader) throws Exception {

		System.out.print("문자 : ");
		char text = reader.readLine().charAt(0);

		int intText = (int) text;

		if (intText >= 97 && intText <= 122)
			intText -= 32;
		else if (intText >= 65 && intText <= 90)
			intText += 32;

		text = (char) intText;

		System.out.println(text);

		// a 97 z 122 A 65 Z 90
	}

	private static void q4(BufferedReader reader) throws Exception {

		System.out.print("문자 : ");
		char text = reader.readLine().charAt(0);

		if (text == 'f' || text == 'F')
			System.out.printf("f,F -> Father");
		else if (text == 'm' || text == 'M')
			System.out.printf("m,M -> Mother");
		else if (text == 's' || text == 'S')
			System.out.printf("s,S -> Sister");
		else if (text == 'b' || text == 'B')
			System.out.printf("b,B -> Brother");
		else
			System.out.println("f,F,m,M,s,S,b,B 중에 하나를 입력하세요");

	}

	private static void q3(BufferedReader reader) throws Exception {

		System.out.print("첫번째 숫자 : ");
		int first = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		int second = Integer.parseInt(reader.readLine());
		System.out.print("연산자 : ");
		String operator = reader.readLine();

		int result = 0;

		if (operator.equals("+")) {
			result = first + second;
			System.out.printf("%d %s %d = %d", first, operator, second, result);
		}

		else if (operator.equals("-")) {

			result = first - second;
			System.out.printf("%d %s %d = %d", first, operator, second, result);
		}

		else if (operator.equals("/")) {
			result = first / second;
			System.out.printf("%d %s %d = %.1f", first, operator, second, (double) result);
		}

		else if (operator.equals("*")) {
			result = first * second;
			System.out.printf("%d %s %d = %d", first, operator, second, result);
		} else if (operator.equals("%")) {
			result = first % second;
			System.out.printf("%d %s %d = %d", first, operator, second, result);
		} else
			System.out.println("연산자를 다시 입력하세요.");

	}

	private static void q2(BufferedReader reader) throws Exception {

		char a;

		System.out.print("점수 : ");
		int score = Integer.parseInt(reader.readLine());

		if (score >= 0 && score <= 100) {
			if (score >= 90)
				a = 'A';
			else if (score >= 80)
				a = 'B';
			else if (score >= 70)
				a = 'C';
			else if (score >= 60)
				a = 'D';
			else
				a = 'F';
			System.out.printf("입력한 %d점은 성적 %c입니다.\n", score, a);
		} else
			System.out.println("0~100 범위내의 숫자를 입력하세요.");

	}

	public static void q1(BufferedReader reader) throws Exception {

		System.out.print("첫번째 숫자 : ");
		int first = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		int second = Integer.parseInt(reader.readLine());

		int subtract = 0;
		if (first > second) {
			System.out.printf("큰수는 %d이고, 작은수는 %d 입니다.\n", first, second);
			subtract = first - second;
			System.out.printf("입력한 두 숫자는 %d가 차이납니다.\n", subtract);
		} else if (second > first) {
			System.out.printf("큰수는 %d이고, 작은수는 %d 입니다.\n", second, first);
			subtract = second - first;
			System.out.printf("입력한 두 숫자는 %d가 차이납니다.\n", subtract);
		} else
			System.out.println("입력한 두수는 같습니다.");

	}
}
