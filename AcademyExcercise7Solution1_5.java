import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcademyExcercise7Solution1_5 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		q1(reader);
		q2(reader);
		q3(reader);
		q4(reader);
		q5(reader);

	}

	private static void q5(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("몇행까지 출력하시겠습니까? : ");
		int lineNum = Integer.parseInt(reader.readLine());

		for(int i=0; i<lineNum; i++) {
			for(int a = lineNum-1; a>i; a-- ) System.out.print(" ");
			for(int j = 97; j<=97+i; j++) System.out.print((char)j);
			for(int k = 97+i;k>=97; k--) System.out.print((char)k);

			System.out.println();
		}

	}

	private static void q4(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("몇행까지 출력하시겠습니까? : ");
		int lineNum = Integer.parseInt(reader.readLine());

		for(int i=0; i<lineNum; i++) {
			for(int j=0; j<=i; j++) System.out.print(" ");
			System.out.print("*");
			System.out.println();
		}

	}

	private static void q3(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("몇행까지 출력하시겠습니까? : ");
		int lineNum = Integer.parseInt(reader.readLine());

		for(int i=1; i<lineNum+1; i++) {

			for(int j=lineNum; j>i; j--) System.out.print(" ");
			for(int j=0; j<2*i-1; j++) System.out.print("*");
			System.out.println();

		}


	}

	private static void q2(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("몇행까지 출력하시겠습니까? : ");
		int lineNum = Integer.parseInt(reader.readLine());

		for(int i=0; i<lineNum; i++) {

			for(int j=lineNum-1; j>i; j--) System.out.print(" ");
			for(int j=0; j<i+1; j++) System.out.print("*");
			System.out.println();
		}

	}

	private static void q1(BufferedReader reader) throws NumberFormatException, IOException {
		System.out.print("몇행까지 출력하시겠습니까? : ");
		int lineNum = Integer.parseInt(reader.readLine());

		for(int i=0; i<lineNum; i++) {

			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}

			for(int j=i; j<lineNum; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	}


