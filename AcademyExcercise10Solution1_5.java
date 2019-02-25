package example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcademyExcercise10Solution1_5 {

	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//		q1(reader);
//		q2(reader);
//		q3(reader);
//		q4(reader);
		q5(reader);


	}

private static void q5(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("행을 길이를 입력하세요. : ");
		int row = Integer.parseInt(reader.readLine());
		System.out.print("열을 길이를 입력하세요. : ");
		int col = Integer.parseInt(reader.readLine());

		int[][] table = new int[row][col];
		int num=1;

		for(int i=0; i<=row/2; i++) {
			for(int j=row/2-i; j<=row/2+i; j++) {
				table[i][j]=num;
				num++;
			}
		}

		for(int i=row/2+1; i<row; i++) {
				for(int k=col/2-(col-1-i); k<=col/2+(col-1-i); k++) {
					table[i][k]=num;
					num++;
				}
		}

		for(int[] i : table) {
			for(int j : i)
				System.out.printf("%2d\t",j);
			System.out.println();
		}


	}

	private static void q4(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("행을 길이를 입력하세요. : ");
		int row = Integer.parseInt(reader.readLine());
		System.out.print("열을 길이를 입력하세요. : ");
		int col = Integer.parseInt(reader.readLine());

		int[][] table = new int[row][col];
		int num=1;

		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				table[i][j]=num;
				num++;
			}
			col--;
		}

		for(int[] i : table) {
			for(int j : i)
				System.out.printf("%2d\t",j);
			System.out.println();
		}

	}

	private static void q3(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("행을 길이를 입력하세요. : ");
		int row = Integer.parseInt(reader.readLine());
		System.out.print("열을 길이를 입력하세요. : ");
		int col = Integer.parseInt(reader.readLine());

		int[][] table = new int[row][col];
		int num=1;

		for(int i=0; i<col; i++) {
			for(int j=0; j < row; j++) {
				table[j][i]=num;
				num++;
			}
		}

		for(int[] i : table) {
			for(int j : i)
				System.out.printf("%2d\t",j);
			System.out.println();
		}

	}

	private static void q2(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("행을 길이를 입력하세요. : ");
		int row = Integer.parseInt(reader.readLine());
		System.out.print("열을 길이를 입력하세요. : ");
		int col = Integer.parseInt(reader.readLine());

		int[][] table = new int[row][col];
		int num=25;

		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++) {
				table[i][j]=num;
				num--;
			}

		for(int[] i : table) {
			for(int j : i)
				System.out.printf("%2d\t",j);
			System.out.println();
		}

	}

	private static void q1(BufferedReader reader) throws NumberFormatException, IOException {

		System.out.print("행을 길이를 입력하세요. : ");
		int row = Integer.parseInt(reader.readLine());
		System.out.print("열을 길이를 입력하세요. : ");
		int col = Integer.parseInt(reader.readLine());

		int[][] table = new int[row][col];
		int num=1;

		for(int i=0; i<row; i++) {

			if(i%2==0)
				for(int j=0; j<col; j++) {
					table[i][j]=num;
					num++;
				}
			else {
				for(int j=col-1; j>=0; j-- ) {
					table[i][j]=num;
					num++;
				}
			}
		}

		for(int[] i : table) {
			for (int j : i)
				System.out.printf("%2d\t",j);
			System.out.println();
		}

//		for(int i=0; i<row; i++) {
//			for(int j=0; j<col; j++)
//				System.out.print(table[i][j]+"\t");
//			System.out.println();
//		}


	}

}
