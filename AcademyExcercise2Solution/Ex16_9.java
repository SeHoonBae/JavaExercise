import java.io.*;

class Ex16_9 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("¼·¾¾(¡É) : ");
		int regulator = Integer.parseInt(reader.readLine());
		double fahrenheit = regulator*1.8+32;
		System.out.printf("¼·¾¾ %d¡É´Â È­¾¾ %.1f¢µÀÔ´Ï´Ù.\n",regulator,fahrenheit);
	}
}
