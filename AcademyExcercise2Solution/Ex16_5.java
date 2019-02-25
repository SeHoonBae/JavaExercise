import java.io.*;

class Ex16_5 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("¹®ÀÚ : ");
		char smallLetter = reader.readLine().charAt(0);
		int s=(int)smallLetter-32;
		System.out.println((char)s);


	}
}
