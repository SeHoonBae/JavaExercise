import java.io.*;

class Ex16_9 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("����(��) : ");
		int regulator = Integer.parseInt(reader.readLine());
		double fahrenheit = regulator*1.8+32;
		System.out.printf("���� %d�ɴ� ȭ�� %.1f���Դϴ�.\n",regulator,fahrenheit);
	}
}
