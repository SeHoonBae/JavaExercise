import java.io.*;

class Ex16_4 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("����ڰ� ���� ��޼� : ");
		int pedal = Integer.parseInt(reader.readLine());
		System.out.printf("����ڰ� �� %,dȸ�� ����� ��� �� %,.0fm�� �޷Ƚ��ϴ�.",pedal,pedal*2.07);

	}
}
