import java.io.*;

class Ex16_4 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("사용자가 밟은 페달수 : ");
		int pedal = Integer.parseInt(reader.readLine());
		System.out.printf("사용자가 총 %,d회의 페달을 밟아 총 %,.0fm를 달렸습니다.",pedal,pedal*2.07);

	}
}
