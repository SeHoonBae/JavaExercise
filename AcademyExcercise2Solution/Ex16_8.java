import java.io.*;

class Ex16_8 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		char eng = reader.readLine().charAt(0);
		int engNum = (int)eng;

		String a = engNum>=65&&eng<=90?"�빮���Դϴ�." : "�ҹ����Դϴ�";

		System.out.printf("\'%c\'�� %s\n",eng,a);
	}
}
