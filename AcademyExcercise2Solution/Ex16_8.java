import java.io.*;

class Ex16_8 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		char eng = reader.readLine().charAt(0);
		int engNum = (int)eng;

		String a = engNum>=65&&eng<=90?"대문자입니다." : "소문자입니다";

		System.out.printf("\'%c\'는 %s\n",eng,a);
	}
}
